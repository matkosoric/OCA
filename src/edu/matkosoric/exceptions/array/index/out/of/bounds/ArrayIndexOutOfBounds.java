package edu.matkosoric.exceptions.array.index.out.of.bounds;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class ArrayIndexOutOfBounds {


    public static void main(String[] args) {

        // ArrayIndexOutOfBoundsException due to the unnecessary equals sign (=) in the second for loop.
        // Exception might be thrown before the output.
        char[] a = new char[]{'h', 'u', 'l', 'k'};

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        for (int j = 0; j <= a.length; j++) {
            System.out.println(a[j]);
        }

    }
}
