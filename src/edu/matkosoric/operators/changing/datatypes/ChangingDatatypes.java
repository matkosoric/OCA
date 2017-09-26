package edu.matkosoric.operators.changing.datatypes;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class ChangingDatatypes {

    public static void main(String[] args) {

        // operators implicitly change the data type of its operands.
        // data types smaller than int are casted to int

        byte a1 = 3;
        byte a2 = 2;
//        byte a3 = a1 + a2;         // does not compile
        byte a4 = (byte) (a1+a2);
        System.out.println(a4);     // 5

        byte b1 = 10;
        byte b2 = 5;
//        byte b3 = b1 / b2;      // does not compile
        byte b4 = (byte) (b1/b2);
        System.out.println(b4);         // 2

        short c1 = 5;
        short c2 = 4;
//        short c3 = c1 + c2;        // does not compile
        short c4 = (short) (c1+c2);
        System.out.println(c4);         // 9

        double d1 = 10.0;
        int d2 = 20;
        double d3 = d1 + d2;           // integer is casted to double
        System.out.println(d3);         // 30.0

        long e1 = 2;
        float e2 = 6;
//        long e3 = e1 + e2;              // does not compile
        long e4 = (long)(e1+e2);
        System.out.println(e4);         // 8


        short f1 = 5;
        int f2 = 3;
        float f3 = 1f;
        Object f4 = f1 + f2 + f3;
        System.out.println(f4 instanceof Float);            // true
        System.out.println(f4 instanceof Double);           // false
        System.out.println(f4 instanceof Short);            // false


    }
}
