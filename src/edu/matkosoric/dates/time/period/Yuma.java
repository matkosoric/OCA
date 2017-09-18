package edu.matkosoric.dates.time.period;

import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Yuma {

    // Period type can not be added to the LocalTime type

    public static void main(String[] args) {

        Period delayTime = Period.ofDays(2);
        LocalTime trainToYuma = LocalTime.of(15, 10);
        trainToYuma = trainToYuma.plus(delayTime);          // compiles, but throws UnsupportedTemporalTypeException at runtime

    }

}
