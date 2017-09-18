package edu.matkosoric.dates.local.date;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class With {

    public static void main(String[] args) {

        LocalDate localDate1 = LocalDate.of(2018, 3, 29);
        localDate1 = localDate1.with(ChronoField.DAY_OF_YEAR, 30);
        System.out.println(localDate1);



 /*       LocalDate	with(TemporalAdjuster adjuster)
        Returns an adjusted copy of this date.
                LocalDate	with(TemporalField field, long newValue)
        Returns a copy of this date with the specified field set to a new value.
                LocalDate	withDayOfMonth(int dayOfMonth)
        Returns a copy of this LocalDate with the day-of-month altered.
                LocalDate	withDayOfYear(int dayOfYear)
        Returns a copy of this LocalDate with the day-of-year altered.
                LocalDate	withMonth(int month)
        Returns a copy of this LocalDate with the month-of-year altered.
                LocalDate	withYear(int year)
        Returns a copy of this LocalDate with the year altered.*/
    }
}
