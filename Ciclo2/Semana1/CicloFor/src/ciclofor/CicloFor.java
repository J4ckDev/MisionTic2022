/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclofor;

import java.util.Scanner;

/**
 *
 * @author j4ckdev
 */
public class CicloFor {

    public static double factorial(int maxNumber) {
        double result = 1;
        for (int actualNumber = 1; actualNumber <= maxNumber; actualNumber++) {
            result *= actualNumber;
        }
        return result;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Problema 1
        System.out.println("Ejercicio 1");
        for (int num = 0; num <= 100; num++) {
            System.out.println(num + "^2 = " + Math.pow(num, 2));
        }
        System.out.println(" ");

        // Problema 2
        System.out.println("Ejercicio 2");
        System.out.println("Impares\tPares");
        System.out.print("1\t");
        for (int num = 2; num <= 1000; num++) {
            boolean isEven = num % 2 == 0;
            System.out.print(isEven ? num + "\n" : num + "\t");
        }
        System.out.println(" ");

        // Problema 3
        System.out.println("Ejercicio 3");
        System.out.println("Ingrese un número natural mayor a 2: ");
        int maxNumber = Integer.parseInt(sc.nextLine());
        System.out.println("Los números pares entre " + maxNumber + " y 2 son:");
        for (int num = maxNumber; num >= 2; num--) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println(" ");

        // Problema 4
        System.out.println("Ejercicio 4");
        System.out.println("Ingrese un número mayor a 1: ");
        int maxNumberFactorial = Integer.parseInt(sc.nextLine());
        double result = 1;
        for (int actualNumber = 1; actualNumber <= maxNumberFactorial; actualNumber++) {
            result *= actualNumber;
            System.out.println(actualNumber + "! = " + result);
        }
        System.out.println(" ");

        // Problema 5
        System.out.println("Ejercicio 5");
        System.out.println("Calculadora de la potencia de 2^n");
        int n = Integer.parseInt(sc.nextLine());
        int resultPowTwo = 1;
        for (int num = 0; num < n; num++) {
            resultPowTwo *= 2;
        }
        System.out.println("2^" + n + " = " + resultPowTwo);
        System.out.println(" ");

        // Problema 6
        System.out.println("Ejercicio 6");
        System.out.println("Calculadora de potencias x^n");
        System.out.println("Ingresa el valor de x: ");
        int base = Integer.parseInt(sc.nextLine());
        System.out.println("Ingresa el valor de n: ");
        int exponent = Integer.parseInt(sc.nextLine());
        int resultPow = 1;
        for (int num = 0; num < exponent; num++) {
            resultPow *= base;
        }
        System.out.println(base + "^" + exponent + " = " + resultPow);
        System.out.println(" ");

        // Problema 7
        System.out.println("Ejercicio 7");
        System.out.println("Tablas de multiplicar del 1 al 9");
        for (int numMultTable = 1; numMultTable < 10; numMultTable++) {
            System.out.println("Tabla del " + numMultTable);
            for (int num = 1; num <= 10; num++) {
                System.out.println(numMultTable + "x" + num + " = " + numMultTable * num);
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        // Problema 8
        System.out.println("Ejercicio 8");
        System.out.println("Obtener el valor de e^x a partir de la serie de Maclaurin");
        System.out.println("Ingresa el valor de x: ");
        double exponentExp = Double.parseDouble(sc.nextLine());
        System.out.println("Ingresa el número de términos de Maclaurin: ");
        int maclaurinTerms = Integer.parseInt(sc.nextLine());
        double resultExp = 0;
        for (int i = 0; i <= maclaurinTerms; i++) {
            resultExp += (Math.pow(exponentExp, i)) / (factorial(i));
        }
        System.out.println("e^" + exponentExp + " = " + resultExp);
        System.out.println(" ");

        // Problema 9
        System.out.println("Ejercicio 9");
        System.out.println("Obtener el valor de sen(x) a partir de la serie de Maclaurin");
        System.out.println("Ingresa el valor del ángulo x en radianes: ");
        double angle = Double.parseDouble(sc.nextLine());
        System.out.println("Ingresa el número de términos de Maclaurin: ");
        maclaurinTerms = Integer.parseInt(sc.nextLine());
        double resultSin = 0;
        double numerator;
        double denominator;
        for (int i = 0; i <= maclaurinTerms; i++) {
            numerator = Math.pow(-1, i) * Math.pow(angle, (2 * i) + 1);
            denominator = factorial((2 * i) + 1);
            resultSin += numerator / denominator;
        }
        System.out.println("sin(" + angle + ") = " + resultSin);
        System.out.println(" ");

        // Problema 10
        System.out.println("Ejercicio 10");
        System.out.println("Obtener el valor de cos(x) a partir de la serie de Maclaurin");
        System.out.println("Ingresa el valor del ángulo x en radianes: ");
        angle = Double.parseDouble(sc.nextLine());
        System.out.println("Ingresa el número de términos de Maclaurin: ");
        maclaurinTerms = Integer.parseInt(sc.nextLine());
        double resultCos = 0;
        for (int i = 0; i <= maclaurinTerms; i++) {
            numerator = Math.pow(-1, i) * Math.pow(angle, 2 * i);
            denominator = factorial(2 * i);
            resultCos += numerator / denominator;
        }
        System.out.println("cos(" + angle + ") = " + resultCos);
        System.out.println(" ");

        // Problema 11
        System.out.println("Ejercicio 11");
        System.out.println("Obtener el valor de ln(x) a partir de la serie de Maclaurin");
        System.out.println("Ingresa un valor de x mayor a 0: ");
        double xValue = Double.parseDouble(sc.nextLine());
        System.out.println("Ingresa el número de términos de Maclaurin: ");
        maclaurinTerms = Integer.parseInt(sc.nextLine());
        double resultLnx = 0.0;
        double firstPart;
        double secondPart;
        for (int i = 0; i <= maclaurinTerms; i++) {
            firstPart = (double) 1 / ((2 * i) + 1);
            secondPart = Math.pow(((Math.pow(xValue, 2) - 1) / (Math.pow(xValue, 2) + 1)), (2 * i) + 1);
            resultLnx += firstPart * secondPart;
        }
        System.out.println("ln(" + xValue + ") = " + resultLnx);
        System.out.println(" ");

        // Problema 12
        System.out.println("Ejercicio 12");
        System.out.println("Obtener el valor de arctan(x) a partir de la serie de Maclaurin");
        System.out.println("Ingresa el valor de x entre -1 y 1: ");
        double value = Double.parseDouble(sc.nextLine());
        System.out.println("Ingresa el número de términos de Maclaurin: ");
        maclaurinTerms = Integer.parseInt(sc.nextLine());
        double resultArctan = 0;
        for (int i = 0; i <= maclaurinTerms; i++) {
            numerator = Math.pow(-1, i) * Math.pow(value, (2 * i) + 1);
            denominator = (2*i)+1;
            resultArctan += numerator / denominator;
        }
        System.out.println("arctan(" + value + ") = " + resultArctan);
        System.out.println(" ");
    }

}
