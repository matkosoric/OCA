package edu.matkosoric.strings.stringbuilder.trim;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class SmegHead {

    // trim() method is in the String class,
    // not StringBuilder class.

    public static void main(String[] args) {

        StringBuilder sh = new StringBuilder("  Smeg Head   ");

//        sh.trim();      // does not compile

        String sh2 = " smeg head    ";
        System.out.println(sh2.trim());

    }

}
