package edu.matkosoric.flowcontrol.label.scope;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Flirting {

    // break or continue statement with label can be placed only within
    // a labeled loop. if not, compiler will complain.

    public static void main(String[] args) {

        boolean married = false;
        boolean inARelationship = false;

        FIRSTLABEL:
        if (!married) System.out.println("Flirting");
        else break FIRSTLABEL;

        if (!inARelationship) System.out.println("Flirting");
//        else break FIRSTLABEL;          // does not compile

    }

}
