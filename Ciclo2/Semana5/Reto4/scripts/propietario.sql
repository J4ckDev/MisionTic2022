drop table if exists propietario;
create table propietario(
	propId int primary key auto_increment,
	propUsuario varchar(30) not null,
    propApellido varchar(30) not null default " ",
    propNombre varchar(30) not null,
    propTelefono char(25) null
);
insert into propietario(propUsuario,propApellido,propNombre,propTelefono) values ("vincent","Vanghogh","Vicente","3221234564");
insert into propietario(propUsuario,propApellido,propNombre,propTelefono) values ("dantonito","Antony","Diego","3133151232");
insert into propietario(propUsuario,propApellido,propNombre,propTelefono) values ("haylee","Lee","Hayo","3192212121");
insert into propietario(propUsuario,propApellido,propNombre,propTelefono) values ("cristop","Rojas","Christopher","2927272 ext 333");
insert into propietario(propUsuario,propApellido,propNombre,propTelefono) values ("JReina","Reina","Johan","+549 4984445413");

-- Comprobar inserción 
select * from propietario;