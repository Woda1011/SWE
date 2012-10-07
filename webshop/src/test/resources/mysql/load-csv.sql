USE ${dbname.mysql};

LOAD DATA LOCAL INFILE 'D:/swe/eclipse-workspace-git/swe/webshop/src/test/resources/mysql/hibernate_sequence.csv'
INTO TABLE hibernate_sequence
FIELDS TERMINATED BY ';'
OPTIONALLY ENCLOSED BY '"'
IGNORE 1 LINES;

LOAD DATA LOCAL INFILE 'D:/swe/eclipse-workspace-git/swe/webshop/src/test/resources/mysql/kunde.csv'
INTO TABLE kunde
FIELDS TERMINATED BY ';'
OPTIONALLY ENCLOSED BY '"'
IGNORE 1 LINES;

LOAD DATA LOCAL INFILE 'D:/swe/eclipse-workspace-git/swe/webshop/src/test/resources/mysql/adresse.csv'
INTO TABLE adresse
FIELDS TERMINATED BY ';'
OPTIONALLY ENCLOSED BY '"'
IGNORE 1 LINES;
--
--LOAD DATA LOCAL INFILE 'D:/swe/eclipse-workspace-git/swe/webshop/src/test/resources/mysql/wartungsvertrag.csv'
--INTO TABLE wartungsvertrag
--FIELDS TERMINATED BY ';'
--OPTIONALLY ENCLOSED BY '"'
--IGNORE 1 LINES;
--
--LOAD DATA LOCAL INFILE 'D:/swe/eclipse-workspace-git/swe/webshop/src/test/resources/mysql/bestellung.csv'
--INTO TABLE bestellung
--FIELDS TERMINATED BY ';'
--OPTIONALLY ENCLOSED BY '"'
--IGNORE 1 LINES;
--
--LOAD DATA LOCAL INFILE 'D:/swe/eclipse-workspace-git/swe/webshop/src/test/resources/mysql/artikel.csv'
--INTO TABLE artikel
--FIELDS TERMINATED BY ';'
--OPTIONALLY ENCLOSED BY '"'
--IGNORE 1 LINES;
--
--LOAD DATA LOCAL INFILE 'D:/swe/eclipse-workspace-git/swe/webshop/src/test/resources/mysql/bestellposition.csv'
--INTO TABLE bestellposition
--FIELDS TERMINATED BY ';'
--OPTIONALLY ENCLOSED BY '"'
--IGNORE 1 LINES;
--
--LOAD DATA LOCAL INFILE 'D:/swe/eclipse-workspace-git/swe/webshop/src/test/resources/mysql/lieferung.csv'
--INTO TABLE lieferung
--FIELDS TERMINATED BY ';'
--OPTIONALLY ENCLOSED BY '"'
--IGNORE 1 LINES;
--
--LOAD DATA LOCAL INFILE 'D:/swe/eclipse-workspace-git/swe/webshop/src/test/resources/mysql/bestellung_lieferung.csv'
--INTO TABLE bestellung_lieferung
--FIELDS TERMINATED BY ';'
--OPTIONALLY ENCLOSED BY '"'
--IGNORE 1 LINES;
