SET sql_mode='';
CREATE TABLE `fruit_shop_exam`.`trade` (
  `tr_num` INT NOT NULL AUTO_INCREMENT,
  `tr_amount` INT NOT NULL,
  `tr_type` VARCHAR(4) NOT NULL DEFAULT 'sell',
  `tr_date` DATE NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `tr_price` INT NOT NULL,
  `tr_fr_name` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`tr_num`));
