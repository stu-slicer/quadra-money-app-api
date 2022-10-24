package io.nology.quadra.moneyapp.service;

import io.nology.quadra.moneyapp.model.Currency;
import io.nology.quadra.moneyapp.model.CurrencySymbols;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@Component
public class CurrencyConverter {

    public List<Currency> convert(CurrencySymbols.Symbols symbols) {

        List<Currency> currencies = new ArrayList<>();

        // get all methods

        Class<? extends CurrencySymbols.Symbols> symbolsClass = symbols.getClass();

        Field[] declaredFields = symbolsClass.getDeclaredFields();

        List<Field> currencyMethods = new ArrayList<>();

        for (Field declaredField : declaredFields) {
            if( declaredField.getType().equals( String.class ) ) {
                try {
                    String fieldValue = (String) declaredField.get(symbols);
                    Currency currency = new Currency();
                    currency.setCode( declaredField.getName() );
                    currency.setName( fieldValue );

                    currencies.add( currency );
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }

            }
        }

        return currencies;
    }

}
