package edu.matkosoric.strings.string_.pool;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Replacing {

    // replace() method creates a new string, unless there is no change.
    // in that case, original object is returned

    public static void main(String[] args) {

        String show = "Show me the money";

        String result1 = show.replace('y', 'x');
        String result2 = show.replace('y', 'y');

        System.out.println(show == result1);
        System.out.println(show == result2);

        System.out.println(show.hashCode());
        System.out.println(result2.hashCode());

    }
}
