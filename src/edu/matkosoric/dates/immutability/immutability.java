package edu.matkosoric.dates.immutability;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

/**
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class immutability {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2017, 5, 16);
        System.out.println(date);

        date.plus(20, ChronoUnit.DAYS);
        System.out.println(date);
    }

}
