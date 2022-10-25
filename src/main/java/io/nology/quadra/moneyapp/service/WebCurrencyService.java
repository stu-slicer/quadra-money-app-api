package io.nology.quadra.moneyapp.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.nology.quadra.moneyapp.model.Currency;
import io.nology.quadra.moneyapp.model.CurrencyAPIResponse;
import io.nology.quadra.moneyapp.model.CurrencyRates;
import io.nology.quadra.moneyapp.repos.CurrencyAPIResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.List;

import static io.nology.quadra.moneyapp.MoneyAppConstants.HTTP_API_EXCHANGE_RATE;

@Component
public class WebCurrencyService implements CurrencyService {

    private RestTemplate restTemplate = new RestTemplate();

    @Autowired
    private CurrencyAPIResponseRepository currencyAPIResponseRepository;
    @Autowired
    private ObjectMapper objectMapper;
    @Value("${currency.api.key:}")
    private String apiKey;

    @Override
    public CurrencyRates getCurrencyRates(String base) {
        String url = HTTP_API_EXCHANGE_RATE + base.trim().toUpperCase();
        System.out.println(url);

        HttpEntity request = new HttpEntity(buildHeaders());
        ResponseEntity<CurrencyRates> res = restTemplate.exchange(url, HttpMethod.GET, request, CurrencyRates.class);

        CurrencyRates currencies = res.getBody();
//        System.out.println(currencies);
        saveCurrentAPIResponse(currencies);

        return currencies;
    }

    private void saveCurrentAPIResponse(CurrencyRates currencyRates) {
        try {
            String asString = objectMapper.writeValueAsString(currencyRates);
            System.out.println(asString);
            CurrencyAPIResponse response = new CurrencyAPIResponse();
            response.setResponse(asString);
            response.setCurrencyCode(currencyRates.getBase());
            response.setLoaded(LocalDateTime.now());

            currencyAPIResponseRepository.save(response);
            System.out.println("Saved an entry!!");
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    private HttpHeaders buildHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));
        headers.set("apikey", apiKey);
        return headers;
    }

    @Override
    public List<Currency> getCurrencies() {
        throw new UnsupportedOperationException();
    }
}
