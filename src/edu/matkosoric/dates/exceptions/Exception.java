package edu.matkosoric.dates.exceptions;

import java.time.LocalTime;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class Exception {

    public static void main(String[] args) {

        LocalTime time1 = LocalTime.of(15,59);      // valid statement
        System.out.println(time1);

        LocalTime time2 = LocalTime.of(15,60);      // compiles, but throws a run-time DateTimeException
        System.out.println(time2);

    }
}
