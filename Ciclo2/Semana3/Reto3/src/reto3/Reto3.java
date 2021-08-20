/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author j4ckdev
 */
public class Reto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> articulos = new ArrayList<>(Arrays.asList("CHASIS", "FRENOS", "MOTOR", "FRENOS", "DIRECCION", "EMBRAGUE", "MOTOR"));
        ArrayList<String> repuestos = Repuesto.obtenerRepuestos(articulos);
        System.out.println(repuestos.toString());

        ArrayList<Integer> lpos = new ArrayList<>(Arrays.asList(0, 1, 4, 5, 6));
        ArrayList<String> faltantes = new ArrayList<>(Arrays.asList("EMBRAGUE", "FRENOS", "MOTOR", "FRENOS", "DIRECCION", "EMBRAGUE", "MOTOR"));
        String cat = "EMBRAGUE";
        ArrayList<Integer> posicionesRepuesto = Repuesto.obtenerRepuestosFaltantes(lpos, faltantes, cat);
        System.out.println(posicionesRepuesto.toString());

        ArrayList<String> lotro = new ArrayList<>(Arrays.asList("EMBRAGUE", "RUEDA", "FRENOS", "MOTOR", "DIRECCION", "CAJA"));
        ArrayList<String> lodtimuz = new ArrayList<>(Arrays.asList("SUSPENSION", "RUEDA", "CAJA", "EMBRAGUE", "PATIN"));
        ArrayList<String> repuestosDeseados = Repuesto.obtenerFaltantes(lotro, lodtimuz);
        System.out.println(repuestosDeseados);

        lotro = new ArrayList<>(Arrays.asList("EXPLORADORA", "RUEDA", "FRENOS", "MOTOR", "DIRECCION", "CAJA"));
        lodtimuz = new ArrayList<>(Arrays.asList("SUSPENSION", "RUEDA", "CAJA", "EMBRAGUE", "PATIN"));
        int repuestosIntercambiables = Repuesto.obtenerSobrantesIntercambiables(lotro, lodtimuz);
        System.out.println(repuestosIntercambiables);
    }

}
