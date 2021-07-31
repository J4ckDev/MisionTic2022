/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresmatrices;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author j4ckdev
 */
public class VectoresMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] firstVector = {10, 5, 7, 3, 2, 3}; //VectorOperations.createVector(sc, 5);
        double[] secondVector = {10, 7, 9, 27, 0, 4};
        double[] thirdVector = {17, 4, 5, 7, 9, 11, 12};
        double[] fourthVector = {0, 11, 36, 10, 0, 17, -23, 81, 0, 0, 12, 11, 0};
        System.out.println("El valor medio del vector " + Arrays.toString(firstVector) + " es " + Vectors.mean(firstVector));
        System.out.println("El producto punto entre " + Arrays.toString(firstVector) + " y " + Arrays.toString(secondVector) + " es " + Vectors.dotProduct(firstVector, secondVector));
        System.out.println("El producto directo entre " + Arrays.toString(firstVector) + " y " + Arrays.toString(secondVector) + " es " + Arrays.toString(Vectors.directProduct(firstVector, secondVector)));
        System.out.println("La mediana del vector " + Arrays.toString(firstVector) + " es " + Vectors.median(firstVector));
        System.out.println("La mediana del vector " + Arrays.toString(thirdVector) + " es " + Vectors.median(thirdVector));
        System.out.println("Vector original: " + Arrays.toString(fourthVector));
        System.out.println("Vector salida: " + Arrays.toString(Vectors.moveZerosToLast(fourthVector)));
        System.out.println("La posición del valor mínimo del vector " + Arrays.toString(firstVector) + " es " + Vectors.positionMinNumber(firstVector));
        System.out.println("El valor mínimo del vector " + Arrays.toString(secondVector) + " es " + Vectors.min(secondVector));
        System.out.println("La multiplicación del vector " + Arrays.toString(thirdVector) + " por el número 10 es " + Arrays.toString(Vectors.scalarMultiplication(10, thirdVector)));
    }

}
