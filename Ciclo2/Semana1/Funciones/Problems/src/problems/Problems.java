/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

/**
 *
 * @author j4ckdev
 */
public class Problems {

    public static int chicken(int hens, int roosters, int chicks) {
        return hens * 6 + roosters * 7 + chicks * 1;
    }

    public static int buyFood(int breads, int milkBags, int eggs) {
        return breads * 300 + milkBags * 3300 + eggs * 350;
    }

    public static double moneyToPay(double borrowedMoney) {
        return borrowedMoney * Math.pow(1 + 0.03, 2);
    }
    
    public static int totalInfected(int actualInfected,int days){
        return (int) (actualInfected * Math.pow(2, days-1));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Problema 1
        int hens = 5;
        int roosters = 10;
        int chicks = 15;
        System.out.println("El total de carne de aves es de " + chicken(hens, roosters, chicks) + " kilos.");

        // Problema 2
        int money = 50000;
        int breads = 15;
        int milkBags = 10;
        int eggs = 20;
        int totalPay = buyFood(breads, milkBags, eggs);
        int change = money - totalPay;
        String message = change < 0 ? "quedas debiendo " + Math.abs(change) : "tu devuelto es " + change;
        System.out.println("El total de la compra es de " + totalPay + " pesos y " + message + " pesos.");

        // Problema 3
        double borrowedMoney = 500;
        System.out.println("Al final del segundo mes deberás pagar " + moneyToPay(borrowedMoney) + " pesos.");

        // Problema 4
        int days = 10;
        int actualInfected = 5;
        System.out.println("El total de contagiados para el día " + days + " es de " + totalInfected(actualInfected, days));
    }

}
