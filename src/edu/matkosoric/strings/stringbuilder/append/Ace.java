package edu.matkosoric.strings.stringbuilder.append;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Ace {

    // method append() is part of the StringBuilder class,
    // not String class

    public static void main(String[] args) {

        String kipper = "Smoke me a kipper";
//        kipper = kipper.append(", I'll be back for breakfast.");      // does not compile

        StringBuilder kipper2 = new StringBuilder("Smoke me a kipper");
        kipper2.append(", I'll be back for breakfast.");
        System.out.println(kipper2);

        // append method() does not accept index parameter
//        kipper2.append(5, " breakfast");        // does not compile

    }

}
