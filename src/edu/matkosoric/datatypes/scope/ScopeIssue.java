package edu.matkosoric.datatypes.scope;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class ScopeIssue {

    public static int number = 777;       // class-wide scope

    public static void main(String[] args) {

        // in the case of two variables with identical names and different scopes,
        // the closer one dominates

        int number = 0;     // method-wide scope
        System.out.println("Shadowed by local variable: " + number);
        secondMethod();
        System.out.println("Shadowed by local variable: " + number + ", again!");
        thirdMethod();
    }

    public static void secondMethod() {
        // this method has access only to the class-wide value of "number" variable
        System.out.println("Class range: " + number);
    }

    private static void thirdMethod() {
        int number = 878787;
        System.out.println("Value in the third method: " + number);
    }

}
