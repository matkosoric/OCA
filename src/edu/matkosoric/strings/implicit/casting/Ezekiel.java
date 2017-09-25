package edu.matkosoric.strings.implicit.casting;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Ezekiel {

    public static void main(String[] args) {

        // operators used with strings will implicitly cast other operands to string and treat them that way
        String book = "Ezekiel";
        int chapter = 25;
        int verse = 17;
        System.out.println(book + " " + chapter + verse);

        // however, if done before operations with string type, other data types will behave regularly
        System.out.println(book + " " + (chapter + verse));

        // and more straightforward example
        System.out.println(6 + 6 + 6 + " execution unfettered by a string variable");
        System.out.println("execution disturbed with string variable: " + 6 + 6 + 6);

//        System.out.println("and finally weird example that does not compile due to the minus: " + 6 + 6 - 6);       // does not compile

    }
}
