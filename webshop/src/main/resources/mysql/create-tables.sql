USE ${dbname.mysql};
SHOW WARNINGS;

DROP TABLE IF EXISTS hibernate_sequence;
CREATE TABLE hibernate_sequence(
	next_val BIGINT NOT NULL PRIMARY KEY
);

DROP TABLE IF EXISTS adresse;
CREATE TABLE adresse (
id BIGINT NOT NULL, 
plz VARCHAR(5) NOT NULL, 
ort VARCHAR(32) NOT NULL, 
strasse VARCHAR(32) NOT NULL, 
hausnummer VARCHAR(8) NOT NULL, 
kunde_fk BIGINT NOT NULL REFERENCES kunde (id), 
adresstyp VARCHAR(255), 
PRIMARY KEY (id));

DROP TABLE IF EXISTS kunde;
CREATE TABLE kunde (
id BIGINT NOT NULL, 
nachname VARCHAR(32) NOT NULL, 
vorname VARCHAR(32) NOT NULL, 
anmeldungsdatum DATE NOT NULL, 
email VARCHAR(64) NOT NULL UNIQUE, 
passwort VARCHAR(32) NOT NULL,
PRIMARY KEY (id));
