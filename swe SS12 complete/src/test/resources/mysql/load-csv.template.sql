USE ${dbname.mysql};

LOAD DATA LOCAL INFILE '@CSVDIR@/kunde.csv'
INTO TABLE kunde
FIELDS TERMINATED BY ';'
OPTIONALLY ENCLOSED BY '"'
IGNORE 1 LINES;

LOAD DATA LOCAL INFILE '@CSVDIR@/adresse.csv'
INTO TABLE adresse
FIELDS TERMINATED BY ';'
OPTIONALLY ENCLOSED BY '"'
IGNORE 1 LINES;

LOAD DATA LOCAL INFILE '@CSVDIR@/bestellposition.csv'
INTO TABLE bestellposition
FIELDS TERMINATED BY ';'
OPTIONALLY ENCLOSED BY '"'
IGNORE 1 LINES;

LOAD DATA LOCAL INFILE '@CSVDIR@/bestellung.csv'
INTO TABLE bestellung
FIELDS TERMINATED BY ';'
OPTIONALLY ENCLOSED BY '"'
IGNORE 1 LINES;

LOAD DATA LOCAL INFILE '@CSVDIR@/autohersteller.csv'
INTO TABLE autohersteller
FIELDS TERMINATED BY ';'
OPTIONALLY ENCLOSED BY '"'
IGNORE 1 LINES;

LOAD DATA LOCAL INFILE '@CSVDIR@/fahrzeug.csv'
INTO TABLE fahrzeug
FIELDS TERMINATED BY ';'
OPTIONALLY ENCLOSED BY '"'
IGNORE 1 LINES;

LOAD DATA LOCAL INFILE '@CSVDIR@/shop_role.csv'
INTO TABLE shop_role
FIELDS TERMINATED BY ';'
OPTIONALLY ENCLOSED BY '"'
IGNORE 1 LINES;