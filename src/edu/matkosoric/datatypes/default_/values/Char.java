package edu.matkosoric.datatypes.default_.values;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Char {

    // default value of char type is empty space,
    // which is 0 in ASCII code

    static char a;
    static Character b;

    public static void main(String[] args) {

        int [] intArray = new int[1];
        intArray[0] = a;

        System.out.println(intArray.length);    // output: 1
        System.out.println(intArray[0]);        // output: 0
        System.out.println(a);                  // invisible output
        System.out.println((int)a);             // output: 0

        System.out.println(b);                  // output: null
//        System.out.println((int)b);             // throws NullPointerException
    }
}
