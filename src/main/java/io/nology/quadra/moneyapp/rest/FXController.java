package io.nology.quadra.moneyapp.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import java.util.NoSuchElementException;

import static io.nology.quadra.moneyapp.MoneyAppConstants.HTTP_API_ALL_EXCHANGERATES;
import static io.nology.quadra.moneyapp.MoneyAppConstants.HTTP_API_EXCHANGE_RATE;

//@RestController
//@CrossOrigin(origins = {ORIGIN_LOCALHOST_1, ORIGIN_LOCALHOST_2 })
@Deprecated
public class FXController {

    @GetMapping("/currencies")
    private ResponseEntity<Object> getCurrencies() {
        try {
            String url = HTTP_API_ALL_EXCHANGERATES;
            RestTemplate restTemplate = new RestTemplate();
            Object currencies = restTemplate.getForObject(url, Object.class);
            return ResponseEntity.status(HttpStatus.OK).body(currencies);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/currencies/{currency}")
    public ResponseEntity<Object> getByBaseCurrency(@PathVariable String currency) {
        try {
            String url = HTTP_API_EXCHANGE_RATE + currency;
            RestTemplate restTemplate = new RestTemplate();
            Object currencies = restTemplate.getForObject(url, Object.class);
            return ResponseEntity.status(HttpStatus.OK).body(currencies);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}

