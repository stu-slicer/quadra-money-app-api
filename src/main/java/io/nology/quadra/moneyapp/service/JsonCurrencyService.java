package io.nology.quadra.moneyapp.service;

import io.nology.quadra.moneyapp.model.CurrencyRates;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;

@Component
@Deprecated
public class JsonCurrencyService extends AbstractCurrencyService {

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

}
