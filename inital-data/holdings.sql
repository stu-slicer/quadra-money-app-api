DELETE FROM money.holdings;

INSERT INTO money.holdings (id, amount, currency_code, currency_name, currency_symbol, userid) VALUES (1, 10000, 'GBP', 'British Pound Sterling', '£', '10001');
INSERT INTO money.holdings (id, amount, currency_code, currency_name, currency_symbol, userid) VALUES (2, 7000, 'EUR', 'Euro', 'EUR', '10002');
INSERT INTO money.holdings (id, amount, currency_code, currency_name, currency_symbol, userid) VALUES (3, 3000, 'EUR', 'Euro', 'EUR', '10001');
