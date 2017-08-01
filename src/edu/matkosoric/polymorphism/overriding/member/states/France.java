package edu.matkosoric.polymorphism.overriding.member.states;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import edu.matkosoric.polymorphism.overriding.EuropeanUnion;

public class France extends EuropeanUnion{

    public String capitalCity = "Paris";
    public double GDP_per_capita = 43.652;
    public static String officialLanguage = "French";
    public String nationalDay = "14 July";

    // France class does not have any overridden methods
    // its methods are regular >public< methods.
    // despite that, they will not be available for the use if instance is
    // declared with a parent class as a reference class

    public void frenchPresident() {
        System.out.println("Emmanuel Macron");
    }

    public void mostVisitedPaidMonument () {
        System.out.println("Eiffel Tower");
    }

}
