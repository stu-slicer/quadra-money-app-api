package io.nology.quadra.moneyapp.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.nology.quadra.moneyapp.model.Currency;
import io.nology.quadra.moneyapp.model.CurrencyRates;
import io.nology.quadra.moneyapp.model.CurrencySymbols;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

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

@Component
public class JsonCurrencyService implements CurrencyService {

    public static final String CURRENCY_JSON = "symbols.json";

    @Autowired
    private CurrencyConverter currencyConverter;

    @Autowired
    private ObjectMapper objectMapper;

    @Value("${currency.json.base-dir}")
    private String fileBasePath;

    @Value("${currency.valid:}")
    private String validCurrencies;
    private List<String> currencyFilters = new ArrayList<>();

    @Override
    public CurrencyRates getCurrencyRates(String base) {
        File file = getCurrencyFilePath(base).toFile();
        try {
            CurrencyRates currencyRates = objectMapper.readValue( file, CurrencyRates.class );
            return currencyRates;
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

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

    /**
     * Is the {@link RuntimeException} wrapping a {@link FileNotFoundException} exception?
     * @param e
     * @return
     */
    private static boolean isFileNotFound(UncheckedIOException e) {
        return e.getCause() != null && e.getCause().getClass().equals(FileNotFoundException.class);
    }

    private Path getCurrencyFilePath(String base) {
        return Paths.get( fileBasePath, base.trim().toLowerCase() + "-rates.json" );
    }

    private Path getSymbolFilePath() {
        return Paths.get( fileBasePath, CURRENCY_JSON );
    }

    @PostConstruct
    void prepareCurrencyFilter() {
        if( this.validCurrencies == null || "".equals( this.validCurrencies.trim())) {
            return;
        }

        String[] tokens = this.validCurrencies.toUpperCase().trim().split(",");
        this.currencyFilters = Arrays.stream( tokens )
                .map( String::trim )
                .filter( code -> ! "".equals( code) )
                .collect(Collectors.toList());

    }

}
