package edu.matkosoric.inheritance.wrong.object;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Training {

    // downcasting

    public static void main(String[] args) {

        Walk trainingToday = new Walk();
//        Run runningToday = (Run) (trainingToday);   // compiles fine, but throws a runtime ClassCastException

    }
}
