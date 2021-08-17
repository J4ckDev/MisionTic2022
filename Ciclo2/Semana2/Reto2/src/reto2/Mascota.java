/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;

/**
 *
 * @author j4ckdev
 */
public class Mascota {

    private final String nombre;
    private final double peso;
    private final int edad;
    private final String documentoPropietario;

    public Mascota(String nombre, double peso, int edad, String documentoPropietario) {
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
        this.documentoPropietario = documentoPropietario;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n"
                + "\tPeso: " + peso + " kg\n"
                + "\tedad: " + edad + " meses\n"
                + "\tdocumento: " + documentoPropietario + "\n";
    }
}
