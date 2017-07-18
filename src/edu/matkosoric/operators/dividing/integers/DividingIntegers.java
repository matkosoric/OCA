package edu.matkosoric.operators.dividing.integers;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class DividingIntegers {

    public static void main(String[] args) {

        // in the case of integer division, remainder is discarded
        // despite the fact float type can accommodate it

        int a = 23;
        int b = 5;
        float c = a / b;
        System.out.println(c);

    }

}
