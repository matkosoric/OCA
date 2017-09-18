package edu.matkosoric.dates.month;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import java.time.LocalDate;

public class Month {

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.ofYearDay(2017, 27);
        System.out.println(date1.getMonthValue());       // output: 1

        LocalDate date2 = LocalDate.ofYearDay(2016, 364);
        System.out.println(date2.getMonthValue());      // output: 12

//        LocalDate date3 = LocalDate.ofYearDay(2015, 370);   // compiles, but throws a runtime exception
//        System.out.println(date3);

    }
}
