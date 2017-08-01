package edu.matkosoric.exceptions.exception.from.constructor;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Superman {

    // constructor can throw an exception
    // and if it is a checked exception, it has to be handled
    // just like any other checked exception

    String name;
    int age;

    Superman() throws Exception {
        name = "Clark Kent";
        age = 200;
        throw new Exception("exception from a constructor");
    }

    public static void main(String[] args) {
        try {
            Superman a = new Superman();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
