package edu.matkosoric.polymorphism.constructor.chaos;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Dog extends Wolf{

    public void barking () {
        System.out.println("Dog bark!");
    }


    public static void main(String[] args) {

        Dog megan = new Dog();
        megan.barking();

        Wolf alpha = new Wolf();
        alpha.barking();

        Wolf omega = new Dog();
        omega.barking();

    }

}
