package edu.matkosoric.basics;

/**
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class scopeIssue {

    public static void main(String[] args) {

        int marathonLength = 40;

        // this seems like a simple infinite loop, but in fact it is a scope issue
        // variables declared within do block are out of scope in the while condition

//        do {
//            int distanceSoFar = 0;
//            distanceSoFar++;
//        } while (distanceSoFar < marathonLength);       // this line does not compile

    }

}
