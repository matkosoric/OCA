package edu.matkosoric.exceptions.class_.cast;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class DownCasting {

    // this will compile, but throw java.lang.ClassCastException at runtime

    public static void main(String[] args) {

        String s = (String) getObject();

    }

    static Object getObject () {
        return new Object();
    }

}
