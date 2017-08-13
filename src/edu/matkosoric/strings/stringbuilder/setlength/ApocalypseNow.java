package edu.matkosoric.strings.stringbuilder.setlength;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class ApocalypseNow {

    // demo of setLength() method from StringBuilder class

    public static void main(String[] args) {

        StringBuilder an = new StringBuilder("Apocalypse Now");
        System.out.println(an.length() + ": " + an);

        an.setLength(3);
        System.out.println(an.length() + ": " + an);

        an.setLength(40);
        System.out.println(an.length() + ": " + an);

//        an.setLength(-40);      // compiles, but throws a runtime StringIndexOutOfBoundsException

    }
}
