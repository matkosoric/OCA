package edu.matkosoric.operators.assigning.sequence;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import java.util.Arrays;

public class Assigning {

    public static void main(String[] args) {

        int a = 2;
        // after each assignment, a changes its value
        a += (a=3) + a*4 + (a=10) / 2 + (a=1) + a*3;                            // weird but valid
        System.out.println(a);

        byte b [] = {3, 9};
//        b[1] += (b[0]=2) + b[0]++ - (b[1] = 5) + --b[1]/--b[0] + b[1]/4;         // weird but valid. b[0]++ returns 2, not 3
        System.out.println(Arrays.toString(b));

    }

}
