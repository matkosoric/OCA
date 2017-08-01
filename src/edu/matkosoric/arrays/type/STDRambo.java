package edu.matkosoric.arrays.type;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class STDRambo {

    public static void main(String[] args) {

        // array is an object, even if it is made out of primitive type variables

        String[] STD = new String []{"Genital herpes", "Gonorrhea", "Syphilis", "Chlamydia"};
        System.out.println(STD instanceof Object);
        System.out.println(STD instanceof String[]);
        System.out.println(STD[0] instanceof String);
//        System.out.println(STD instanceof String);      // does not compile

        System.out.println("~~~~~~~~~~~~~~~~~~~~");

        short[] ramboMovieReleaseYears = new short[] {1982, 1985, 1988, 2008};
        System.out.println(ramboMovieReleaseYears instanceof Object);
        System.out.println(ramboMovieReleaseYears instanceof short[]);
//        System.out.println(ramboMovieReleaseYears[0] instanceof short);     // does not compile
//        System.out.println(ramboMovieReleaseYears instanceof Short[]);      // does not compile, wrapper array is different from primitive array

    }

}
