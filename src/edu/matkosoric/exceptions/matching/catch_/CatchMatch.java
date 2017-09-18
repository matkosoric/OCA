package edu.matkosoric.exceptions.matching.catch_;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class CatchMatch {

    // try statement has to have a matching catch block,
    // or a matching finally block, or both, but without that second part, code will not compile

    public static void main(String[] args) {

        try {

            try {
                throw new NumberFormatException();
            } catch (NumberFormatException e) {
                System.out.println("Format is wrong!");
            }
        }                       // without this closing parenthesis, second catch would become part of the inner try statement,
                                // depriving outer try of a mandatory catch part, and rendering it uncompilable
        catch (Exception e) {
            System.out.println("Generic message");
        }

        }

    //  }

}
