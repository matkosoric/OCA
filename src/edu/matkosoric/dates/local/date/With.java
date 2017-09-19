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
        localDate1 = localDate1.with(ChronoField.DAY_OF_YEAR, 33);
        System.out.println(localDate1);                                 // 2018-02-02, changes day

        LocalDate localDate2 = LocalDate.of(2018, 3, 29);
        localDate2 = localDate2.with(ChronoField.MONTH_OF_YEAR, 5);
        System.out.println(localDate2);                                 // 2018-05-29, changed month

        LocalDate localDate3 = LocalDate.of(2018, 3, 29);
        localDate3 = localDate3.withDayOfMonth(16);
        System.out.println(localDate3);                                 // 2018-03-16, changes day

        LocalDate localDate4 = LocalDate.of(2018, 3, 29);
        localDate4 = localDate4.withDayOfYear(33);
        System.out.println(localDate4);                                 // 2018-02-02, changes day, like first example

        LocalDate localDate5 = LocalDate.of(2018, 3, 29);
        localDate5 = localDate5.withMonth(11);
        System.out.println(localDate5);                                 // 2018-11-29, changes month, similarly to localDate2 example

        LocalDate localDate6 = LocalDate.of(2018, 3, 29);
        localDate6 = localDate6.withYear(1968);
        System.out.println(localDate6);                                 // 1968-03-29, changes year

        LocalDate localDate7 = LocalDate.of(2018, 3, 29);
        localDate7 = localDate7.with(ChronoField.EPOCH_DAY, 5);
        System.out.println(localDate7);                                 // 1970-01-06, epoch starts with 1.1.1970

//        LocalDate localDate8 = LocalDate.of(2018, 3, 29);
//        localDate8 = localDate8.with(ChronoField.SECOND_OF_MINUTE, 5);  // compiles, but throws UnsupportedTemporalTypeException
//        System.out.println(localDate8);

    }
}
