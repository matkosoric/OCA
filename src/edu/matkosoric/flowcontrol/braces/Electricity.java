package edu.matkosoric.flowcontrol.braces;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Electricity {

    // this is deceiving if-else statement, since there is no else keyword.
    // any statement can be enclosed with braces, and it does not violate java syntax.

    public static void main(String[] args) {

        boolean electricity = false;

        if (electricity) {
            System.out.println("watch out!");
        } {
            System.out.println("not dangerous");
        }

    }
}
