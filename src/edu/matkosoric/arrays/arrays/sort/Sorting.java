package edu.matkosoric.arrays.arrays.sort;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {

        int [] shuffled = new int[] {1945, 1914, 1990, 1918, 1941};

        // this will sort array in ascending order
        Arrays.sort(shuffled);
        for (int element : shuffled)
            System.out.println(element);

        // this will return index of searched value
        System.out.println(Arrays.binarySearch(shuffled,1990));     //returns index 4


        // this will partially sort array, starting from index 2 to element right before inputted index.
        // in this case, it will only switch 1990 and 1918.
        int [] shuffled2 = new int[] {1945, 1914, 1990, 1918, 1941};
        Arrays.sort(shuffled2, 2, 4);
        for (int element : shuffled2)
            System.out.println(element);

    }

}
