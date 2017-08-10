package edu.matkosoric.methods.constructor;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Warewholf {

    Warewholf () {
        System.out.println("regular constructor");
    }

    // constructor can take itself as a parameter
    Warewholf (Warewholf w) {
        System.out.println("weird, but valid constructor");
    }

    // constructor can not be static
//    static Warewholf () {
//        System.out.println("invalid");
//    }

    // constructor can not be final
//    final Warewholf () {
//        System.out.println("invalid");
//    }

    // constructor can not be abstract
//    abstract Warewholf () {
//        System.out.println("invalid");
//    }

    public static void main(String[] args) {

        Warewholf a = new Warewholf();
        Warewholf b = new Warewholf(new Warewholf());

    }

}
