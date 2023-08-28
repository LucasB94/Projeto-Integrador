CREATE DATABASE Restaurante;

USE Restaurante;

CREATE TABLE Cadastro (
id int NOT NULL AUTO_INCREMENT,
nome varchar(70) NOT NULL,
contato varchar(70) NOT NULL,
CPF varchar(70) NOT NULL,
email varchar(70) NOT NULL,
PRIMARY KEY (id)
);

CREATE TABLE Reserva (
id int NOT NULL AUTO_INCREMENT,
nome varchar(70) NOT NULL,
contato varchar(70) NOT NULL,
email varchar(70) NOT NULL,
PRIMARY KEY(id)
);

CREATE TABLE Ajuda (
id int NOT NULL AUTO_INCREMENT,
escrita varchar(255) NOT NULL,
PRIMARY KEY(id)
);

SELECT * FROM Cadastro;
SELECT * FROM Reserva;
SELECT * FROM Ajuda;