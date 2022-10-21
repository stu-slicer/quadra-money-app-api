package io.nology.quadra.moneyapp.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.nology.quadra.moneyapp.model.Currency;
import io.nology.quadra.moneyapp.model.CurrencyRates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Component
public class JsonCurrencyService implements CurrencyService {

    @Autowired
    private ObjectMapper objectMapper;

    @Value("${currency.json.base-dir}")
    private String fileBasePath;

    @Override
    public CurrencyRates getCurrencyRates(String base) {
        File file = getCurrentFilePath(base).toFile();
        try {
            CurrencyRates currencyRates = objectMapper.readValue( file, CurrencyRates.class );
            return currencyRates;
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public List<Currency> getCurrencies() {
        return null;
    }

    /**
     * Is the {@link RuntimeException} wrapping a {@link FileNotFoundException} exception?
     * @param e
     * @return
     */
    private static boolean isFileNotFound(UncheckedIOException e) {
        return e.getCause() != null && e.getCause().getClass().equals(FileNotFoundException.class);
    }

    private Path getCurrentFilePath(String base) {
        return Paths.get( fileBasePath, base.trim().toLowerCase() + "-rates.json" );
    }

}
