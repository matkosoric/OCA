package edu.matkosoric.dates.truncateTo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class TruncatedTo {

    public static void main(String[] args) {

        // initial time
        LocalTime groundhogDayMorningTime = LocalTime.of(5, 59, 59, 999_999_999);
        System.out.println("Initial time: " + groundhogDayMorningTime);

        // TruncatedTo() nullifies all fields beyond stated argument
        System.out.println(groundhogDayMorningTime.truncatedTo(ChronoUnit.NANOS));

        System.out.println(groundhogDayMorningTime.truncatedTo(ChronoUnit.SECONDS));

        System.out.println(groundhogDayMorningTime.truncatedTo(ChronoUnit.MINUTES));

        System.out.println(groundhogDayMorningTime.truncatedTo(ChronoUnit.DAYS));

        System.out.println(groundhogDayMorningTime.truncatedTo(ChronoUnit.HALF_DAYS));

        // these are not valid uses of TruncatedTo() method

//        System.out.println(groundhogDayMorningTime.TruncatedTo());          // does not compile
//        System.out.println(groundhogDayMorningTime.TruncatedTo(null));      // compiles, but throws a run-time NullPointerException

        // larger ChronoUnit value will compile, but throw a run-time Exception
//        System.out.println(groundhogDayMorningTime.TruncatedTo(ChronoUnit.MONTHS));


        // LocalDate class does not have a TruncatedTo() method
        LocalDate groundhogDay = LocalDate.of(1993, Month.FEBRUARY, 2);
        System.out.println("Initial date: " + groundhogDay);
//        System.out.println(groundhogDay.TruncatedTo(ChronoUnit.DAYS));       // does not compile


        // TruncatedTo() behaves similarly with LocalDateTime as with LocalTime
        // it can not be called with time-units greater than
        LocalDateTime groundhogDayDateTime = LocalDateTime.of (1993, Month.FEBRUARY, 2, 5, 59, 59, 999_999_999);
        System.out.println("Morning date and time: " + groundhogDayDateTime);

        System.out.println(groundhogDayDateTime.truncatedTo(ChronoUnit.SECONDS));
        System.out.println(groundhogDayDateTime.truncatedTo(ChronoUnit.MINUTES));
        System.out.println(groundhogDayDateTime.truncatedTo(ChronoUnit.DAYS));

//        System.out.println(groundhogDayDateTime.TruncatedTo(ChronoUnit.MONTHS));    // compiles, but throws a run-time UnsupportedTemporalTypeException

    }

}
