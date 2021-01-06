CREATE DATABASE ap;
USE ap;
CREATE TABLE pilots (
id INT UNIQUE PRIMARY KEY,
firstname VARCHAR(255),
lastname VARCHAR(255),
rank INT(255),
code VARCHAR(255) UNIQUE
);

CREATE TABLE planes (		
id INT UNIQUE PRIMARY KEY, 
brand VARCHAR(255),
model VARCHAR(255),
passengers_quantity INT,
board_number INT UNIQUE
);

CREATE TABLE flights (
id INT UNIQUE,
pilot VARCHAR(255) NOT NULL REFERENCES pilots (pilot_id),
plane VARCHAR(255) NOT NULL REFERENCES planes (plane_id),
dt DATETIME,
number INT UNIQUE
);
 

