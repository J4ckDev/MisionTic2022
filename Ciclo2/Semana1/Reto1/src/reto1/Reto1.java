/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1;

import java.util.Scanner;

/**
 *
 * @author j4ckdev
 */
public class Reto1 {

    public static int distanceToLoona(int distanceOfTerra) {
        return 2 * distanceOfTerra + 4;
    }

    public static int distanceToZaibertron(int distanceOfTerra, int distanceOfLoona) {
        return (int) (distanceOfTerra + distanceOfLoona) / 5;
    }

    public static String planetCategory(int planetDistance) {
        if (planetDistance > 50) {
            return "cuatro";
        } else if (planetDistance > 30) {
            return "tres";
        } else if (planetDistance > 20) {
            return "dos";
        } else {
            return "uno";
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distanceOfTerra = Integer.parseInt(sc.nextLine());
        int distanceOfLoona = distanceToLoona(distanceOfTerra);
        int distanceOfZaibertron = distanceToZaibertron(distanceOfTerra, distanceOfLoona);
        String zaibertronCategory = planetCategory(distanceOfZaibertron);
        System.out.println(distanceOfTerra + " " + distanceOfLoona + " " + distanceOfZaibertron);
        System.out.println(zaibertronCategory);
    }

}
