create database Proyecto_2_Algoritmos
use Proyecto_2_Algoritmos

create table categoria(
id int identity(1,1),
nombre varchar(30),
descripcion varchar(250)
constraint categoria_pk primary key(id)
);

create table lote(
id int identity(1,1),
codigoLote varchar(100),
fechaEmpacado date,
fechaVencimiento date,
constraint lote_pk primary key(id)
);

create table unidadTransporte(
id int identity(1,1),
placa varchar(20),
capacidad int,
urlFotografia varchar(500)
constraint unidadTransporte_pk primary key(id)
);

create table bodega(
id int identity(1,1),
nombre varchar(30),
latitud varchar(30),
longitud varchar(30),
distanciaCentroOperaciones float,
urlFotografia varchar(500)
constraint bodega_pk primary key (id)
);

create table usuario(
id int identity(1,1),
nombre varchar(50),
rol varchar(20),
usuario varchar(50),
pass varchar(500),
constraint usuario_pk primary key(id)
);

create table ordenDistribucion(
id int identity(1,1),
idBodegaProcedencia int,
idBodegaDestino int,
montoTotal bigint,
pesoTotal float,
idOperador int,
constraint ordenDistribucion_pk primary key (id),
constraint ordenDistrubucionProcedencia_bodega foreign key (idBodegaProcedencia) references bodega(id),
constraint ordenDistrubucionDestino_bodega foreign key (idBodegaDestino) references bodega(id),
);

create table productoMayorista(
id int identity(1,1),
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
constraint productoMayorista_pk primary key (id),
constraint productoMayorista_lote_fk foreign key (idLote) references lote(id),
constraint productoMayorista_categoria_fk foreign key(idCategoria) references categoria(id),
constraint productoMayorista_ordenDsitribucion_fk foreign key (idOrdenDistribucion) references ordenDistribucion(id)
);


