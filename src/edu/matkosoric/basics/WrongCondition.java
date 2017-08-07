package edu.matkosoric.basics;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class WrongCondition {

    // this is not a DivisionByZeroException, but a compile-time error
    // due to the missing boolean value in the if condition

    public static void main(String[] args) {

        byte a = 60;
        byte b = 0;

//        if ( a/b ) System.out.println("No problemo!");      // does not compile

    }
}
