package edu.matkosoric.operators.plus.overloads;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class AddingWrappers {

    public static void main(String[] args) {

        Integer a = 6;
        Double b = 6.0;
        Object c = a + b;
        System.out.println(((Double) c).intValue());        // output: 12

    }
}
