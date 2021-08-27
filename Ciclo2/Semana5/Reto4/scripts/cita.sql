drop table if exists cita;
create table cita(
	citaId int primary key auto_increment,
    citaFecha datetime not null,
    citaDescripcion varchar(180) not null,
    mascotaId int not null,
    foreign key(mascotaId) references mascota(mascotaId)
);

insert into cita(citaFecha,citaDescripcion,mascotaId) values ("2021-08-01 15:30:00","El gato se encuentra con un peso normal y en su cita de control de ojos al parecer la catarata se detuvo",1);
insert into cita(citaFecha,citaDescripcion,mascotaId) values ("2021-08-02 18:30:00","Merlín presenta halitosis reflejo de un problema localizado en la boca o incluso de algún problema del aparato digestivo.",2);
insert into cita(citaFecha,citaDescripcion,mascotaId) values ("2021-06-30 04:30:20","El pronóstico es reservado. Presenta molestias bucales (gingivitis), vómitos, fiebre. Se deja en hospitalización.",4);
insert into cita(citaFecha,citaDescripcion,mascotaId) values ("2021-08-13 04:30:20","Viene para el programa de perritos de la tercera edad",5);

-- Comprobar inserción
select * from cita;