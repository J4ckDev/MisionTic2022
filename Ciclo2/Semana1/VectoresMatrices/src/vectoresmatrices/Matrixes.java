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
public class Matrixes {

    public static double[][] createMatrix(Scanner sc, int numberOfRows, int numberOfColumns) {
        double[][] matrix = new double[numberOfRows][numberOfColumns];
        for (int indexRow = 0; indexRow < numberOfRows; indexRow++) {
            for (int indexColumn = 0; indexColumn < numberOfColumns; indexColumn++) {
                System.out.println("Ingresa el número de la posición (" + indexRow + "," + indexColumn + ")");
                matrix[indexRow][indexColumn] = sc.nextDouble();
            }
        }
        return matrix;
    }

    public static boolean isMatrix(double[][] matrix) {
        int numberOfColumns = matrix[0].length;
        for (double[] row : matrix) {
            if (row.length != numberOfColumns) {
                return false;
            }
        }
        return true;
    }

    public static double[] size(double[][] matrix) {
        double[] matrixSize = new double[2];
        matrixSize[0] = Double.NaN;
        matrixSize[1] = Double.NaN;
        if (isMatrix(matrix)) {
            matrixSize[0] = matrix.length;
            matrixSize[1] = matrix[0].length;
        }
        return matrixSize;
    }

    public static boolean haveSameSize(double[][] firstMatrix, double[][] secondMatrix) {
        double[] firstMatrixSize = size(firstMatrix);
        double[] secondMatrixSize = size(secondMatrix);
        return (firstMatrixSize[0] == secondMatrixSize[0]) && (firstMatrixSize[1] == secondMatrixSize[1]);
    }

    public static double[][] sumMatrixes(double[][] firstMatrix, double[][] secondMatrix) {
        double[][] result;
        if (haveSameSize(firstMatrix, secondMatrix)) {
            double[] matrixSize = size(firstMatrix);
            int rows = (int) matrixSize[0];
            int columns = (int) matrixSize[1];
            result = new double[rows][columns];
            for (int row = 0; row < rows; row++) {
                for (int column = 0; column < columns; column++) {
                    result[row][column] = firstMatrix[row][column] + secondMatrix[row][column];
                }
            }
            return result;
        }
        result = new double[1][1];
        result[0][0] = Double.NaN;
        return result;
    }

    public static double[] column(double[][] matrix, int numberOfColumn) {
        double[] result;
        if (isMatrix(matrix) && numberOfColumn >= 0) {
            double[] matrixSize = size(matrix);
            int rows = (int) matrixSize[0];
            int columns = (int) matrixSize[1];
            if (numberOfColumn < columns) {
                result = new double[rows];
                for (int row = 0; row < rows; row++) {
                    result[row] = matrix[row][numberOfColumn];
                }
                return result;
            }
        }
        result = new double[1];
        result[0] = Double.NaN;
        return result;
    }

    public static double[] row(double[][] matrix, int numberOfRow) {
        double[] result;
        if (isMatrix(matrix) && numberOfRow >= 0) {
            double[] matrixSize = size(matrix);
            int rows = (int) matrixSize[0];
            if (numberOfRow < rows) {
                result = matrix[numberOfRow];
                return result;
            }
        }
        result = new double[1];
        result[0] = Double.NaN;
        return result;
    }

    public static double[][] multiply(double[][] firstMatrix, double[][] secondMatrix) {
        double[][] result;
        if (isMatrix(firstMatrix) && isMatrix(secondMatrix)) {
            double[] firstMatrixSize = size(firstMatrix);
            int rowsFirstMatrix = (int) firstMatrixSize[0];
            int columnsFirstMatrix = (int) firstMatrixSize[1];
            double[] secondMatrixSize = size(secondMatrix);
            int rowsSecondMatrix = (int) secondMatrixSize[0];
            int columnsSecondMatrix = (int) secondMatrixSize[1];
            boolean canMultiply = columnsFirstMatrix == rowsSecondMatrix;
            if (canMultiply) {
                result = new double[rowsFirstMatrix][columnsSecondMatrix];
                double[] secondMatrixColumnValues;
                for (int column = 0; column < columnsSecondMatrix; column++) {
                    for (int row = 0; row < rowsFirstMatrix; row++) {
                        secondMatrixColumnValues = column(secondMatrix, column);
                        result[row][column] = Vectors.sum(Vectors.directProduct(firstMatrix[row], secondMatrixColumnValues));
                    }
                }
                return result;
            }
        }
        result = new double[1][1];
        result[0][0] = Double.NaN;
        return result;
    }

    public static double sumColumn(double[][] matrix, int numberOfColumn) {
        if (isMatrix(matrix) && numberOfColumn >= 0) {
            double[] columnValues = column(matrix, numberOfColumn);
            return Vectors.sum(columnValues);
        }
        return Double.NaN;
    }

    public static double sumRow(double[][] matrix, int numberOfRow) {
        if (isMatrix(matrix) && numberOfRow >= 0) {
            double[] rowValues = matrix[numberOfRow];
            return Vectors.sum(rowValues);
        }
        return Double.NaN;
    }

    public static double[] diagonal(double[][] matrix, int numberOfDiagonal) {
        double[] result;
        if (isMatrix(matrix)) {
            double[] matrixSize = size(matrix);
            int rows = (int) matrixSize[0];
            int columns = (int) matrixSize[1];
            if (rows == columns) {
                result = new double[rows];
                for (int row = 0; row < rows; row++) {
                    result[row] = numberOfDiagonal == 0 ? matrix[row][row] : matrix[row][rows - (row + 1)];
                }
                return result;
            }
        }
        result = new double[1];
        result[0] = Double.NaN;
        return result;
    }

    public static double sumDiagonal(double[][] matrix, int numberOfDiagonal) {
        if (isMatrix(matrix)) {
            double[] diagonalValues = diagonal(matrix, numberOfDiagonal);
            return Vectors.sum(diagonalValues);
        }
        return Double.NaN;
    }

    public static boolean isMagic(double[][] matrix) {
        if (isMatrix(matrix)) {
            double[] matrixSize = size(matrix);
            int rows = (int) matrixSize[0];
            int columns = (int) matrixSize[1];
            if (rows == columns) {
                double lastSum = sumRow(matrix, 0);
                double actualSum;
                for (int row = 1; row < rows; row++) {
                    actualSum = sumRow(matrix, row);
                    if (actualSum != lastSum) {
                        return false;
                    }
                    lastSum = actualSum;
                }
                for (int column = 0; column < columns; column++) {
                    actualSum = sumColumn(matrix, column);
                    if (actualSum != lastSum) {
                        return false;
                    }
                    lastSum = actualSum;
                }
                for (int diagonal = 0; diagonal < 2; diagonal++) {
                    actualSum = sumDiagonal(matrix, diagonal);
                    if (actualSum != lastSum) {
                        return false;
                    }
                    lastSum = actualSum;
                }
                return true;
            }
        }
        return false;
    }
}
