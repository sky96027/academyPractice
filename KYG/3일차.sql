create database fruit_kyg;

CREATE TABLE `fruit` (
	`fr_name`	varchar(30)	NOT NULL,
	`fr_price`	int	not NULL default 0,
	`fr_amount`	int	not NULL default 0,
	`fr_unit`	varchar(10)	NULL
);

CREATE TABLE `buy` (
	`bu_num`	int	NOT NULL auto_increment,
	`bu_fr_name`	varchar(30)	NOT NULL,
	`bu_amount`	int	not NULL default 0,
	`bu_date`	datetime	not NULL default current_timestamp,
	`bu_unit`	varchar(10)	NULL,
	`bu_st_name`	varchar(20)	NOT NULL,
    primary key(`bu_num`)
);

CREATE TABLE `store` (
	`st_name`	varchar(20)	NOT NULL,
	`st_address`	varchar(50)	NULL
);

CREATE TABLE `sell` (
	`se_num`	int	not NULL auto_increment,
	`se_fr_name`	varchar(30)	NOT NULL,
	`se_amount`	int	not NULL default 0,
	`se_unit`	varchar(10)	NULL,
	`se_price`	int	not NULL default 0,
	`se_date`	datetime	not NULL default current_timestamp,
	`se_type`	varchar(4)  not	NULL,
    primary key(`se_num`)
);

ALTER TABLE `fruit` ADD CONSTRAINT `PK_FRUIT` PRIMARY KEY (
	`fr_name`
);

ALTER TABLE `buy` ADD CONSTRAINT `PK_BUY` PRIMARY KEY (
	`bu_num`
);

ALTER TABLE `store` ADD CONSTRAINT `PK_STORE` PRIMARY KEY (
	`st_name`
);

ALTER TABLE `sell` ADD CONSTRAINT `PK_SELL` PRIMARY KEY (
	`se_num`
);
ALTER TABLE `buy` ADD CONSTRAINT `FK_BUY_FRUIT` FOREIGN KEY (
`bu_fr_name`
) REFERENCES `fruit`(`fr_name`);

ALTER TABLE `buy` ADD CONSTRAINT `FK_BUY_STORE` FOREIGN KEY (
`bu_st_name`
) REFERENCES `store`(`st_name`);

ALTER TABLE `sell` ADD CONSTRAINT `FK_SELL_FRUIT` FOREIGN KEY (
`se_fr_name`
) REFERENCES `fruit`(`fr_name`);

