package edu.matkosoric.dates.now;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import java.time.LocalDate;

public class WinterOfOurDiscontent {

    // method now() can be called on every LocalDate object, to return current date

    public static void main(String[] args) {

        LocalDate winterOfOurDiscontent = LocalDate.of(2000, 12, 19).now();         // weird but valid

        System.out.println(winterOfOurDiscontent);


    }

}
