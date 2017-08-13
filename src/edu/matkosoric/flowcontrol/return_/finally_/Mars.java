package edu.matkosoric.flowcontrol.return_.finally_;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Mars {

    // despite the return statement in try block,
    // finally block is nonetheless executed

    public static void main(String[] args) {

        travelToMars(false);

    }

    static void  travelToMars (boolean launch) {
        try {
            if (launch == false)
                return;
        } catch (Exception e) {
            System.out.println("exception");
        } finally {
            System.out.println("the end");
        }
    }

}
