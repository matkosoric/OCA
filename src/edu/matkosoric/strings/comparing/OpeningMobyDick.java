package edu.matkosoric.strings.comparing;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class OpeningMobyDick {

    public static void main(String[] args) {

        String firstSentence = "Call me Ishmael.";
        String firstAndSecondSentence = "Call me Ishmael. Some years ago - never mind how long precisely - having little or no money in my purse, and nothing particular to interest me on shore, I thought I would sail about a little and see the watery part of the world.";

        // compareTo method returns zero if compared strings are of the same length
        System.out.println(firstSentence.compareTo(firstSentence));

        // compareTo method returns negative number if the argument string is longer than first string, indicating difference in the number of characters
        System.out.println(firstSentence.compareTo(firstAndSecondSentence));

        // compareTo returns positive number if the first string is longer than parameter string, indicating difference in the number of characters
        System.out.println(firstAndSecondSentence.compareTo(firstSentence));

    }
}
