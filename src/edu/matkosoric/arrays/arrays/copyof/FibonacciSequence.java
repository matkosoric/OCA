package edu.matkosoric.arrays.arrays.copyof;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import java.util.Arrays;

public class FibonacciSequence {

    // Arrays.copyOf will copy elements from one array to the other

    public static void main(String[] args) {

        int fibonacciSequence [] = new int[]{0,1,1,2,3,5,8,13};

        int fibonacciSequenceCopy[] = Arrays.copyOf(fibonacciSequence,8);

        for (int element : fibonacciSequenceCopy)
            System.out.println(element);


        // this will copy only first three elements (0,0,1)
        int fibonacciSequenceCopy2 [] = Arrays.copyOf(fibonacciSequence, 3);

        for (int element : fibonacciSequenceCopy2)
            System.out.println(element);

    }

}
