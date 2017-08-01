package edu.matkosoric.flowcontrol.switch_.constant;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class PaleBlueDot {

    public static void main(String[] args) {

        // case values have to be compile-time constants
        // although 'dot' variable in this example is a constant,
        // compiler throws an error, since it is initialised in different line

        final String pale = "pale";
        final String blue = "blue";
        final String dot;
        dot = "dot";

        switch (pale) {
            case pale:      System.out.println("pale"); break;
            case blue:      System.out.println("blue"); break;
//            case dot:       System.out.println("dot"); break;       // does not compile
        }


        // even if array is marked as final, its elements are not final,
        // and therefore can not be used as cases in a switch statement
        final String saganSpeech [] = new String[] {"pale", "blue", "dot"};
        switch (pale) {
//            case saganSpeech[0]:    System.out.println("pale"); break;      // does not compile
//            case saganSpeech[1]:    System.out.println("blue"); break;      // does not compile
//            case saganSpeech[2]:    System.out.println("dot"); break;       // does not compile
        }


    }
}
