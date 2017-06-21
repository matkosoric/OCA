package edu/*




*/.matkosoric.basics;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class CommentInDeclaration {

    // multiline comments can be inserted anywhere within a valid code without breaking it

    public static void main(String[] args) {

        String batmanName = "Bruce Wayne";
        String  /*


                                                // Weird but valid


         */batmanAlias = "Batman";

        flyBatmanFly();

    }

    private static void  /*


                                                // Weird but valid



         */flyBatmanFly() {
    }

}
