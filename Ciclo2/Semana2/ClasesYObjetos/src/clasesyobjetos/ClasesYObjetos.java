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
public class ClasesYObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 1
        Person johnDoe = new Person("John Doe", 35, "Masculino", 70, 1.82);
        System.out.println(johnDoe.calculateBodyMassIndex());
        System.out.println(johnDoe.haveLegalAge());
        System.out.println(johnDoe.toString());
        System.out.println();

        // Ejercicio 2
        Password password = new Password(6);
        System.out.println(password.toString());
        System.out.println(password.isStrong() ? "La contraseña es segura" : "La contraseña no es segura");
        password.changePassword("SoyLaNueva12345*");
        System.out.println(password.toString());
        System.out.println(password.isStrong() ? "La contraseña es segura" : "La contraseña no es segura");
        System.out.println();

        // Ejercicio 3
        TicTacToe triki = new TicTacToe();
        char winner = 'a';
        char nextMove = 'X';
        int row;
        int column;
        byte totalMoves = 0;
        boolean isSquareFilled;
        boolean isGameRunning = true;
        System.out.println("Triki inicializado");
        System.out.println("Siguiente turno: " + nextMove);
        System.out.println();
        System.out.println(triki.toString());
        while (isGameRunning) {
            row = (int) Math.floor(Math.random() * 3);
            column = (int) Math.floor(Math.random() * 3);
            isSquareFilled = triki.fillSquare(nextMove, row, column);
            winner = triki.verifyWinner();
            isGameRunning = winner == 'a' && totalMoves < 9;
            if (isGameRunning) {
                if (!isSquareFilled) {
                    continue;
                }
                nextMove = nextMove == 'X' ? 'O' : 'X';
                System.out.println("Siguiente turno: " + nextMove);
            } else {
                System.out.println(winner == 'a' ? "Terminó en empate." : "El ganador fue " + winner);
            }
            System.out.println();
            System.out.println(triki.toString());
            totalMoves++;
        }
        System.out.println();

        // Ejercicio 4     
        PacMan pacman = new PacMan();
        Board board = new Board(pacman);
        boolean isAlive = true;
        boolean loseALife;
        System.out.println("PacMan Iniciado");
        System.out.println();
        while (isAlive) {
            pacman.sumScore();
            loseALife = Math.random() > 0.95;
            if (loseALife) {
                pacman.subtractLife();
            }
            isAlive = pacman.isAlive();
        }
        System.out.println("El juego ha terminado.");
        System.out.println();
        System.out.println("PacMan llegó hasta el nivel " + board.checkCurrentLevel() + " con un puntaje de " + pacman.getScore());
    }

}
