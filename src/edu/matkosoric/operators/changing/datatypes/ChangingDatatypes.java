package edu.matkosoric.operators.changing.datatypes;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class ChangingDatatypes {

    public static void main(String[] args) {

        // operators implicitly change the data type of its operands
        // data types smaller than int are casted to int

        byte a = 3;
        byte b = 2;
//        byte c = a + b;         // does not compile
        byte d = (byte) (a+b);
        System.out.println(d);

        byte a2 = 10;
        byte b2 = 5;
//        byte c2 = a2 / b2;      // does not compile
        byte d2 = (byte) (a2/b2);
        System.out.println(d2);

        short i = 5;
        short j = 4;
//        short k = i + j;        // does not compile
        short l = (short) (i+j);
        System.out.println(l);

        double e = 10.0;
        int f = 20;
        double g = e + f;           // integer is casted to double
        System.out.println(g);
    }
}
