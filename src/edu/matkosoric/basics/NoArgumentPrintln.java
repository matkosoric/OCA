package edu.matkosoric.basics;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class NoArgumentPrintln {

    public static void main(String[] args) {

        // System.out.println() works with various arguments, including a no-argument call
        System.out.println("String");
        System.out.println(1234);
        System.out.println();       // compiles just fine, but does not produce any output

    }
}
