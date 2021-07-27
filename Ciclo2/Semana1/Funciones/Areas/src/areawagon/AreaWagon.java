/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areawagon;

import java.util.Scanner;

/**
 *
 * @author j4ckdev
 */
public class AreaWagon {

    public static double circleAreaWithoutMathPI(double radius) {
        return 3.1416 * radius * radius;
    }

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double rectangleArea(double base, double height) {
        return base * height;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el radio de las llantas: ");
        double tiresRadius = Double.parseDouble(sc.nextLine());
        System.out.println("Ingresa el tamaño de la base del vagón: ");
        double wagonBase = Double.parseDouble(sc.nextLine());
        System.out.println("Ingresa la altura del vagón: ");
        double wagonHeight = Double.parseDouble(sc.nextLine());
        //double totalArea = 2 * circleAreaWithoutMathPI(tiresRadius) + rectangleArea(wagonBase, wagonHeight);
        double totalArea = 2 * circleArea(tiresRadius) + rectangleArea(wagonBase, wagonHeight);
        System.out.println("El área del vagón es: " + totalArea);
    }

}
