package io.nology.quadra.moneyapp.service;

import io.nology.quadra.moneyapp.model.Currency;
import io.nology.quadra.moneyapp.model.CurrencyRates;

import java.util.List;

public interface CurrencyService {

    CurrencyRates getCurrencyRates(String base);

    List<Currency> getCurrencies();

}
