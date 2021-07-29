/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclowhile;

import java.util.Scanner;

/**
 *
 * @author j4ckdev
 */
public class CicloWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Problema 1
        System.out.println("Ejercicio 1");
        int asciiCode = 0;
        boolean isNotCapitalLetter = false;
        do {
            System.out.println("Ingrese un número entero: ");
            asciiCode = Integer.parseInt(sc.nextLine());
            isNotCapitalLetter = asciiCode < 65 || asciiCode > 90;
        } while (isNotCapitalLetter);
        char capitalLetter = (char) asciiCode;
        System.out.println("Has finalizado el programa. Ingresaste el código ASCII de la letra " + capitalLetter);
        System.out.println(" ");

        // Problema 2
        System.out.println("Ejercicio 2");
        int actualNumber = 1;
        while (actualNumber <= 100) {
            System.out.println(actualNumber + "^2 = " + Math.pow(actualNumber, 2));
            actualNumber++;
        }
        System.out.println(" ");

        // Problema 3
        System.out.println("Ejercicio 3");
        System.out.println("Impares\tPares");
        System.out.print(1 + "\t");
        int number = 2;
        while (number <= 1000) {
            if (number % 2 == 0) {
                System.out.print(number + "\n");
            } else {
                System.out.print(number + "\t");
            }
            number++;
        }
        System.out.println(" ");

        // Problema 4
        System.out.println("Ejercicio 4");
        System.out.println("Ingrese un número natural mayor a 2: ");
        int maxNumber = Integer.parseInt(sc.nextLine());
        System.out.println("Los números pares entre " + maxNumber + " y 2 son:");
        while (maxNumber >= 2) {
            if (maxNumber % 2 == 0) {
                System.out.print(maxNumber + " ");
            }
            maxNumber--;
        }
        System.out.println(" ");

        // Problema 5
        System.out.println("Ejercicio 5");
        double popCountryA = 25000000;
        double popCountryB = 18900000;
        int year = 2022;
        while (popCountryA > popCountryB) {
            popCountryA *= 1.02;
            popCountryB *= 1.03;
            year++;
        }
        System.out.println("En el año " + year + " el país B tendrá más población que el país A.");
        System.out.println(" ");

        // Problema 6
        System.out.println("Ejercicio 6");
        int n = 0;
        double epsilonSum = 2;
        double epsilon = 0;
        while (epsilonSum > 1) {
            n--;
            epsilon = Math.pow(2, n);
            epsilonSum = 1 + epsilon;
        }
        System.out.println("El decimal más pequeño que mi computador pude representar de manera precisa es " + epsilon);
        System.out.println(" ");
    }

}
