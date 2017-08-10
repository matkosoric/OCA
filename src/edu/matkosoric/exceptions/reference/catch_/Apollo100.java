package edu.matkosoric.exceptions.reference.catch_;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Apollo100 {

    public static void main(String[] args) {

        // object with WarpDrive as a reference type does not have to enclose engage() method with a try-catch
        WarpDrive apollo101 = new WarpDrive();
        apollo101.engage();

        // however, object with RocketDrive as a reference type has to secure its engage() method

        RocketDrive apollo102 = new RocketDrive();
//        apollo102.engage();         // does not compile
        try {
            apollo102.engage();
        } catch (Exception e) {

        }


        RocketDrive apollo103 = new WarpDrive();
//        apollo103.engage();         // does not compile
        try {
            apollo103.engage();
        } catch (Exception e) {

        }

    }

}
