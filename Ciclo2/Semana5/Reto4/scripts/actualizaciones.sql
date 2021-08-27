-- Actualizaciones
update propietario set propTelefono = "2112455 ext 123" where propUsuario="haylee";
delete from mascota where mascotaId = 6;

-- Comprobar las actualizaciones
select * from propietario;
select * from mascota;