package edu.matkosoric.dates.time.period;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import static java.time.Month.OCTOBER;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class DaysToMonths {

    public static void main(String[] args) {

        // initial date
        LocalDate martyMcFlyDestinationTime = LocalDate.of(1985, OCTOBER, 26);
        Period addingTimeInterval = Period.ofDays(32);

        // days will be smoothly added to the initial date
        System.out.println(martyMcFlyDestinationTime.plus(addingTimeInterval));

        // the same will be accomplished with plusDays() and getDays()
        System.out.println(martyMcFlyDestinationTime.plusDays(addingTimeInterval.getDays()));

        // however, Period class does not transform days to months.
        // getMonths will return zero, and original date will remain unchanged
        System.out.println(martyMcFlyDestinationTime.plusMonths(addingTimeInterval.getMonths()));

    }
}
