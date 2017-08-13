package edu.matkosoric.operators.ternary;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Returning {

    // first part of ternary statement should return true or false value,
    // while second and third part should return the same type, not limited to the boolean.
    // break and continue statement do not continue anything.

    public static void main(String[] args) {

        String a = 5 < 3 ? "South Korea" : "North Korea";   // valid statement

//        String b =  true != false ? "cocount" : 'g';        // does not compile, type mismatch


        byte x1 = 3;
        short x2 = 5;
        int y = 1 != 3 ? x1 : x2;       // valid code, since byte and short can be widened to int

        byte x3 = 9;
        int x4 = 10;
//        short y2 = 1<4 ? x3 : x4;       // does not compile, x4 has to be narrowed to short

        long x5 = 203L;
        float x6 = 532.01f;
        double y3 = 4>34 ? x5 : x6;     // valid code

        double x7 = 339.22;
        float x8 = 3828.123f;
//        long y4 = 1<3 ? x7 : x8;              // does not compile
//        long y5 = 1<3 ? x7 : (long) x8;       // does not compile, still
        long y6 = 1<3 ? (long) x7 : (long) x8;

        for (int i = 0; i < 6; i++ ) {
            System.out.println(i);
//            i < 3 ? continue : break;                     // does not compile
        }
    }
}
