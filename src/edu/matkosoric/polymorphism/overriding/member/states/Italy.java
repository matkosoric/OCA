package edu.matkosoric.polymorphism.overriding.member.states;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import edu.matkosoric.polymorphism.overriding.EuropeanUnion;

public class Italy extends EuropeanUnion{

    public String capitalCity = "Rome";
    public double GDP_per_capita = 30.165;
    public static String officialLanguage = "Italian";

    public void outputCapitalCity () {
        System.out.println("Capital city of Italy: " + capitalCity);
    }

}
