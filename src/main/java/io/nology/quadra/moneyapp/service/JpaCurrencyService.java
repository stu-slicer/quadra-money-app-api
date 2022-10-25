package io.nology.quadra.moneyapp.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.nology.quadra.moneyapp.model.Currency;
import io.nology.quadra.moneyapp.model.CurrencyAPIResponse;
import io.nology.quadra.moneyapp.model.CurrencyRates;
import io.nology.quadra.moneyapp.repos.CurrencyAPIResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JpaCurrencyService extends AbstractCurrencyService implements CurrencyService {

    @Autowired
    private CurrencyAPIResponseRepository currencyAPIResponseRepository;

    @Override
    public CurrencyRates getCurrencyRates(String base) {
        Optional<CurrencyAPIResponse> byId = currencyAPIResponseRepository.findById(base.trim().toUpperCase());
        if (byId.isPresent()) {
            try {
                CurrencyRates currencyRates = objectMapper.readValue(byId.get().getResponse(), CurrencyRates.class);
                return currencyRates;
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }

    @Override
    public List<Currency> getCurrencies() {
        return null;
    }
}
