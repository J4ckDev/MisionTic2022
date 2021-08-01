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
        System.out.println("Ejercicios sobre vectores");
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
        System.out.println();

        System.out.println("Ejercicios sobre matrices");
        double[][] firstMatrix = {{0, 4, 3, 3}, {-4, 5, -2, -2}, {-5, -5, 2, -1}, {-1, -3, 5, -1}};//Matrixes.createMatrix(sc, 4, 4);
        double[][] secondMatrix = {{4, 0, 1, -2}, {-2, -2, 3, -1}, {4, 4, 2, -5}, {0, 4, -2, 5}};
        double[][] firstMagicMatrix = {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}};
        double[][] secondMagicMatrix = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        System.out.println("Matriz 1:");
        System.out.println(Arrays.deepToString(firstMatrix));
        System.out.println("Matriz 2:");
        System.out.println(Arrays.deepToString(secondMatrix));
        System.out.println("¿Matriz 1 y matriz 2 tienen el mismo tamaño? R/ " + Matrixes.haveSameSize(firstMatrix, secondMatrix));
        System.out.println("Suma matrices 1 y 2 igual a " + Arrays.deepToString(Matrixes.sumMatrixes(firstMatrix, secondMatrix)));
        System.out.println("La multiplicación de la matriz 1 y 2 es: " + Arrays.deepToString(Matrixes.multiply(firstMatrix, secondMatrix)));
        System.out.println("La suma de la columna " + Arrays.toString(Matrixes.column(firstMatrix, 1)) + " de la matriz 1 es: " + Matrixes.sumColumn(firstMatrix, 1));
        System.out.println("La suma de la fila " + Arrays.toString(Matrixes.row(secondMatrix, 1)) + " de la matriz 2 es: " + Matrixes.sumRow(secondMatrix, 1));
        System.out.println("¿La matriz " + Arrays.deepToString(firstMatrix) + " es mágica? R/ " + Matrixes.isMagic(firstMatrix));
        System.out.println("¿La matriz " + Arrays.deepToString(secondMatrix) + " es mágica? R/ " + Matrixes.isMagic(secondMatrix));
        System.out.println("¿La matriz " + Arrays.deepToString(firstMagicMatrix) + " es mágica? R/ " + Matrixes.isMagic(firstMagicMatrix));
        System.out.println("¿La matriz " + Arrays.deepToString(secondMagicMatrix) + " es mágica? R/ " + Matrixes.isMagic(secondMagicMatrix));

    }

}
