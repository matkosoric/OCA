package edu.matkosoric.basics;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class YearsInJail {

    static int sentenceOne = 5;
    static int sentenceTwo;         // uninitialised

    // initialisation of static variables
    static {
        int sentenceOne = 1;        // this is local variable that does not affect static 'sentenceOne', but simply shadows it
        sentenceTwo = sentenceOne;
    }

    public static void main(String[] args) {

        System.out.println(sentenceOne + sentenceTwo);      // output: 6

    }

}
