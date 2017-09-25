package edu.matkosoric.basics;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class StaticDeclaration {

    static int a, b = 7, c = a+b;               // weird but valid

    public static void main(String[] args) {

        System.out.println(c);      // output: 7

    }
}
