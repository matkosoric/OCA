package edu.matkosoric.methods.choosing.proper.method;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Choose {

    static void printMethod (int a) {
        System.out.println("int: " + a);
    }

    static void printMethod (short ... a) {
        System.out.println("var arg short: " + a);
    }


    // code will execute without char overload
//    static void printMethod (char a) {
//        System.out.println("char: " + a);
//    }

    public static void main(String[] args) {

        short x = 5;
        char y = 'p';

        printMethod(x);
        printMethod(y);
    }

}
