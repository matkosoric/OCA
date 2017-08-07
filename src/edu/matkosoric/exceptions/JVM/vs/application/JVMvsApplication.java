package edu.matkosoric.exceptions.JVM.vs.application;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import java.util.IllegalFormatCodePointException;

public class JVMvsApplication {

    // these are the exceptions typical for the JVM
    public static void JVM () throws    IndexOutOfBoundsException,
                                        ArrayIndexOutOfBoundsException,
                                        StringIndexOutOfBoundsException,
                                        ClassCastException,
                                        NullPointerException {

    }

    // these are the exceptions typical for the application
    public  static void application () throws   IllegalArgumentException,
                                                IllegalStateException,
                                                SecurityException {

    }

}
