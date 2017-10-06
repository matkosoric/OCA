package edu.matkosoric.inheritance.nesting;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class TopClass {
    // we need this TopClass, since top class can not be static.


    public static void main(String[] args) {

        TopClass topClassInstance = new TopClass();
        numberSeven numberSevenInstance = new numberSeven();

//        sevenBeers sevenBeers = new sevenBeers();       // does not compile
        TopClass.numberSeven.sevenTowns sevenTowns =
                numberSevenInstance.new sevenTowns();        // valid statement
//        TopClass.numberSeven.sevenHospitals sevenHospitalsInstance =
//                new TopClass.numberSeven.sevenHospitals();          // does not compile

        numberSeven.sevenCows sevenCowsInstance = numberSevenInstance.new sevenCows();      // valid statement

    }

    // numberSeven is an inner static class
    public static class numberSeven {

        public String nameSeven = "Seven";
        public double valueSeven = 7.0;

        // second-layer inner classes
        public class sevenCows {}
        public class sevenTowns {}
        public class sevenHospitals {}
        public class sevenBeers {}
        public class sevenBooks {}

    }
}
