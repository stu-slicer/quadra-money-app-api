package io.nology.quadra.moneyapp.rest;

import io.nology.quadra.moneyapp.model.Currency;
import io.nology.quadra.moneyapp.model.CurrencyRates;
import io.nology.quadra.moneyapp.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.util.List;

import static io.nology.quadra.moneyapp.MoneyAppConstants.*;

@RestController
@RequestMapping(path = SERVICE_PREFIX)
@CrossOrigin(origins = {ORIGIN_LOCALHOST_1, ORIGIN_LOCALHOST_2})
public class CurrencyController {

    @Autowired
    private CurrencyService currencyService;

    @GetMapping("/currencies")
    public ResponseEntity<CurrencyRates> getCurrencies() {
        return getByBaseCurrency( BASE_CURRENCY );
    }

    @GetMapping("/currency-symbols")
    public ResponseEntity<List<Currency>> getCurrencySymbols() {
        return ResponseEntity.status(HttpStatus.OK).body( this.currencyService.getCurrencies() );
    }

    @GetMapping("/currencies/{currency}")
    public ResponseEntity<CurrencyRates> getByBaseCurrency(@PathVariable String currency) {
        try {
            CurrencyRates currencyRates = currencyService.getCurrencyRates(currency);
            return ResponseEntity.status(HttpStatus.OK).body(currencyRates);
        } catch (Exception e) {
            if (isFileNotFound(e)) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
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
