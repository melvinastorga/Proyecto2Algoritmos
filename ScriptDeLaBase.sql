create database Proyecto_2_Algoritmos
use Proyecto_2_Algoritmos

create table categoria(
id int,
nombre varchar(30),
descripcion varchar(250)
);

create table lote(
id int,
codigoLote varchar(100),
fechaEmpacado date,
fechaVencimiento date
);

create table unidadTransporte(
id int,
placa varchar(20),
capacidad int,
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
rol varchar(20),
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
idOrdenDistribucion int,
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


