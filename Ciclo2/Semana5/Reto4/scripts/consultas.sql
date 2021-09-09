select "Consulta 1";
select mascotaNombre from mascota order by mascotaNombre asc;
select "Consulta 2";
select mascotaNombre,citaDescripcion,citaFecha from mascota natural join cita order by citaFecha desc;
select "Consulta 3";
select mascotaNombre from mascota natural join propietario where propUsuario = "JReina";
-- Otra forma
select mascotaNombre from mascota join propietario using(propId) where propUsuario = "JReina";
select "Consulta 4";
select mascotaNombre,citaDescripcion,citaFecha,propNombre,propApellido,propTelefono from mascota natural join cita natural join propietario order by citaFecha desc;