package edu.matkosoric.flowcontrol.double_.case_;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class DoubleCase {

    public static void main(String[] args) {

        // repeating values in the case condition of switch statement are not permitted

        String strongestNuclearTest = "The Tsar Bomba";

        switch (strongestNuclearTest) {
            case "The Tsar Bomba":
                System.out.println("No.1.");
                break;
            case "Soviet Test 219":
                System.out.println("No.2.");
                break;
            case "Soviet Test 173, 174, 147":
                System.out.println("No.3., 4. and 5.");
                break;
            case "Castle Bravo":
                System.out.println("No.6.");
                break;
            case "Castle Yankee":
                System.out.println("No.7.");
                break;
//            case "Castle Yankee":                   // does not compile
//                System.out.println("No.7.");
//                break;
        }
    }
}
