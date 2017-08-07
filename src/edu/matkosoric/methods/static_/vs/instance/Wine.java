package edu.matkosoric.methods.static_.vs.instance;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Wine {

    // static method
    public static void printColor () {
        System.out.println("Red color.");

        // static methods can call other static methods
        printType();
        Wine.printType();       // identical to the previous statement

        // however, static methods can not call instance methods
//        printContainer();         // does not compile
//        printConsumer();          // does not compile
    }

    // static method
    public static void printType () {
        System.out.println("Red type");
    }




    // instance method
    public void printContainer () {
        System.out.println("Bottle");

        // instance methods can call static methods
        // and other instance methods.
        printType();
        Wine.printType();           // identical to the previous statement
        printColor();
        Wine.printColor();          // identical to the previous statement

        printConsumer();
        printContainer();           // recursive call, which will compile, but also crash the application
//        Wine.printConsumer();       // does not compile
//        Wine.printContainer();      // does not compile
    }

    // instance method
    public void printConsumer () {
        System.out.println("Matko");
    }



}
