package edu.matkosoric.exceptions.static_;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Loading {

    // static and instance initializer can not throw java.lang.Exceptions
    // but can throw RuntimeExceptions, although not directly, since code will not compile

//    static {
//        throw new NullPointerException();
//    }

//    {
//        throw new NullPointerException();
//    }

    static {
        int a = 5 / 0;      // this will throw java.lang.ExceptionInInitializerError, and stacktrace will
                            // reveal java.lang.ArithmeticException: / by zero as a cause of that error.
    }

    {
//        int b = null;       // does not compile
    }


    public static void main(String[] args) {

    }

}
