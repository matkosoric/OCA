package edu.matkosoric.strings.index.of;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class BubbleBoy {

    // demo of String.indexOf() and lastIndexOf() methods

    public static void main(String[] args) {

        String bubbleBoy = "'Mmunities?! What the hell are 'mmunities?!";

        int a = bubbleBoy.indexOf("?!");
        System.out.println(a);              // 10

        float b = bubbleBoy.lastIndexOf("?!");
        System.out.println(b);              // 41.0

    }

}
