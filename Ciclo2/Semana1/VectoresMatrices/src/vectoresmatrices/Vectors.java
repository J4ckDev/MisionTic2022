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
public class Vectors {

    public static double[] createVector(Scanner sc, int size) {
        double[] vector = new double[size];
        for (int index = 0; index < size; index++) {
            System.out.println("Ingrese el número de la posición " + index);
            vector[index] = sc.nextDouble();
        }
        return vector;
    }

    public static double mean(double[] numbers) {
        int totalNumbers = 0;
        double totalSum = 0;
        for (double number : numbers) {
            totalNumbers++;
            totalSum += number;
        }
        return totalSum / totalNumbers;
    }

    public static boolean haveSameSize(double[] firstVector, double[] secondVector) {
        return firstVector.length == secondVector.length;
    }

    public static double dotProduct(double[] firstVector, double[] secondVector) {
        double result = 0;
        if (haveSameSize(firstVector, secondVector)) {
            int totalNumbers = firstVector.length;
            for (int index = 0; index < totalNumbers; index++) {
                result += firstVector[index] * secondVector[index];
            }
            return result;
        }
        return Double.NaN;
    }

    public static double[] directProduct(double[] firstVector, double[] secondVector) {
        double[] result;
        if (haveSameSize(firstVector, secondVector)) {
            int totalNumbers = firstVector.length;
            result = new double[totalNumbers];
            for (int index = 0; index < totalNumbers; index++) {
                result[index] = firstVector[index] * secondVector[index];
            }
            return result;
        }
        result = new double[0];
        result[0] = Double.NaN;
        return result;
    }

    public static double[] sort(double[] vector) {
        int totalNumbers = vector.length;
        double[] result = new double[totalNumbers];
        double MajorValue = max(vector);
        int minPosition;
        for (int index = 0; index < totalNumbers; index++) {
            minPosition = positionMinNumber(vector);
            result[index] = vector[minPosition];
            vector[minPosition] = MajorValue + 1;
        }
        return result;
    }

    public static double median(double[] vector) {
        return 0.0;
    }

    public static double[] moveZerosToLast(double[] vector) {
        int totalNumbers = vector.length;
        int lastPosition = 0;
        double[] result = new double[totalNumbers];
        for (int index = 0; index < totalNumbers; index++) {
            if (vector[index] != 0) {
                result[lastPosition] = vector[index];
                lastPosition++;
            }
        }
        return result;
    }

    public static int positionMinNumber(double[] vector) {
        int totalNumbers = vector.length;
        double lastValue = vector[0];
        double actualValue;
        int position = 0;
        for (int index = 1; index < totalNumbers; index++) {
            actualValue = vector[index];
            if (actualValue < lastValue) {
                position = index;
                lastValue = actualValue;
            }
        }
        return position;
    }

    public static double min(double[] vector) {
        int minPosition = positionMinNumber(vector);
        return vector[minPosition];
    }

    public static int positionMaxNumber(double[] vector) {
        int totalNumbers = vector.length;
        double lastValue = vector[0];
        double actualValue;
        int position = 0;
        for (int index = 1; index < totalNumbers; index++) {
            actualValue = vector[index];
            if (actualValue > lastValue) {
                position = index;
                lastValue = actualValue;
            }
        }
        return position;
    }

    public static double max(double[] vector) {
        int maxPosition = positionMaxNumber(vector);
        return vector[maxPosition];
    }
    
    public static double[] scalarMultiplication(int scalar, double[] vector){
        int totalNumbers = vector.length;
        double[] result = new double[totalNumbers];
        for (int index = 0; index < totalNumbers; index++) {
            result[index] = scalar * vector[index];
        }
        return result;
    }
}
