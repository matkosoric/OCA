package edu.matkosoric.datatypes.comparing.wrappers;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class ComparingWrappers {



    public static void main(String[] args) {

        // equals() method will return false if wrappers do not match each other.
        Byte b1 = 4;
        Short s1 = 4;
        System.out.println(b1.equals(s1));      // false

        // matching wrapper and value will return true from equals() method
        Byte b2 = 8;
        Byte b3 = 8;
        System.out.println(b2.equals(b3));      // true

        // equals() method will return false if wrappers do not match each other.
        Double d1 = 15.9;
        Float f1 = 15.9f;
        System.out.println(d1.equals(f1));      // false

        // compares value
        Double d2 = 13.1;
        double d3 = 13.1;
        System.out.println(d2.equals(d3));      // true

        Double d4 = 9.3;
        int i1 = 9;
        System.out.println(d4.equals(i1));      // false

        Double d5 = 8.0;
        int i2 = 8;
        System.out.println(d5.equals(i2));      // false



        Byte b4 = 2;
        Short s2 = 2;
//        System.out.println(b4 == s2);       // does not compile

        Byte b5 = 9;
        Byte b6 = 9;
        System.out.println(b5 == b6);           // true

        Double d6 = 1.12;
        Double d7 = 1.12;
        System.out.println(d6 == d7);           // always false

        Float f2 = 7.4f;
        Float f3 = 7.4f;
        System.out.println(f2 == f3);           // always false

        double d8 = 2.2;
        double d9 = 2.2;
        System.out.println(d8 == d9);           // true, compares values

        double d10 = 4.0;
        int i3 = 4;
        System.out.println(d10 == i3);          // true

        Double d11 = 5.0;
        int i4 = 5;
        System.out.println(d11 == i4);          // true


    }

}
