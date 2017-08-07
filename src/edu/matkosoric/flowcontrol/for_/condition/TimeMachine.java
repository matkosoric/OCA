package edu.matkosoric.flowcontrol.for_.condition;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class TimeMachine {

    // in case an exit condition in a for loop returns false even before the loop has started,
    // body of the for loop will not be executed even once.

    public static void main(String[] args) {

        int targetYear = 2017;

        for (; targetYear > 2035; ) {
            System.out.println(targetYear);
            targetYear++;
        }

        System.out.println(targetYear);

    }
}
