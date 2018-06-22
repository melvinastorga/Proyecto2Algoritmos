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
insert productoMayorista values(1,1,'','',1,1,'',1,1,1,'')
insert ordenDistribucion values(1,1,1,1,1,1)
insert unidadTransporte values(1,'','','','')
insert categoria values(2,'hola','adios')
insert lote values(1,'','23-03-1995','23-02-1995')
insert categoria values(1,'','','',1,'')
insert bodega values(1,'','','',1,'')
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

