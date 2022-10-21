package io.nology.quadra.moneyapp;

public interface MoneyAppConstants {

    String BASE_CURRENCY = "GNP";

    String SERVICE_PREFIX = "/quadra-money/v1";

    String ORIGIN_LOCALHOST_1 = "http://localhost:3000";
    String ORIGIN_LOCALHOST_2 = "http://localhost:3001";

    String HTTP_API_ALL_EXCHANGERATES = "http://api.exchangeratesapi.io/v1/latest?access_key=a5d70fa4b404edb100ef0ebff23d52bc&format=1&base=GBP";
    String HTTP_API_EXCHANGE_RATE = "http://api.exchangeratesapi.io/v1/latest?access_key=a5d70fa4b404edb100ef0ebff23d52bc&format=1&base=";

}
