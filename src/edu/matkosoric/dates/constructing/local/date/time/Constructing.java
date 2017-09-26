package edu.matkosoric.dates.constructing.local.date.time;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Constructing {

    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.of(LocalDate.of(1993,5, 19), LocalTime.of(23, 58));

        ldt = ldt.withDayOfYear(40);

        System.out.println("month: " + ldt.getMonth());
        System.out.println("day in month: " + ldt.getDayOfMonth());
        System.out.println("hour: " + ldt.getHour());

    }

}
