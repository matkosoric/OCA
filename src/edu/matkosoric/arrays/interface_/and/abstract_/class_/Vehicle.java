package edu.matkosoric.arrays.interface_.and.abstract_.class_;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class Vehicle {

    public static void main(String[] args) {

        // array can be made out of interfaces and abstract classes
        Car[] someCars = new Car[]{};
        Yacht[][][]someBoats = new Yacht[][][]{};
        Bicycle[] someBicycles = new Bicycle[]{};
        Motorbike[][] someMotorbikes = new Motorbike[][]{};

    }
}

interface Car {
    void driving();
}

interface Yacht {
    void sailing ();
}

abstract class Bicycle{
    void peddaling(){}
}

abstract class Motorbike {
    void riding(){}
}

