package edu.matkosoric.flowcontrol.weirdfor;

/**
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class weird {

    public static void main(String[] args) {


        // since none of the elements in a for loop is not mandatory
        // many awkward statement can pass a compiler check


        for (int year = 1990, age = 0; age < year; age++, age--, age++) {     // weird, but valid
            System.out.println("Valid 1.");
            break;
        }

        for (int century = 21, IQ = 90; IQ < 100; System.out.println(IQ), century--, IQ++) {         // weird, but valid
            System.out.println("Valid 2.");
            break;
        }

        for (int height = 170; height > 160 ? true: false;){
            System.out.println("Valid 3.");
            break;
        }

        int a;
        for (;;a = 4){
            System.out.println("Valid 4.");
            break;
        }

    }
}
