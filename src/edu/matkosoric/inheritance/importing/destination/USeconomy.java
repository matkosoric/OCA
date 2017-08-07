package edu.matkosoric.inheritance.importing.destination;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

// 1. this import enables the use of static methods
import edu.matkosoric.inheritance.importing.source.*;

// 2. importing static with wildcard
import static edu.matkosoric.inheritance.importing.source.UKeconomy.*;

// 3. static variables have to be imported with the static keyword, and
// named explicitly for particular import, or with the wildcard for collective import.
// first import without the static keyword is useless in this case.
import static edu.matkosoric.inheritance.importing.source.GermanEconomy.countryName;
import static edu.matkosoric.inheritance.importing.source.GermanEconomy.importingValueInBillions;

// 4. importing with the wildcard
import edu.matkosoric.inheritance.importing.source.CanadianEconomy.*;

// 5. this will not compile, since GermanEconomy and MexicanEconomy classes
// have identically named static field "countryName".
//import static edu.matkosoric.inheritance.importing.source.MexicanEconomy.countryName;

// 6. static import with wildcard from BrazilianEconomy
import edu.matkosoric.inheritance.importing.source.BrazilianEconomy;



public class USeconomy {

    public static void main(String[] args) {

        // 1. regular import enables the use od static methods from ChineseEconomy class
        // but only through a class name
        ChineseEconomy.cars();
        ChineseEconomy.TVs();
        ChineseEconomy.ships();

        // 2. static import of methods with wildcard from UKeconomy class
        cars();
        TVs();
        ships();

        // 3. static import of a specific >variable< does not require stating the class name,
        // since it is explicitly named in the import statement from GermanEconomy class.
        System.out.println(countryName);
        System.out.println(importingValueInBillions);

        // 4. static import of variables from CanadianEconomy class with the wildcard.
        // class name has to be used
        System.out.println(CanadianEconomy.countryName);
        System.out.println(CanadianEconomy.importingValueInBillions);

        // 6. imported non-static variables from BrazilianEconomy
        // can be accessed only through the instance
//        System.out.println(countryNameBR);                // does not compile
//        System.out.println(importingValueInBillionsBR);   // does not compile
        BrazilianEconomy b = new BrazilianEconomy();
        System.out.println(b.countryNameBR);
        System.out.println(b.importingValueInBillionsBR);


    }
}
