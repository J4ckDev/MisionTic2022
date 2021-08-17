/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author j4ckdev
 */
public class MisClientes {

    public static void procesarComandos() {
        ArrayList<Mascota> mascotas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String[] comando;
        boolean isRunning;
        Mascota mascota = null;
        String animal;
        String nombre;
        double peso;
        int edad;
        String documentoPropietario;
        String marcaHueso;
        String marcaArena;
        do {
            comando = sc.nextLine().split("&");
            isRunning = !comando[0].equals("3");
            switch (comando[0]) {
                case "1":
                    animal = comando[1];
                    nombre = comando[2];
                    peso = Double.parseDouble(comando[3]);
                    edad = Integer.parseInt(comando[4]);
                    documentoPropietario = comando[5];
                    if (animal.equals("Perro")) {
                        marcaHueso = comando[6];
                        mascota = new Perro(nombre, peso, edad, documentoPropietario, marcaHueso);
                    } else if (animal.equals("Gato")) {
                        marcaArena = comando[6];
                        mascota = new Gato(nombre, peso, edad, documentoPropietario, marcaArena);
                    }
                    mascotas.add(mascota);
                    break;
                case "2":
                    System.out.println("***Clientes***");
                    mascotas.forEach((cliente) -> {
                        System.out.println(cliente.toString());
                    });
                    break;
                case "3":
                    break;
            }
        } while (isRunning);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        procesarComandos();
    }

}
