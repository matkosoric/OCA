package edu.matkosoric.inheritance.interface_.inheritance;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

// class can not extend interface.
//public class AnimalOrganism extends AnimalLife{ }       // does not compile

// class can not implement another class.
//public class AnimalOrganism implements Organism{ }       // does not compile


//since Organism class already implemented Life interface,
// its child class simply inherits implemented methods,
// which can be overridden.
public class AnimalOrganism extends Organism implements Life {

    public void feeding () {
        System.out.println("...photosynthesis...");
    }

}

