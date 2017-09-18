package edu.matkosoric.dates.local.date;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Format {

    public static void main(String[] args) {

        LocalDate localDate1 = LocalDate.now();             // current date, in Java 7 it would be: Date date = new Date();
        LocalDate localDate2 = LocalDate.of(2017,9,18);     // specific, fixed date

        DateTimeFormatter dtFormat = DateTimeFormatter.ofPattern("yyyy / yyy / yy / y");
        System.out.println(localDate2.format(dtFormat));
        DateTimeFormatter dtFormat2 = DateTimeFormatter.ofPattern("MMMM / MMM / MM / M");
        System.out.println(localDate2.format(dtFormat2));
        DateTimeFormatter dtFormat3 = DateTimeFormatter.ofPattern("dd / d");
        System.out.println(localDate2.format(dtFormat3));

//        DateTimeFormatter dtFormat4 = DateTimeFormatter.ofPattern("dddd / ddd");     // compiles, but throws "IllegalArgumentException: Too many pattern letters: d"

    }

}
