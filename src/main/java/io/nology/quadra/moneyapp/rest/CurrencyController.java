package io.nology.quadra.moneyapp.rest;

import io.nology.quadra.moneyapp.model.Currency;
import io.nology.quadra.moneyapp.model.CurrencyRates;
import io.nology.quadra.moneyapp.service.CurrencyService;
import io.nology.quadra.moneyapp.service.JpaCurrencyService;
import io.nology.quadra.moneyapp.service.WebCurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.util.List;

import static io.nology.quadra.moneyapp.MoneyAppConstants.*;

@RestController
@RequestMapping(path = SERVICE_PREFIX)
@CrossOrigin()
public class CurrencyController {

    @Autowired
    private WebCurrencyService webCurrencyService;

    @Autowired
    private JpaCurrencyService jpaCurrencyService;

    @GetMapping("/currencies")
    public ResponseEntity<CurrencyRates> getCurrencies() {
        return getByBaseCurrency( BASE_CURRENCY, false );
    }

    @GetMapping("/currency-symbols")
    public ResponseEntity<List<Currency>> getCurrencySymbols() {
        return ResponseEntity.status(HttpStatus.OK).body( this.jpaCurrencyService.getCurrencies() );
    }

    @GetMapping("/currencies/{currency}")
    public ResponseEntity<CurrencyRates> getByBaseCurrency(@PathVariable String currency,
                                                           @RequestParam(required = false, defaultValue = "false") boolean live) {
        CurrencyRates currencyRates = getCurrencyRates(currency, live);
        return ResponseEntity.status(HttpStatus.OK).body(currencyRates);
    }

    private CurrencyRates getCurrencyRates(String currency, boolean live) {
        if (!live) {
            CurrencyRates currencyRatesFromDb = jpaCurrencyService.getCurrencyRates(currency);
            if (currencyRatesFromDb != null) {
                return currencyRatesFromDb;
            }
        }
        CurrencyRates currencyRatesFromWeb = webCurrencyService.getCurrencyRates(currency);
        return currencyRatesFromWeb;
    }

    /**
     * Is the {@link RuntimeException} wrapping a {@link FileNotFoundException} exception?
     *
     * @param e
     * @return
     */
    private static boolean isFileNotFound(Exception e) {
        return e.getCause() != null && e.getCause().getClass().equals(FileNotFoundException.class);
    }
}
