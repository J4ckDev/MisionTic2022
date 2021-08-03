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
public class Person {

    private final String name;
    private final int age;
    private final String gender;
    private final double weight;
    private final double height;

    public Person(String name, int age, String gender, double weight, double height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
    }

    public double calculateBodyMassIndex() {
        return weight / (Math.pow(height, 2));
    }

    public boolean haveLegalAge() {
        return age >= 18;
    }

    @Override
    public String toString() {
        return "Me llamo " + name + ".\n"
                + "Tengo " + age + " años "
                + "y mi género es " + gender + ".\n"
                + "Mi peso es de " + weight + " kg "
                + " y mi altura es de " + height + " m";
    }
}
