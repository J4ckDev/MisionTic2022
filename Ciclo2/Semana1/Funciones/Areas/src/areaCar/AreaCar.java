/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaCar;

import java.util.Scanner;

/**
 *
 * @author j4ckdev
 */
public class AreaCar {

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double rectangleArea(double base, double height) {
        return base * height;
    }

    public static double totalCarArea(double radiusLargeTire, double radiusSmallTire, double topBase, double topHeight, double bottomBase, double bottomHeight) {
        return circleArea(radiusLargeTire) + circleArea(radiusSmallTire) + rectangleArea(topBase, topHeight) + rectangleArea(bottomBase, bottomHeight);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el radio de la llanta grande: ");
        double radiusLargeTire = Double.parseDouble(sc.nextLine());
        System.out.println("Ingresa el radio de la llanta pequeña: ");
        double radiusSmallTire = Double.parseDouble(sc.nextLine());
        System.out.println("Ingresa el tamaño de la base superior del carro: ");
        double topBase = Double.parseDouble(sc.nextLine());
        System.out.println("Ingresa la altura de la parte superior del carro: ");
        double topHeight = Double.parseDouble(sc.nextLine());
        System.out.println("Ingresa el tamaño de la base inferior del carro: ");
        double bottomBase = Double.parseDouble(sc.nextLine());
        System.out.println("Ingresa la altura de la parte inferior del carro: ");
        double bottomHeight = Double.parseDouble(sc.nextLine());
        double totalArea = totalCarArea(radiusLargeTire, radiusSmallTire, topBase, topHeight, bottomBase, bottomHeight);
        System.out.println("El área del carro es: " + totalArea);
    }
}
