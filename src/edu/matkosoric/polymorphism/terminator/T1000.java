package edu.matkosoric.polymorphism.terminator;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class T1000 extends T800 {

    // static and private methods are never inherited, and
    // therefore, do not succumb to the rules of polymorphism

    public static void main(String[] args) {

        T800 terminator1 = new T800();
        T800 terminator2 = new T1000();
        T1000 terminator3 = new T1000();

        terminator1.findJohnConnor();
        terminator2.findJohnConnor();       // if method was not static, invoked method would be from the object type: T-1000
        terminator3.findJohnConnor();

    }

    public static void findJohnConnor () {
        System.out.println("T-1000 ... searching for John Connor...");
    }
}
