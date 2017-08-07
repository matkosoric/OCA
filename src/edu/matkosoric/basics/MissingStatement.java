package edu.matkosoric.basics;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class MissingStatement {

    // single semi-colo sign is considered by the compiler as a complete java statement.
    // putting it in a IF statement does not violate any syntax rules,
    // and the code compiles

    public static void main(String[] args) {

        if (true) ; else ;                                  // weird but valid
        if (false) ; else ;                                 // weird but valid
        if (true) ;                                         // weird but valid
        if (false) ; else if (true) ; else if (false) ;     // weird but valid

        System.out.println("Weird!");

    }
}
