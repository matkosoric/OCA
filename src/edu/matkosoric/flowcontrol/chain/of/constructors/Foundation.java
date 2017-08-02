package edu.matkosoric.flowcontrol.chain.of.constructors;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Foundation {

    // extended and extending classes must have matching constructors,
    // or direct execution flow in that way that base class constructor gets executed.
    // ultimately, every class descends form the Object.class, the ultimate parent.
    // in this example there is only one

    public static void main(String[] args) {
        Antenna empireStateBuildingAntenna = new Antenna();
    }


    public Foundation(){
        System.out.println("Foundation constructor is executed first.");
    }

}


class Skyscraper extends Foundation {

    Skyscraper() {
            System.out.println("Skyscraper constructor is executed second.");
        }
    }

class Antenna extends Skyscraper {

    Antenna() {
        System.out.println("Antenna constructor is executed third.");
    }
}


