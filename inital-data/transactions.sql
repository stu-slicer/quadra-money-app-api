DELETE FROM money.transactions;

INSERT INTO money.transactions (transaction_id, amount_from, amount_to, currency_code_from, currency_code_to, fee, rate, user_id_from, user_id_to) VALUES (1, 1000, 1146.29, 'GBP', 'EUR', 12.5, 1.15, '10001', '10002');
INSERT INTO money.transactions (transaction_id, amount_from, amount_to, currency_code_from, currency_code_to, fee, rate, user_id_from, user_id_to) VALUES (2, 1000, 1131.72, 'GBP', 'USD', 12.5, 1.13, '10001', '10002');
INSERT INTO money.transactions (transaction_id, amount_from, amount_to, currency_code_from, currency_code_to, fee, rate, user_id_from, user_id_to) VALUES (3, 1000, 1131.72, 'GBP', 'USD', 12.5, 1.13, '10001', '10002');
INSERT INTO money.transactions (transaction_id, amount_from, amount_to, currency_code_from, currency_code_to, fee, rate, user_id_from, user_id_to) VALUES (4, 1000, 1131.72, 'GBP', 'USD', 12.5, 1.13, '10002', '10001');
