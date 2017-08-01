package edu.matkosoric.flowcontrol.always.false_;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class AlwaysFalse {

    // if a statement within IF condition always returns false,
    // the code will compile,
    // but while loop will not compile if its condition always returns false

    public static void main(String[] args) {


        if (1<3) { System.out.println("IF: Always true!"); }

        if (1>3) { System.out.println("IF: Always false!"); }



        while (1<3) {
            System.out.println("infinite loop");
        }

//        while (1>3) {
//            System.out.println("does not compile");
//        }

    }
}
