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
public class Password {

    private int length;
    private String password = "";

    public Password() {
        this.length = 8;
        generatePassword();
    }

    public Password(int length) {
        this.length = length;
        generatePassword();
    }

    private void generatePassword() {
        int randomAscii;
        char character;
        for (int number = 0; number < length; number++) {
            if (number == 0) {
                randomAscii = (int) Math.floor(Math.random() * (90 - 65) + 65);
            } else if (number == 1) {
                randomAscii = (int) Math.floor(Math.random() * (122 - 97) + 97);
            } else if (number >= 2 && number <= 6) {
                randomAscii = (int) Math.floor(Math.random() * (57 - 48) + 48);
            } else {
                randomAscii = (int) Math.floor(Math.random() * (125 - 33) + 33);
            }
            character = (char) randomAscii;
            password += character;
        }
    }

    public boolean isStrong() {
        int countCapitalLetter = 0;
        int countLowLetter = 0;
        int countNumbers = 0;
        for (int character : password.toCharArray()) {
            if (character > 96 && character < 123) {
                countLowLetter++;
                continue;
            }
            if (character > 64 && character < 91) {
                countCapitalLetter++;
                continue;
            }
            if (character > 47 && character < 58) {
                countNumbers++;
            }
        }
        return countCapitalLetter >= 1 && countLowLetter >= 1 && countNumbers >= 5;
    }

    public void changePassword(String newPassword) {
        password = newPassword;
        length = password.length();
    }

    @Override
    public String toString() {
        return "La contraseña guardada es " + password + " y tiene una longitud de " + length + " caracteres.";
    }
}
