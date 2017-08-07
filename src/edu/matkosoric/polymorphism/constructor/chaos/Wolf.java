package edu.matkosoric.polymorphism.constructor.chaos;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Wolf {

    public Wolf () {
        System.out.println("...wolf constructor");
        barking();          // this will call barking from the Dog class, when called from the Dog object
    }

    public void barking () {
        System.out.println("Wolf bark!");
    }

}
