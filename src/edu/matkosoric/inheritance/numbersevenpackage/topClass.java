package edu.matkosoric.inheritance.numbersevenpackage;

/**
 * Created by matko on 31.5.2017..
 */
public class topClass {
    // we need this topClass, since top class can not be static.


    public static void main(String[] args) {

        topClass topClassInstance = new topClass();
        numberSeven numberSevenInstance = new numberSeven();

//        sevenBeers sevenBeers = new sevenBeers();       // does not compile
        edu.matkosoric.inheritance.numbersevenpackage.topClass.numberSeven.sevenTowns sevenTowns =
                numberSevenInstance.new sevenTowns();        // valid statement
//        edu.matkosoric.inheritance.numbersevenpackage.topClass.numberSeven.sevenHospitals sevenHospitalsInstance =
//                new edu.matkosoric.inheritance.numbersevenpackage.topClass.numberSeven.sevenHospitals();          // does not compile

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
