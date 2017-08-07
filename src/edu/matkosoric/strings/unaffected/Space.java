package edu.matkosoric.strings.unaffected;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Space {

    public static void main(String[] args) {

        String intro = "Space";
        addFollowingWords(intro);
        System.out.println(intro);

        StringBuilder intro2 = new StringBuilder("These are the voyages...");
        addFollowingWords(intro2);
        System.out.println(intro2);

    }

    // variable 'intro' remains unaffected after this method call,
    // despite the fact that objects are passed by reference, and could be changed.
    // however, this method creates new string variable, while initial 'intro' remains the same
    public static void addFollowingWords (String s) {
        s += " - the final frontier.";
    }

    // this method will change passed variable
    public static void addFollowingWords (StringBuilder s) {
        s.append(" ...of the star ship Enterprise.");
    }
}
