drop table if exists mascota;
create table mascota(
	mascotaId int primary key auto_increment,
    mascotaNombre char(30) not null,
    propId int not null,
    foreign key(propId) references propietario(propId)
);

insert into mascota(mascotaNombre,propId) values ("Sam",5);
insert into mascota(mascotaNombre,propId) values ("Merlín",4);
insert into mascota(mascotaNombre,propId) values ("Toby",5);
insert into mascota(mascotaNombre,propId) values ("Kira",2);
insert into mascota(mascotaNombre,propId) values ("Sasha",1);
insert into mascota(mascotaNombre,propId) values ("Tribilín",2);

-- Comprobar inserción 
select * from mascota;