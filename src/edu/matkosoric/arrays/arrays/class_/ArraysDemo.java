package edu.matkosoric.arrays.arrays.class_;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {


        int [] countdown1 = {4, 3, 2, 1, 0};
        int [] countdown2 = {4, 3, 2, 1, 0};

        System.out.println(countdown1 == countdown2);       // output: false
        System.out.println(countdown1.equals(countdown2));  // output: false
//        System.out.println(Arrays.deepEquals(countdown1, countdown2));      // does not compile

        int [] [] uninitialisedArray1 = new int [3] [];
//        System.out.println(uninitialisedArray1[1][1]);   // NullPointerException, since second dimension is not declared
        int [] [] uninitialisedArray2 = new int [3] [3];
        System.out.println(uninitialisedArray2[1][1]);      // prints zero, due to the default values




    }

}
