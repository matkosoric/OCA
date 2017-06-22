package edu.matkosoric.flowcontrol.assignment.within.ifcondition;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class WeirdIfCondition {

    public static void main(String[] args) {

        // if a condition of a IF statement returns boolean value, it is valid
        // despite the fact there is no == operator

        boolean a = false;
        if (a = 3 < 5 ? true : false) {
            System.out.println("1. Valid IF condition");
        }

        if ("Jimmy Hendrix".contains("rix")) {
            System.out.println("2. Valid IF condition");
        }

        if (new Integer[5].length < 9) {
            System.out.println("3. Valid IF condition");
        }

    }
}
