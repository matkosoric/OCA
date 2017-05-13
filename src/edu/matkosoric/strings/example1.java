package edu.matkosoric.strings;

/**
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */
public class example1 {

    public static void main(String[] args) {

        //methods from String class do not affect the String object

        String name = "Norman Bates";
        name.concat(" owns a nice motel.");
        System.out.println(name);

        name.substring(0,5);
        System.out.println(name);

        name.toLowerCase();
        System.out.println(name);

    }
}
