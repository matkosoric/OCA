package edu.matkosoric.operators.dividing.integers;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class DividingIntegersMethod {

    public static void main(String[] args) {

        System.out.println(divideUs(100,20));   // output 5.0
        System.out.println(divideUs(110,20));   // output 5.0, despite the fact that double type can hold value of 5.5

        short argument1 = 9;
        System.out.println(divideUs(argument1, 3));         // short type is implicitly up-casted to int

        long argument2 = 15l;
//        System.out.println(divideUs(argument2, 5));         // does not compile, long has to be explicitly down-casted to int
        System.out.println(divideUs((int)argument2, 5));

    }

    static double divideUs (int a, int b) {
        return a/b;
    }
}


