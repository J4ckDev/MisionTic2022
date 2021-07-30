/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenas;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author j4ckdev
 */
public class Cadenas {
    
    public static String reverseString (String text){
        int stringLength = text.length();
        String newString = "";
        for (int index = stringLength-1; index >= 0; index--) {
            newString += text.charAt(index);
        }
        return newString;
    }

    public static boolean isPalindrome(String text){
        String textInverted = reverseString(text);
        return text.equals(textInverted);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Problema 1
        System.out.println("Ejercicio 1");
        System.out.println("Ingrese una cadena: ");
        String text = sc.nextLine();
        int textLength = text.length();
        System.out.println("Ingrese la letra para contar sus apariciones en el texto: ");
        char letterToFind = sc.nextLine().charAt(0);
        int totalAppearances = 0;
        for (int index = 0; index < textLength; index++) {
            if (letterToFind == text.charAt(index)) {
                totalAppearances++;
            }
        }
        System.out.println("La letra " + letterToFind + " aparece " + totalAppearances + " veces.");
        System.out.println("");

        // Problema 2
        System.out.println("Ejercicio 2");
        System.out.println("Ingrese una cadena: ");
        text = sc.nextLine();
        text = text.toLowerCase();
        // Con ciclos
//        int asciiCode;
//        boolean haveSimbols = false;
//        for (char letter : text.toCharArray()) {
//            asciiCode = (int) letter;
//            if (asciiCode < 32 || (asciiCode > 32 && asciiCode < 97) || (asciiCode > 122 && asciiCode < 129) || (asciiCode > 130 && asciiCode < 160) || asciiCode > 165) {
//                haveSimbols = true;
//                break;
//            }
//        }
//        String answer = haveSimbols.matches() ? "La cadena tiene otro tipo de símbolos :(" : "La cadena solo es de letras :D";

        // Con expresiones regulares
        Pattern patternToMatch = Pattern.compile("^[a-záéíóúüñ\\s]+$");
        Matcher matcher = patternToMatch.matcher(text);
        boolean notHaveSimbols = matcher.matches();
        String answer = notHaveSimbols ? "La cadena solo es de letras :D" : "La cadena tiene otro tipo de símbolos :(";
        System.out.println(answer);
        System.out.println("");

        // Problema 3
        System.out.println("Ejercicio 3");
        System.out.println("Ingrese una cadena: ");
        text = sc.nextLine();
        text = text.toLowerCase();
        // Con ciclos
//        int asciiCode;
//        int totalConsonants = 0;
//        for (char letter:text.toCharArray()){
//            asciiCode = (int) letter;
//            if ((asciiCode > 97 && asciiCode < 101) || (asciiCode > 101 && asciiCode < 105) || (asciiCode > 105 && asciiCode < 111) || (asciiCode>111 && asciiCode< 117) || (asciiCode>117 && asciiCode<123)) {
//                totalConsonants++;
//            }
//        }
        // Con expresiones regulares
        patternToMatch = Pattern.compile("[^b-df-hj-nñp-tv-z]");
        matcher = patternToMatch.matcher(text);
        matcher.find();
        int totalConsonants = matcher.replaceAll("").length();
        System.out.println("La cadena tiene " + totalConsonants + " consonantes.");
        System.out.println("");

        // Problema 4
        System.out.println("Ejercicio 4");
        System.out.println("Ingresa la primera cadena: ");
        String firstString = sc.nextLine();
        System.out.println("Ingresa la segunda cadena: ");
        String secondString = sc.nextLine();
        boolean areEqualStrings = firstString.equals(secondString);
        System.out.println(areEqualStrings ? "Las cadenas son iguales" : "Las cadenas no son iguales");
        System.out.println("");

        // Problema 5
        System.out.println("Ejercicio 5");
        System.out.println("Ingresa la primera cadena: ");
        firstString = sc.nextLine();
        System.out.println("Ingresa la segunda cadena: ");
        secondString = sc.nextLine();
        String stringConcatenated = firstString.concat(secondString);
        System.out.println(stringConcatenated);
        System.out.println("");

        // Problema 6
        System.out.println("Ejercicio 6");
        System.out.println("Ingrese una cadena: ");
        text = sc.nextLine();
        String newString = reverseString(text);
        System.out.println(newString);
        System.out.println("");

        // Problema 7
        System.out.println("Ejercicio 7");
        System.out.println("Ingrese una cadena: ");
        text = sc.nextLine();
        System.out.println(isPalindrome(text) ? "El texto es palíndromo" : "El texto no es palíndromo.");
        System.out.println("");

    }

}
