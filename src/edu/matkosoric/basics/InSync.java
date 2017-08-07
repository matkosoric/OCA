package edu.matkosoric.basics;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class InSync {

    // synchronised keyword can be applied only to the method or a block.
    // other uses will produce a compile-time error.

    public static void main(String[] args) {

        swimming();

        String ocean = "Atlantic";
        synchronized (ocean) {
            ocean = "Ind";
        }

        synchronized (new String()) {
            int a = 3;
        }

        // invalid use of the synchronised keyword
//        synchronized int weight = 50;
//        synchronized static byte height = 40;
//        synchronized class length {
//            double size;
//        }
    }

    synchronized private static void swimming() {
        System.out.println("Swimming!");
    }

}
