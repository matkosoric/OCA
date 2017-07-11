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
        // depending on the variable type
        while (counter-- < 10) {
            continue;
        }
        System.out.println("Final value of the counter variable: " + counter + "\n");

        // subtracting one from a minimum value will
        // produce a maximum value on the other part of the spectrum
        System.out.println(Integer.MIN_VALUE - 1 + " equals " + Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE - 1 + " equals " + Long.MAX_VALUE);

        // types smaller than Integer are implicitly casted to Integer
        System.out.println(Short.MIN_VALUE - 1 + " is not equal " + Short.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE - 1 + " is not equal " + Byte.MAX_VALUE);

        // decimal point types also behave weird
        System.out.println(Double.MIN_VALUE - 1 + " is not equal " + Double.MAX_VALUE);
        System.out.println(Float.MIN_VALUE - 1 + " is not equal " + Float.MAX_VALUE);
    }

}
