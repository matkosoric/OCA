package edu.matkosoric.strings.constructing.strings;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Nixon {

    // StringBuilder class does not have a toCharArray() method,
    // while String class has.

    public static void main(String[] args) {

        String speech_S = "I'm not a crook.";
        StringBuilder speech_SB = new StringBuilder("I'm not a crook.");

        char[] a = speech_S.toCharArray();
//        char[] b = speech_SB.toCharArray();         // does not compile, no such method

        System.out.println(a);
    }
}
