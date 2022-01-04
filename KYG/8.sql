INSERT INTO fruit(fr_name, fr_price) values('딸기', 15000);
INSERT INTO trade(tr_amount, tr_type, tr_date, tr_price, tr_fr_name)
	values(100, 'buy', '2021-06-15', 10000, '딸기');
INSERT INTO trade(tr_amount, tr_date, tr_price, tr_fr_name)
	values(1, '2021-06-15', 15000, '딸기');
SELECT sum(tr_price) as '총판매액', tr_date from trade
	where tr_date = '2021-06-15' AND tr_type = 'sell';
SELECT fr_amount from fruit;
