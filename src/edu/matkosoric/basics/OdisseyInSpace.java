package edu.matkosoric.basics;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class OdisseyInSpace {

    // sign _ is intended to be used for making long literals more readable, eg. 334_532_792.
    // compiler neglects it, whether there is only one or several consecutive signs.

    public static void main(String[] args) {

        int year = 20______01;      // valid statement
        System.out.println(year);

    }
}
