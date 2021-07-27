/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

import java.util.Scanner;

/**
 *
 * @author j4ckdev
 */
public class Condicionales {

    public static void isLowerCaseVowel(int asciiCode) {
        char letter = (char) asciiCode;
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println("El número " + asciiCode + " corresponde a la vocal minúscula " + letter);
        } else {
            System.out.println("El número " + asciiCode + " no corresponde a una vocal minúscula :(");
        }
    }

    public static void isAnEvenAsciiCode(char letter) {
        int asciiCode = (int) letter;
        if (asciiCode % 2 == 0) {
            System.out.println("El código ASCII del caracter " + letter + " es par.");
        } else {
            System.out.println("El código ASCII del caracter " + letter + " es impar.");
        }
    }

    public static boolean isDigit(char letter) {
        int asciiCode = (int) letter;
        return asciiCode == 48 || asciiCode == 49 || asciiCode == 50 || asciiCode == 51 || asciiCode == 52
                || asciiCode == 53 || asciiCode == 54 || asciiCode == 55 || asciiCode == 56 || asciiCode == 57;
    }

    public static void numberPositiveOrNegative(int number) {
        if (number > 0) {
            System.out.println("El número " + number + " es positivo.");
        } else if (number < 0) {
            System.out.println("El número " + number + " es negativo.");
        } else {
            System.out.println("El número 0 es el neutro para la suma");
        }
    }

    public static String whichQuadrant(int x, int y) {
        if (x > 0 && y > 0) {
            return "El par ordenado pertenece al primer cuadrante.";
        } else if (x < 0 && y > 0) {
            return "El par ordenado pertenece al segundo cuadrante.";
        } else if (x < 0 && y < 0) {
            return "El par ordenado pertenece al tercer cuadrante.";
        } else {
            return "El par ordenado pertenece al cuarto cuadrante.";
        }
    }

    public static boolean areCoordsInsideCircle(double x, double y, double radius, double xCircleCenter, double yCircleCenter) {
        double equationResult = Math.pow(x + (xCircleCenter * -1), 2) + Math.pow(y + (yCircleCenter * -1), 2);
        return equationResult <= Math.pow(radius, 2);
    }

    public static boolean isEquilateral(int sideA, int sideB, int sideC) {
        return sideA == sideB && sideB == sideC && sideA == sideC;
    }

    public static boolean isIsosceles(int sideA, int sideB, int sideC) {
        if (sideA == sideB) {
            return (sideA + sideB) > sideC;
        } else if (sideB == sideC) {
            return (sideB + sideC) > sideA;
        } else if (sideA == sideC) {
            return (sideA + sideC) > sideB;
        } else {
            return false;
        }
    }

    public static boolean isScalene(int sideA, int sideB, int sideC) {
        if (sideA < sideB || sideB < sideA) {
            return (sideA + sideB) > sideC;
        } else if (sideA < sideC || sideC < sideA) {
            return (sideA + sideC) > sideB;
        } else if (sideB < sideC || sideC < sideB) {
            return (sideB + sideC) > sideA;
        } else {
            return false;
        }
    }

    public static String isTriangle(int sideA, int sideB, int sideC) {
        if (isEquilateral(sideA, sideB, sideC)) {
            return "Se puede construir un triángulo equilátero.";
        } else if (isIsosceles(sideA, sideB, sideC)) {
            return "Se puede construir un triángulo isósceles.";
        } else if (isScalene(sideA, sideB, sideC)) {
            return "Se puede construir un triángulo escaleno.";
        } else {
            return "No se puede construir ningún tipo de triángulo :(";
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Problema 1
        System.out.println("Ejercicio 1");
        System.out.println("Ingresa un número: ");
        int number = Integer.parseInt(sc.nextLine());
        isLowerCaseVowel(number);
        System.out.println(" ");

        // Problema 2
        System.out.println("Ejercicio 2");
        System.out.println("Ingresa un caracter: ");
        char character = sc.nextLine().charAt(0);
        isAnEvenAsciiCode(character);
        System.out.println(" ");

        // Problema 3
        System.out.println("Ejercicio 3");
        System.out.println("Ingresa un caracter: ");
        char character2 = sc.nextLine().charAt(0);
        String message = isDigit(character2) ? " es un dígito." : " no es un dígito.";
        System.out.println("El caracter " + character2 + message);
        System.out.println(" ");

        //Problema 4
        System.out.println("Ejercicio 4");
        System.out.println("Ingrese un número: ");
        int number2 = Integer.parseInt(sc.nextLine());
        numberPositiveOrNegative(number2);
        System.out.println(" ");

        //Problema 5
        System.out.println("Ejercicio 5");
        System.out.println("Ingrese el valor de x: ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el valor de y: ");
        int y = Integer.parseInt(sc.nextLine());
        boolean coordsDifferentToZero = x != 0 && y != 0;
        String answer = coordsDifferentToZero ? whichQuadrant(x, y) : "Debes ingresar valores distintos de cero.";
        System.out.println(answer);
        System.out.println(" ");

        //Problema 6
        System.out.println("Ejercicio 6");
        System.out.println("Datos del círculo a comprobar.");
        System.out.println("Ingrese su radio: ");
        double radius = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese el valor del eje x en su centro: ");
        double xCircleCenter = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese el valor del eje y en su centro: ");
        double yCircleCenter = Double.parseDouble(sc.nextLine());
        System.out.println(" ");
        System.out.println("Coordenadas del par ordenado que desea comprobar si está dentro del círculo.");
        System.out.println("Ingrese el valor de x: ");
        double xValue = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese el valor de y: ");
        double yValue = Double.parseDouble(sc.nextLine());
        boolean coordsInsideCircle = areCoordsInsideCircle(xValue, yValue, radius, xCircleCenter, yCircleCenter);
        System.out.println(coordsInsideCircle ? "Las coordenadas sí están dentro" : "Las coordenadas no están dentro");
        System.out.println(" ");

        //Problema 7
        System.out.println("Ejercicio 7");
        System.out.println("Ingrese la primera longitud positiva: ");
        int sideA = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese la segunda longitud positiva: ");
        int sideB = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese la tercera longitud positiva: ");
        int sideC = Integer.parseInt(sc.nextLine());
        boolean positiveValues = sideA > 0 && sideB > 0 && sideC > 0;
        String errorMessage = "Ingresaste una longitud negativa o igual a cero, no se puede construir un triángulo :(";
        System.out.println(positiveValues ? isTriangle(sideA, sideB, sideC) : errorMessage);
        System.out.println(" ");
    }

}
