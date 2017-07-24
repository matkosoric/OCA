package edu.matkosoric.polymorphism.overriding.member.states;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

import edu.matkosoric.polymorphism.overriding.EuropeanUnion;

public class Austria extends EuropeanUnion{

    public String capitalCity = "Vienna";
    public double GDP_per_capita = 47.856;
    public String officialLanguage = "Austrian German";

    public void outputOfficialLanguage (String[] officialLanguages) {
        // there is only one official language in Austria,
        // so, there is no need to implement for loop
        System.out.println("Official language in Austria: " + officialLanguage);
    }

    public void outputOfficialLanguage (String offLanguageParam) {
        System.out.println("Official language in Austria: " + offLanguageParam);
    }

    public void outputOfficialLanguage () {
        System.out.println("Official language in Austria: " + officialLanguage);
    }

    public void outputGDP () {
        System.out.println("Austrian GDP: " + GDP_per_capita);
    }

    public void outputCapitalCity () {
        System.out.println("Capital city of Austria: " + capitalCity);
    }


}
