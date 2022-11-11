drop database if exists Usuarios; 

create database Usuarios; 

use Usuarios; 

create table Registro_usuario ( 

id		int				primary key 		auto_increment 		unique		not null, 

nome 	varchar (60), 

email 	varchar (60), 

cel int, 

cpf int, 

cep int  
); 

create table Registro_produto( 

id_produto	int		primary key 		auto_increment		unique 		not null, 

imagem_produto varchar(120), 

nome_produto varchar(120), 

descri_produto varchar(684), 

preco_produto decimal(20,2) ,

FK_vendedor int references Registro_usuario (id)

); 