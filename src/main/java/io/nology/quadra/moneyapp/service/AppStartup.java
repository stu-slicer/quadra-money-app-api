package io.nology.quadra.moneyapp.service;

import io.nology.quadra.moneyapp.model.CurrencyRates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

//@Component
public class AppStartup implements CommandLineRunner {

    @Autowired
    private JpaCurrencyService currencyService;

//    @Autowired
//    private WebCurrencyService webCurrencyService;

    @Override
    public void run(String... args) throws Exception {
        CurrencyRates currencyRates = currencyService.getCurrencyRates("GBP");
        System.out.println("currencyRates = " + currencyRates);
    }
}
