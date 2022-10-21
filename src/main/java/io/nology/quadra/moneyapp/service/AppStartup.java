package io.nology.quadra.moneyapp.service;

import io.nology.quadra.moneyapp.model.CurrencyRates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppStartup implements CommandLineRunner {

    @Autowired
    private JsonCurrencyService currencyService;

    @Override
    public void run(String... args) throws Exception {
        CurrencyRates currencyRates = currencyService.getCurrencyRates("GBP");
        System.out.println("currencyRates = " + currencyRates);

    }
}
