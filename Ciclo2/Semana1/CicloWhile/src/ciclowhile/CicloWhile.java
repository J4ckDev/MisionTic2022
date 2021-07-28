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
//        System.out.println("Ejercicio 1");
//        int asciiCode = 0;
//        boolean isNotCapitalLetter = false;
//        do {
//            System.out.println("Ingrese un número entero: ");
//            asciiCode = Integer.parseInt(sc.nextLine());
//            isNotCapitalLetter = asciiCode < 65 || asciiCode > 90;
//        } while (isNotCapitalLetter);
//        char capitalLetter = (char) asciiCode;
//        System.out.println("Has finalizado el programa. Ingresaste el código ASCII de la letra " + capitalLetter);
//        System.out.println(" ");

        // Problema 2
//        System.out.println("Ejercicio 2");
//        int actualNumber = 1;
//        while (actualNumber <= 100) {
//            System.out.println(actualNumber + "^2 = " + Math.pow(actualNumber, 2));
//            actualNumber++;
//        }
//        System.out.println(" ");

        // Problema 3
        System.out.println("Ejercicio 3");
        System.out.println("Impares\tPares");
        System.out.print(1 + "\t");
        int number = 2;
        while(number <=1000){
            if (number % 2 == 0) {
                System.out.print(number + "\n");
            }else{
                System.out.print(number + "\t");
            }
            number++;
        } 

        // Problema 4
        // Problema 5
        // Problema 6
    }

}
