package edu.matkosoric.strings.substring.one.argument;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class TheGreatMutato {

    // does method String.substring works with only one argument? the answer is yes.

    public static void main(String[] args) {

        String postmodernPrometheus = "The Great Mutato";

        // classical use
        System.out.println(postmodernPrometheus.substring(10, 16));

        // one argument
        System.out.println(postmodernPrometheus.substring(10));

        // out of bounds argument
//        System.out.println(postmodernPrometheus.substring(10,20));      // throws runtime StringIndexOutOfBoundsException
//        System.out.println(postmodernPrometheus.substring(20));         // throws runtime StringIndexOutOfBoundsException


    }

}
