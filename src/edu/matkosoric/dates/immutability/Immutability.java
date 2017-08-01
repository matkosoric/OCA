package edu.matkosoric.dates.immutability;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Immutability {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2017, 5, 19);
        System.out.println(date);

        date.plus(20, ChronoUnit.DAYS);     //this will NOT affect the value of LocalDate instance
        System.out.println(date);

        date = date.plus(20, ChronoUnit.DAYS);      //this will affect it
        System.out.println(date);
    }
}
