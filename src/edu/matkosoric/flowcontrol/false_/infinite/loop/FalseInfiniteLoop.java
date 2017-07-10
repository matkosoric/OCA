package edu.matkosoric.flowcontrol.false_.infinite.loop;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class FalseInfiniteLoop {

    public static void main(String[] args) {

        byte counter = 0;

        // this only looks like an infinite loop,
        // while in fact it has a definite number of iterations,
        // depending on the counter variable type
        while (counter-- < 10) {
            continue;
        }

        // subtracting from a minimum part of the spectrum
        // produces value on the maximum part of the spectrum
        System.out.println(counter);

    }

}
