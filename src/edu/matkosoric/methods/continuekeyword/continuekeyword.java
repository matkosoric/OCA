package edu.matkosoric.methods.continuekeyword;

/**
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class continuekeyword {

    // continue keyword can not be called from method.
    // it can be used in loops only.

    public static void main(String[] args) {

        callingSomeAlternativeMethod();
//        continue;       // does not compile
    }

    private static void callingSomeAlternativeMethod() {

        System.out.println("Hello from this method!");
//        continue;       // does not compile
        System.out.println("Second statement");
    }
}
