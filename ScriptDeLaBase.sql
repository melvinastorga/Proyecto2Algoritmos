create database Proyecto_2_Algoritmos
use Proyecto_2_Algoritmos
use master


create table categoria(
id int,
nombre varchar(30),
descripcion varchar(250)
);

create table lote(
id int,
codigoLote varchar(100),
fechaEmpacado varchar(100),
fechaVencimiento varchar(100)
);

create table unidadTransporte(
id int,
placa varchar(20),
capacidad varchar(20),
urlFotografia varchar(500)
);

create table bodega(
id int,
nombre varchar(30),
latitud varchar(30),
longitud varchar(30),
distanciaCentroOperaciones float,
urlFotografia varchar(500)
);
create table usuario(
id int,
nombre varchar(50),
rol bit,
usuario varchar(50),
pass varchar(500),
);
insert usuario values(1,'Andres',0,'operador','operador')
insert usuario values(2,'Melvin',1,'admin','admin')
create table ordenDistribucion(
id int,
idBodegaProcedencia int,
idBodegaDestino int,
montoTotal bigint,
pesoTotal float,
idOperador int
);

create table productoMayorista(
id int,
nombre varchar(30),
unidadMedida varchar(30),
valorUnidad int,
pesoTotal int,
descripcion varchar(500),
idLote int,
idCategoria int,
precioTotal bigint,
urlFotografia varchar(500)
);
create table productoMayoristaPorOrden(
id int,
idOrden int,
nombre varchar(30),
unidadMedida varchar(30),
valorUnidad int,
pesoTotal int,
descripcion varchar(500),
idLote int,
idCategoria int,
precioTotal bigint,
urlFotografia varchar(500)
);
insert productoMayorista values(1,'Arroz','kilogramos',2500,100,'arroz chino',1,1,25000,'imagen')
insert productoMayorista values(2,'Frijoles','kilogramos',1500,70,'frijol chino',1,2,20000,'imagen')
insert productoMayorista values(3,'Azucar','kilogramos',700,50,'azucar chino',1,3,5000,'imagen')
insert productoMayorista values(4,'Cafe','kilogramos',750,25,'cafe chino',1,4,2000,'imagen')
insert productoMayorista values(5,'Cafe pesado','kilogramos',750,500,'cafe chino',1,4,2000,'imagen')
insert ordenDistribucion values(1,1,1,1,1,1)
insert unidadTransporte values(1,'','','','')
insert categoria values(2,'hola','adios')
insert lote values(1,'','23-03-1995','23-02-1995')
insert categoria values(1,'','','',1,'')
insert bodega values(1,'Alcenes Iman','X','Y',235,'imagen')
insert bodega values(2,'Almacenes Jiron','X','Y',235,'imagen')
insert bodega values(3,'La bodega','X','Y',235,'imagen')
insert bodega values(4,'Guarida No somos narcos','X','Y',235,'imagen')
insert bodega values(5,'New York Inc.','X','Y',235,'imagen')
select * from categoria
select * from lote
select * from unidadTransporte
select  count(b.id) from bodega b
select * from bodega
select * from ordenDistribucion
select * from usuario
select * from productoMayorista where idOrden = '1'

delete from categoria
delete from lote
delete from unidadTransporte
delete from bodega
delete from ordenDistribucion
delete from usuario
delete from productoMayorista

