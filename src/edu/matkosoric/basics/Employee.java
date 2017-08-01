package edu.matkosoric.basics;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Employee {

    // variable (or, identifier) can not be abstract

//    abstract int paycheck1 = 100;               // does not compile, instance variable
//    abstract static int paycheck2 = 100;        // does not compile, static variable


    public static void main(String[] args) {

//        abstract int paycheck3 = 100;       // does not compile, local variable

    }
}


abstract class Employer {

    abstract void payingSalay ();           // method can be abstract

//    abstract int paycheck1 = 100;             // does not compile
//    abstract static int paycheck2 = 100;      // does not compile

}