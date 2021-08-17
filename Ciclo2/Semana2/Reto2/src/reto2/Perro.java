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
public class Perro extends Mascota{
    private final String marcaHueso;

    public Perro(String nombre, double peso, int edad, String documentoPropietario, String marcaHueso) {
        super(nombre, peso, edad, documentoPropietario);
        this.marcaHueso = marcaHueso;
    }
    
    @Override
    public String toString(){
        String primerMensaje = super.toString();
        return primerMensaje + "\tMarca hueso: " + marcaHueso;
    }
}
