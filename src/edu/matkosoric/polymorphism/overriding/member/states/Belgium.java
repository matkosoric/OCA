package edu.matkosoric.polymorphism.overriding.member.states;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

import edu.matkosoric.polymorphism.overriding.EuropeanUnion;

public class Belgium extends EuropeanUnion{

    public String capitalCity = "Brussels (BE)";
    public double GDP_per_capita = 44.881;
    public static String [] officialLanguages = {"Dutch", "French", "German"};

    // overriding overloaded method
    public void outputOfficialLanguage (String[] officialLanguagesParam) {
        for (String element : officialLanguagesParam)
            System.out.println("Belgian official languages are: " + element);
    }


    public void outputOfficialLanguage (String offLanguage) {
        // parameter is ignored, since it is not string array
        this.outputOfficialLanguage();
    }

    public void outputOfficialLanguage () {
        for (String element : officialLanguages)
            System.out.println("Belgian official languages are: " + element);
    }

    public void outputGDP () {
        System.out.println("Belgian GDP: " + GDP_per_capita);
    }

    public void outputCapitalCity () {
        System.out.println("Capital city of Belgium: " + capitalCity);
    }

}
