package edu.matkosoric.datatypes.scope;

/**
 * Created by matko on 24.5.2017..
 */
public class scopeIssue {

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
