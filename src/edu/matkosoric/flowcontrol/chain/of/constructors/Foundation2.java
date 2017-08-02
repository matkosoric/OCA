package edu.matkosoric.flowcontrol.chain.of.constructors;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Foundation2 {

    // extended and extending classes must have matching constructors,
    // or direct execution flow in that way that base class constructor gets executed.
    // ultimately, every class descends form the Object.class, the ultimate parent.
    // every subclass must have a constructor that calls appropriate constructor in the parent class,
    // or else the code will not compile.

    public static void main(String[] args) {
        Antenna empireStateBuildingAntenna = new Antenna();
    }

    public Foundation2(String name){                // if constructor parameter was different, the code would not compile
        System.out.println("Foundation is executed first.");
    }

}


class Skyscraper2 extends Foundation2 {

    Skyscraper2(int hight) {
        super("Empire State Building");             // if commented out, code would not compile
        System.out.println("Skyscraper is executed second.");
    }
}

class Antenna2 extends Skyscraper2 {

    Antenna2() {
        super(4);                                   // if commented out, code would not compile
        System.out.println("Antenna constructor is executed third.");
    }
}


