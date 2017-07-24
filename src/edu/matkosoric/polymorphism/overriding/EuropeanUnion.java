package edu.matkosoric.polymorphism.overriding;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

import edu.matkosoric.polymorphism.overriding.member.states.Austria;
import edu.matkosoric.polymorphism.overriding.member.states.Belgium;

public class EuropeanUnion {

    public static String capitalCity = "Brussels";
    public static double GDP_per_capita = 40.610;
    public static String [] officialLanguages = {"English", "French"};


    public void outputOfficialLanguage (String [] offLangStrArray) {
        for (String element : offLangStrArray)
            System.out.println("EU official languages are: " + element);
    }

    public void outputOfficialLanguage () {
        for (String element : officialLanguages)
        System.out.println("EU official languages are: " + element);
    }

    // since european union has more than one official language, this method will call method with array parameters
    public void outputOfficialLanguage (String offLanguageParam) {
        this.outputOfficialLanguage(officialLanguages);
    }


    public void outputGDP () {
        System.out.println("EU GDP: " + GDP_per_capita);
    }

    public void outputCapitalCity () {
        System.out.println("Capital city of EU:" + capitalCity);
    }




    public static void main(String[] args) {

        EuropeanUnion eu = new EuropeanUnion();
        eu.outputOfficialLanguage(officialLanguages);
        eu.outputOfficialLanguage();
        eu.outputGDP();
        eu.outputCapitalCity();

        Austria au = new Austria();
        au.outputOfficialLanguage(Austria.officialLanguages);       // inherited but unused string array
        au.outputOfficialLanguage("Austrian German");
        au.outputOfficialLanguage();
        au.outputGDP();
        au.outputCapitalCity();

        Belgium be = new Belgium();
        be.outputOfficialLanguage(Belgium.officialLanguages);       //
        be.outputOfficialLanguage("Belgian");                       // ignored parameter
        be.outputOfficialLanguage();
        be.outputGDP();
        be.outputCapitalCity();



    }
}
