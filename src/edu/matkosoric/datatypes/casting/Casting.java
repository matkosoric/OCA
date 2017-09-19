package edu.matkosoric.datatypes.casting;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Casting {

    // string can not be casted to int

    public static void main(String[] args) {

//        int number = (int) args [0];        // does not compile

        // BOOLEAN
        // none of the other data types can not be casted to boolean
//        boolean b1 = 5;
//        boolean b2 = (boolean)5;
//        boolean b4 = (byte)5;
//        boolean b5 = (boolean)(byte)5;
//        boolean b6 = (short)5;
//        boolean b7 = (boolean)(short)5;
//        boolean b8 = (int)5;
//        boolean b9 = (boolean)5;
//        boolean b10 = (char)5;
//        boolean b11 = (boolean)(char)5;
//        boolean b12 = 'k';
//        boolean b13 = "string";
//        boolean b14 = "false";

        // SHORT

        short s1 = 8;
        short s2 = (int)8;
        short s3 = (byte)8;
//        short s4 = false;       // does not compile
        short s4 = (char)8;
        short s5 = 'r';
//        short s6 = "3";         // does not compile
//        short s7 = "Napoleon";  // does not compile



        // INT
        int i1 = 72;
//        int i2 = 72.3;      // does not compile
        int i3 = (int)72.3;
//        int i4 = 72L;       // does not compile
        int i5 = (short)72;
        int i6 = (byte)72;
//        int i7 = 72.0f;         // does not compile without explicit downcast
        int i8 = (int)72.0f;
//        int i9 = 72.0;          // does not compile without explicit downcast
        int i10 =(int)72.0;
        int i11 = (short)72.0;
        int i12 = (byte)72.0;
        int i13 = '2';              // i13 gets value of 50, ASCII code for character '2'
        int i14 = (char)72.1;       // i14 gets value of 72
        int i15 = (char) 72.9;      // i15 gets value of 72
//        int i16 = "s";              // does not compile
//        int i17 = Integer.parseInt("s");        // compiles fine, but throws a run time NumberFormatException
        int i18 = Integer.parseInt("72");         // i18 gets value of 72
        System.out.println(i18);


        // CHAR
        char c1 = 4;

        short x1 = 78;
//        char c2 = x1;         // does not compile
        short x2 = 78;
        char c3 = (char)x2;     // short has to be explicitly casted to char


        // FLOAT

        float f1 = 34;
        float f2 = (short)34;
//        float f3 = 34.0d;           // does not compile
//        float f4 = 34.0;            // does not compile
        float f5 = 'h';             // weird but valid
//        float f6 = "Las Vegas";     // does not compile
//        float f7 = true;            // does not compile
        float f8 = (byte)34;
        float f9 = 9.9999999999999999999999999999999999999999999999999999999999999999999999999999999999f;
//        float f10 = 999999999999999999999999999999999999999.9f;     // does not compile
        float f10 = 99999999999999999999999999999999999999.9f;

    }
}
