package edu.matkosoric.strings.stringbuilder.substring;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Arrest {

    // substring method on a stringbuilder or stringbuffer class returns a string,
    // not a reference to itself, and therefore,
    // other methods can not be called after substring() is called.

    public static void main(String[] args) {

        StringBuilder arrest1 = new StringBuilder("You");
        System.out.println(arrest1);

        StringBuilder arrest2 = new StringBuilder();
        arrest2.append("You ").append("have ").append("a "). append("right ").append("to remain silent.");
        System.out.println(arrest2);

        StringBuilder arrest3 = new StringBuilder();
        arrest3.append("You have a ").append("to remain silent.YYY").insert(11, "right ").delete(34,37);
        System.out.println(arrest3);

        StringBuilder arrest4 = new StringBuilder();
//        arrest4.append("Anything you say").substring(0, 8).append(" may and will be used...");    // does not compile

        // substring can be at the end of a chain, but will not affect the result
        StringBuilder arrest5 = new StringBuilder();
        arrest5.append("Anything you say is irrelevant")
        .delete(16, 30).insert(16, " may and will be used ...").substring(0, 8);
        System.out.println(arrest5);

        StringBuilder arrest6 = new StringBuilder();
        String arrest6string = arrest5.append("Anything you say is irrelevant")
                .delete(16, 30).insert(16, " may and will be used ...").substring(0, 8);
        System.out.println(arrest6string);
    }
}
