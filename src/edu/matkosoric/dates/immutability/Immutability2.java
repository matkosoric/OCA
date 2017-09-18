package edu.matkosoric.dates.immutability;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Immutability2 {

    // Java 8 Date and Time classes are immutable

    public static void main(String[] args) {

        LocalTime lunchTime = LocalTime.of(12, 0, 0);

        lunchTime.plus(2, ChronoUnit.HOURS);            // this will not affect the lunchTime object itself
        System.out.println(lunchTime);

        lunchTime = lunchTime.plus(2, ChronoUnit.HOURS);            // this will change the lunchTime object
        System.out.println(lunchTime);


    }

}
