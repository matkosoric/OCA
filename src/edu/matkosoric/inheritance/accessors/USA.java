package edu.matkosoric.inheritance.accessors;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import edu.matkosoric.inheritance.accessors.commonwealth.UnitedKingdom;

public class USA {

    // USA class is not in the package of UnitedKingdom class,
    // and it does not extend UK class.
    // therefore, it has access only to the public members of UK class.

    public static void main(String[] args) {

        UnitedKingdom uk = new UnitedKingdom();
        System.out.println(uk.citizenship);
//        System.out.println(uk.currency);            // does not compile, protected access
//        System.out.println(uk.queen);               // does not compile, default access
//        System.out.println(uk.capitalCity);         // does not compile, private access


    }

}
