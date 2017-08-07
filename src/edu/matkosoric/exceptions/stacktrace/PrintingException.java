package edu.matkosoric.exceptions.stacktrace;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class PrintingException {

    public static void main(String[] args) {

        try {
            method1();
        } catch (Exception e) {
            System.out.println(e);      // this will print exception type and message from the constructor
            e.printStackTrace();        // this will print exteption type, message, and stack trace
        }

    }


    static void method1 () throws Exception {
        method2();
    }

    static void method2() throws Exception {
        method3();
    }

    static void method3 () throws Exception {
        throw new ArithmeticException("third level exception");
    }

}
