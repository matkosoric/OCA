package edu.matkosoric.exceptions.finally_.after;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

class LeftSideDrivingException extends Exception {}

class RightSideDrivingException extends Exception {}

public class Driving {

    // this will throw RightSideDrivingException,
    // while ignoring the initial throw of LeftSideDrivingException.

    public static void main(String[] args) throws Exception{

        try {
            throw new Exception();
        } catch (Exception e) {

        }
        System.out.println("Catching exception prevents the program from crashing.");

        // the code after the unhandled exception is not executed
        try {
            drivingRight();
        } finally {
            drivingLeft();
        }
        System.out.println("This is not printed, since the code after the " +
                "finally block is not executed in the case of emerged exception");

    }

    public static void drivingRight () throws LeftSideDrivingException {throw new LeftSideDrivingException();}

    public static void drivingLeft () throws RightSideDrivingException {throw new RightSideDrivingException();}

}


