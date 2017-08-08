package edu.matkosoric.exceptions.finally_.exception;

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
            drivingRight();
        } finally {
            drivingLeft();
        }

    }

    public static void drivingRight () throws LeftSideDrivingException {throw new LeftSideDrivingException();}

    public static void drivingLeft () throws RightSideDrivingException {throw new RightSideDrivingException();}

}


