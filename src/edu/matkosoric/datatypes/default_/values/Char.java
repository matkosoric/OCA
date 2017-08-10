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

    public static void main(String[] args) {

        int [] intArray = new int[1];
        intArray[0] = a;

        System.out.println(intArray.length);
        System.out.println(a);
        System.out.println((int)a);

    }
}
