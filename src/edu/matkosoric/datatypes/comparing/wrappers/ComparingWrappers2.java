package edu.matkosoric.datatypes.comparing.wrappers;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class ComparingWrappers2 {


    public static void main(String[] args) {

        // different objects
        Integer i1 = new Integer (127);
        Integer i2 = new Integer (127);
        System.out.println(i1 == i2);           // false

        // only true result: literals in the range between -128 and +127.
        Integer i3 = 127;
        Integer i4 = 127;
        System.out.println(i3 == i4);           // true

        // value out of scope
        Integer i5 = 128;
        Integer i6 = 128;
        System.out.println(i5 == i6);            // false

    }

}
