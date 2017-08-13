package edu.matkosoric.polymorphism.overriding;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import edu.matkosoric.polymorphism.overriding.member.states.*;
import edu.matkosoric.polymorphism.overriding.member.states.regions.Catalonia;

public class EuropeanUnion {

    // various aspects of inheritance and polymorphism

    public static String capitalCity = "Brussels (EU)";
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
        System.out.println("Capital city of EU: " + capitalCity);
    }




    public static void main(String[] args) {

        EuropeanUnion eu = new EuropeanUnion();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~EUROPEAN UNION");
        eu.outputOfficialLanguage(officialLanguages);
        eu.outputOfficialLanguage();
        eu.outputGDP();
        eu.outputCapitalCity();


        Austria au = new Austria();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~AUSTRIA");
        au.outputOfficialLanguage(Austria.officialLanguages);       // inherited but unused string array
        au.outputOfficialLanguage("Austrian German");
        au.outputOfficialLanguage();
        au.outputGDP();
        au.outputCapitalCity();


        Belgium be = new Belgium();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~BELGIUM");
        be.outputOfficialLanguage(Belgium.officialLanguages);
        be.outputOfficialLanguage("Belgian");                       // ignored parameter
        be.outputOfficialLanguage();
        be.outputGDP();
        be.outputCapitalCity();


        // despite the fact that Italy instance is declared with a EuropeanUnion as a reference type,
        // since methods are overridden in the child class (Italy),
        // method calls will use child class methods, while variables will have values as set in the parent class
        EuropeanUnion it = new Italy();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ITALY");
        System.out.print("Method: ");         it.outputCapitalCity();
        System.out.print("Variable: ");       System.out.println(it.capitalCity);       // outputs Brussels, WRONG
        System.out.print("Method: ");         it.outputGDP();                           // outputs 40.61, WRONG, since Italy class did not override this method
        System.out.print("Variable: ");       System.out.println(it.GDP_per_capita);    // outputs 40.61, WRONG
        System.out.print("Method: ");         it.outputOfficialLanguage();              // outputs "English" and "French", WRONG, since method is not overridden ih the Italy class
        System.out.print("Variable: ");       System.out.println(Italy.officialLanguage);   // outputs "Italian", since it is a static variable



        // in this case, France is declared with EuropeanUnion as a reference type,
        // but it does not have any overridden methods.
        // therefore, all available methods are the ones declared in the EuropeanUnion class.
        //
        EuropeanUnion fr = new France();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~FRANCE");
        System.out.print("Method: ");         fr.outputCapitalCity();                   // output Brussels, WRONG
        System.out.print("Method: ");         fr.outputGDP();                           // output 40.61, WRONG
        System.out.print("Method: ");         fr.outputOfficialLanguage();              // output "ENGLISH" and "FRENCH", WRONG
        System.out.print("Variable: ");       System.out.println(fr.capitalCity);       // output Brussels, WRONG
        System.out.print("Variable: ");       System.out.println(fr.GDP_per_capita);    // output 40.61, WRONG
        System.out.print("Variable: ");       System.out.println(fr.officialLanguages); // output string array location, inherited from the EU class
//        fr.frenchPresident();               // does not compile
//        fr.mostVisitedPaidMonument();       // does not compile
//        fr.nationalDay;                     // does not compile

        // when declared with a France class as a reference type,
        // its public methods and fields are available
        France fr2 = new France();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~FRANCE 2");
        fr2.frenchPresident();
        fr2.mostVisitedPaidMonument();
        System.out.println(fr2.nationalDay);


        // EuropeanUnion as a superclass has access only to the public members of its child classes
        // there is no inherited variables, and
        Spain es = new Spain();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~SPAIN");
        System.out.println(es.capitalCity);
//        es.officialLanguage;        // does not compile, access issue
//        es.GDP_per_capita;          // does not compile, access issue
//        es.sanFerminLocation;       // does not compile, access issue



    }
}
