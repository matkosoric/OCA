package edu.matkosoric.flowcontrol.dowhile.counter;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Counter {

    // adding numbers smaller than 12 and undividable by three

    public static void main(String[] args) {

        int counter = 0, sum = 0;

        do {
            if (counter % 3 == 0) continue;
            sum += counter;
        } while (counter++ < 11);
        System.out.println(sum);
    }
}
