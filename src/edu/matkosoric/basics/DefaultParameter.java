package edu.matkosoric.basics;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class DefaultParameter {

    public static void main(String[] args) {

        // method parameters do not have default values.
        // for method call to work, parameters have to be stated as required.
        // or else the compiler will produce an error.

        strollingInAPark("Central Park");
//        strollingInAPark();           // does not compile

    }

    private static void strollingInAPark(String nameOfThePark) {
        System.out.println("Strolling");
    }
}
