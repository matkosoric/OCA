package edu.matkosoric.strings.comparing2;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class PulpFiction {

    // String variable with null value can retain initial "null"
    // and incoming values only append to the initial "null"

    public static void main(String[] args) {

        String name1 = "Pulp Fiction";

        String name2 = null;
        name2 += "Pulp Fiction";
        System.out.println(name2);

        String name3;
        name3 = "Pulp Fiction";
        System.out.println(name3);

        String name4 = null;
        String [] arrayName = {"Pulp ", "Fiction"};
        for (String element : arrayName)
            name4 = name4 + element;
        System.out.println(name4);

    }
}
