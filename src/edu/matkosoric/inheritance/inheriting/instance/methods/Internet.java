package edu.matkosoric.inheritance.inheriting.instance.methods;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Internet extends Arpanet{

    // there is a difference in inheriting instance and static methods

    public void utilisation () {
        System.out.println("economy");
    }

    public static void printName () {
        System.out.println("Internet");
    }

    public static void main(String[] args) {

        // instance methods
        Arpanet a = new Arpanet();
        a.utilisation();

        Internet b = new Internet();
        b.utilisation();

        // although c has Arpanet as a reference type, method from Internet class is called
        Arpanet c = new Internet();
        c.utilisation();



        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // static methods
        a.printName();

        b.printName();

        // reference type of Arpanet class determines the method to be called
        c.printName();


        // if called without instance, class's own static method is executed
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        printName();

    }


}
