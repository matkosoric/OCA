package edu.matkosoric.inheritance.private_.overriding;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class PrivateOverriding {

    // it is impossible to override a private method.
    // methods with signatures differentiating solely in access modifier 'private'
    // are considered as completely independent methods

    public static void main(String[] args) {

        // this will output the latin name for the mammals
        // since instance variables can not be overridden,
        // and PolarBear class does not have its own method
        PolarBear pb = new PolarBear();
        pb.printName_Overrideable();

        // this will print latin name of Amur Tiger, from the subclass itself
        AmurTiger at = new AmurTiger();
        at.printName_Overrideable();

        // this will print latin name of Domestic Goat,
        // without method overriding
        DomesticGoat dg = new DomesticGoat();
        dg.printName_Unoverrideable();

        // variables in java are not polymorphic.
        // variables from child class can only hide its doubles in a super class,
        // but that does not make them inaccessible.
        WoodChuck wc = new WoodChuck();
        System.out.println(wc.scientificName);
        wc.printVisibleVariable();
        wc.printHiddenVariable();
    }
}

class Mammals {

    static boolean neocortex = true;
    static int earBones = 3;
    static boolean mammaryGlands = true;
    static boolean warmBlooded = true;
    static boolean bodyHair = true;

    public void printAttributes () {
        System.out.println("neocortex: " + neocortex);
        System.out.println("earbones: " + earBones);
        System.out.println("mammaryGladns: " + mammaryGlands);
        System.out.println("warm blooded:" + warmBlooded);
        System.out.println("body hair:" + bodyHair);
    }

    static String scientificName = "Mammalia";

    public void printName_Overrideable() {
        System.out.println("Superclass print: " + scientificName);
    }

    // notice the private modifier
    private void printName_Unoverrideable () {
        System.out.println("superclass unoverrideable");
    }
}




class PolarBear extends Mammals {
    String scientificName = "Ursus maritimus";
}

class AmurTiger extends Mammals {
    String scientificName = "Panthera tigris altaica";
    public void printName_Overrideable() {
        System.out.println("Subclass print: " + scientificName);
    }
}

class DomesticGoat extends Mammals {
    String scientificName = "Capra hircus hircus";

    // despite the same name as the superclass method
    // this is considered as a completely separated method
    // due to the private modifier in superclass method, rendering it invisible
    public void printName_Unoverrideable () {
        System.out.println("Subclass print: " + scientificName);
    }
}

class WoodChuck extends Mammals {
    static String scientificName = "Marmota monax";

    public void printVisibleVariable () {
        System.out.println(neocortex);
    }

    // since variable 'scientificName' in a WoodChuck class hides the variable
    // with the same name in a super class, we have to add 'super' keyword
    public void printHiddenVariable () {
        System.out.println(super.scientificName);       // this references "Mammalia"
    }

}
