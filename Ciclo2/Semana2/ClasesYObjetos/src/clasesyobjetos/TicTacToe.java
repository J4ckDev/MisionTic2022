/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesyobjetos;

/**
 *
 * @author j4ckdev
 */
public class TicTacToe {

    private final char[][] table;

    public TicTacToe() {
        table = new char[3][3];
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                table[row][column] = 'a';
            }
        }
    }

    public boolean fillSquare(char symbol, int row, int column) {
        if (row >= 0 && row < 3 && column >= 0 && column < 3) {
            symbol = Character.toUpperCase(symbol);
            boolean isValidSymbol = symbol == 'X' || symbol == 'O';
            if (isValidSymbol && isAnEmptySquare(verifySquare(row, column))) {
                table[row][column] = symbol;
                return true;
            }
        }
        return false;
    }

    private boolean isAnEmptySquare(char squareValue) {
        return squareValue == 'a';
    }

    public char verifyWinner() {
        int[][][] winnerPossitions = {
            {{0, 0}, {0, 1}, {0, 2}},
            {{1, 0}, {1, 1}, {1, 2}},
            {{2, 0}, {2, 1}, {2, 2}},
            {{0, 0}, {1, 0}, {2, 0}},
            {{0, 1}, {1, 1}, {2, 1}},
            {{0, 2}, {1, 2}, {2, 2}},
            {{0, 0}, {1, 1}, {2, 2}},
            {{0, 2}, {1, 1}, {2, 0}}
        };
        char firstValue;
        char secondValue;
        char thirdValue;
        int[] firstSquare;
        int[] secondSquare;
        int[] thirdSquare;
        boolean areFilledSquares;
        for (int[][] positions : winnerPossitions) {
            firstSquare = positions[0];
            secondSquare = positions[1];
            thirdSquare = positions[2];
            firstValue = verifySquare(firstSquare[0], firstSquare[1]);
            secondValue = verifySquare(secondSquare[0], secondSquare[1]);
            thirdValue = verifySquare(thirdSquare[0], thirdSquare[1]);
            areFilledSquares = !isAnEmptySquare(firstValue) && !isAnEmptySquare(secondValue) && !isAnEmptySquare(thirdValue);
            if (firstValue == secondValue && firstValue == thirdValue && areFilledSquares) {
                return firstValue;
            }
        }
        return 'a';
    }

    public char verifySquare(int row, int column) {
        return table[row][column];
    }

    @Override
    public String toString() {
        String line = "===|===|===\n";
        String tableString = " ";
        boolean isNotA;
        char squareValue;
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                squareValue = table[row][column];
                isNotA = squareValue != 'a';
                if (column == 2) {
                    tableString += (isNotA ? squareValue : " ") + "\n";
                } else {
                    tableString += (isNotA ? squareValue : " ") + " | ";
                }
            }
            if (row != 2) {
                tableString += line + " ";
            }
        }
        return tableString;
    }
}
