package edu.matkosoric.dates.local.date;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateValues {

    public static void main(String[] args) {

        System.out.println(LocalDate.MIN);
        System.out.println(LocalDate.MAX);

//        LocalDate localDate1 = LocalDate.MAX.plus(1, ChronoUnit.DAYS);      // compiles, but throws a run time DateTimeException
//        LocalDate localDate2 = LocalDate.MIN.minus(1, ChronoUnit.DAYS);      // compiles, but throws a run time DateTimeException

        LocalDate localDate3 = LocalDate.now();             // current date, in Java 7 it would be: Date date = new Date();
        LocalDate localDate4 = LocalDate.of(2017,9,18);     // specific, fixed date

        System.out.println(localDate4);

        System.out.println(localDate4.getYear());           // 2017
        System.out.println(localDate4.getMonth());          // SEPTEMBER
        System.out.println(localDate4.getMonthValue());     // 9

        System.out.println(localDate4.getDayOfWeek());      // MONDAY
        System.out.println(localDate4.getDayOfMonth());     // 18
        System.out.println(localDate4.getDayOfYear());      // 261
        System.out.println(localDate4.getLong(ChronoField.DAY_OF_YEAR));        // 261

        System.out.println(localDate4.atTime(11, 40, 55));              // returns a LocalDateTime object
        LocalDateTime localDateTime1 = localDate4.atTime(11, 40, 55);
        System.out.println(localDateTime1);

    }

}
