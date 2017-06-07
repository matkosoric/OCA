package edu.matkosoric.exceptions.negativearraysize;

/**
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class solarSystem {

    public static void main(String[] args) {

        short[] numberOfSolarSystemPlanets1 = new short[8];
//        short[] numberOfSolarSystemPlanets2 = new short[-8];        // will compile, and then throw NegativeArraySizeException

    }

}
