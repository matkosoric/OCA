package edu.matkosoric.polymorphism.overriding.member.states;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

import edu.matkosoric.polymorphism.overriding.EuropeanUnion;

public class Spain extends EuropeanUnion{

    public String capitalCity = "Madrid";
    protected static String officialLanguage = "Spanish";
    double GDP_per_capita = 38.239;         // default access modifier
    private String sanFerminLocation = "Pamplona";

}
