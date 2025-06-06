CREATE DATABASE soportetecnicoapp;
USE soportetecnicoapp;

CREATE TABLE auth(
id int primary key auto_increment,
username varchar(50) ,
password varchar(50),
rol varchar(50)
);

create table usuarios(
id int primary key auto_increment,
nombres varchar(50),
apellidos varchar(50),
auth_id int not null unique,
foreign key(auth_id) references auth(id) on delete cascade
);