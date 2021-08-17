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
public class Gato extends Mascota{
    private final String marcaArena;

    public Gato(String nombre, double peso, int edad, String documentoPropietario, String marcaArena) {
        super(nombre, peso, edad, documentoPropietario);
        this.marcaArena = marcaArena;
    }
    
    @Override
    public String toString(){
        String primerMensaje = super.toString();
        return primerMensaje + "\tMarca arena: " + marcaArena;
    }
}
