package io.nology.quadra.moneyapp.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.nology.quadra.moneyapp.model.Currency;
import io.nology.quadra.moneyapp.model.CurrencySymbols;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractCurrencyService implements CurrencyService {

    public static final String CURRENCY_JSON = "symbols.json";

    /**
     * Currency filters!
     */
    protected List<String> currencyFilters = new ArrayList<>();

    @Autowired
    protected CurrencyConverter currencyConverter;

    @Autowired
    protected ObjectMapper objectMapper;

    @Value("${currency.json.base-dir}")
    protected String fileBasePath;

    @Value("${currency.valid:}")
    protected String validCurrencies;

    @Override
    public List<Currency> getCurrencies() {
        CurrencySymbols symbols = getCurrencySymbols();
        List<Currency> currencies = currencyConverter.convert(symbols.getSymbols());
        if( this.currencyFilters.isEmpty() ) {
            return currencies;
        }
        return currencies.stream()
                .filter(currency -> this.currencyFilters.contains( currency.getCode() ))
                .collect(Collectors.toList());
    }

    private CurrencySymbols getCurrencySymbols() {
        File file = getSymbolFilePath().toFile();
        try {
            CurrencySymbols currencySymbols = objectMapper.readValue( file, CurrencySymbols.class );
            return currencySymbols;
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @PostConstruct
    protected void prepareCurrencyFilter() {
        if( this.validCurrencies == null || "".equals( this.validCurrencies.trim())) {
            return;
        }

        String[] tokens = this.validCurrencies.toUpperCase().trim().split(",");
        this.currencyFilters = Arrays.stream( tokens )
                .map( String::trim )
                .filter( code -> ! "".equals( code) )
                .collect(Collectors.toList());

    }

    /**
     * Is the {@link RuntimeException} wrapping a {@link FileNotFoundException} exception?
     * @param e
     * @return
     */
    protected static boolean isFileNotFound(UncheckedIOException e) {
        return e.getCause() != null && e.getCause().getClass().equals(FileNotFoundException.class);
    }

    protected Path getCurrencyFilePath(String base) {
        return Paths.get( fileBasePath, base.trim().toLowerCase() + "-rates.json" );
    }

    protected Path getSymbolFilePath() {
        return Paths.get( fileBasePath, CURRENCY_JSON );
    }

}
