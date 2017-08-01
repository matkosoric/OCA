package edu.matkosoric.exceptions.redundant.catch_;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class RedundantCatching {

    // runtime exceptions do not have to be enclosed with a try-catch block,
    // or declared in a method signature, but enclosing them or declaring them
    // will not affect the compilation

    public static void main(String[] args) {

        someMethod1();
        someMethod2();
        someMethod3();

    }

    private static void someMethod1() {
        throw new StringIndexOutOfBoundsException();
    }

    private static void someMethod2() throws StringIndexOutOfBoundsException{
        throw new StringIndexOutOfBoundsException();
    }

    private static void someMethod3() {
        try {
            throw new StringIndexOutOfBoundsException();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Catched!");
        }
    }

}
