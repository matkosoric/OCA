package edu.matkosoric.datatypes.default_.values;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class IntegerWrapper {

    // primitive wrappers have to be initialised before use, just like any other proper object,
    // or there will be a NullPointerException.

    static int a;
    static Integer b;

    public static void main(String[] args) {

        System.out.println(a);      // output: 0
        System.out.println(b);      // output: null

        System.out.println(++a);    // ouput: 1
//        System.out.println(++b);  // NullPointerException

    }
}
