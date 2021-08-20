/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author j4ckdev
 */
public class Repuesto {

    public static ArrayList<String> obtenerRepuestos(List<String> articulos) {
        ArrayList<String> repuestos = new ArrayList<>();
        articulos.forEach((String articulo) -> {
            boolean noExisteRepuesto = !repuestos.contains(articulo);
            if (noExisteRepuesto) {
                repuestos.add(articulo);
            }
        });
        return repuestos;
    }

    public static ArrayList<Integer> obtenerRepuestosFaltantes(List<Integer> posiciones, List<String> repuestosFaltantes, String repuestoDeseado) {
        ArrayList<Integer> posicionesRepuestoDeseado = new ArrayList<>();
        posiciones.forEach((Integer posicion) -> {
            boolean esRepuestoDeseado = repuestosFaltantes.get(posicion).equals(repuestoDeseado);
            if (esRepuestoDeseado) {
                posicionesRepuestoDeseado.add(posicion);
            }
        });
        return posicionesRepuestoDeseado;
    }

    public static ArrayList<String> obtenerFaltantes(List<String> repuestosLotro, List<String> repuestosLodtimuz) {
        ArrayList<String> repuestosDeseados = new ArrayList<>();
        repuestosLotro.forEach(repuesto -> {
            boolean esRepuestoNecesario = !repuestosLodtimuz.contains(repuesto);
            if (esRepuestoNecesario) {
                repuestosDeseados.add(repuesto);
            }
        });
        return repuestosDeseados;
    }

    public static int obtenerSobrantesIntercambiables(List<String> repuestosLotro, List<String> repuestosLodtimuz) {
        int faltantesLotro = obtenerFaltantes(repuestosLodtimuz, repuestosLotro).size();
        int faltantesLodtimuz = obtenerFaltantes(repuestosLotro, repuestosLodtimuz).size();
        if (faltantesLotro < faltantesLodtimuz) {
            return faltantesLotro;
        } else if (faltantesLotro > faltantesLodtimuz) {
            return faltantesLodtimuz;
        } else {
            return faltantesLotro;
        }
    }
}
