package edu.matkosoric.basics;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Activity {

    // method can not be called 'do()', because 'do' is one of the java keywords

    public static void main(String[] args) {

        doIt();

        done();

//        do();

    }

    static void doIt () {
        System.out.println("Doing it.");
    }

    static void done () {
        System.out.println("Done");
    }

//    static void do () {
//        System.out.println("Doing");
//    }

}
