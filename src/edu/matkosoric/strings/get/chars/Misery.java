package edu.matkosoric.strings.get.chars;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Misery {

    // demo of getChars() method

    public static void main(String[] args) {

        char [] copy = new char[20];

        String misery = "I'm your number one fan.";

        misery.getChars(9, 23, copy, 0);

        System.out.println(copy);

    }

}
