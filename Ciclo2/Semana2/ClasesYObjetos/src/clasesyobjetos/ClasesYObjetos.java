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
        char winner;
        System.out.println("Triki inicializado");
        System.out.println();
        System.out.println(triki.toString());
        triki.fillSquare('x', 0, 1);
        System.out.println(triki.toString());
        winner = triki.verifyWinner();
        System.out.println("Hay ganador? " + (winner == 'a' ? "No" : ("Sí, el jugador que usó " + winner)));
        System.out.println();
        triki.fillSquare('o', 2, 2);
        System.out.println(triki.toString());
        winner = triki.verifyWinner();
        System.out.println("Hay ganador? " + (winner == 'a' ? "No" : ("Sí, el jugador que usó " + winner)));
        System.out.println();
        triki.fillSquare('x', 1, 1);
        System.out.println(triki.toString());
        winner = triki.verifyWinner();
        System.out.println("Hay ganador? " + (winner == 'a' ? "No" : ("Sí, el jugador que usó " + winner)));
        System.out.println();
        triki.fillSquare('o', 2, 1);
        System.out.println(triki.toString());
        winner = triki.verifyWinner();
        System.out.println("Hay ganador? " + (winner == 'a' ? "No" : ("Sí, el jugador que usó " + winner)));
        System.out.println();
        triki.fillSquare('X', 2, 0);
        System.out.println(triki.toString());
        winner = triki.verifyWinner();
        System.out.println("Hay ganador? " + (winner == 'a' ? "No" : ("Sí, el jugador que usó " + winner)));
        System.out.println();
        triki.fillSquare('o', 0, 0);
        System.out.println(triki.toString());
        winner = triki.verifyWinner();
        System.out.println("Hay ganador? " + (winner == 'a' ? "No" : ("Sí, el jugador que usó " + winner)));
        System.out.println();        
        triki.fillSquare('x', 0, 2);
        System.out.println(triki.toString());
        winner = triki.verifyWinner();
        System.out.println("Hay ganador? " + (winner == 'a' ? "No" : ("Sí, el jugador que usó " + winner)));
        System.out.println();
    }

}
