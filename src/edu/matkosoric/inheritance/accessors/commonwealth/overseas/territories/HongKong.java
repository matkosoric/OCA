package edu.matkosoric.inheritance.accessors.commonwealth.overseas.territories;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import edu.matkosoric.inheritance.accessors.commonwealth.UnitedKingdom;

public class HongKong  {

    // real Hong Kong is no longer a part of the Commonwealth,
    // therefore, this class does not extend UK class.
    // it has access only to the public members of the UK,
    // and only through the instance of UK class.
    // if compared with USA, the relationship to the UK class is identical.


    public static void main(String[] args) {

        UnitedKingdom uk = new UnitedKingdom();
        System.out.println(uk.citizenship);
//        System.out.println(uk.currency);            // does not compile, protected access
//        System.out.println(uk.queen);               // does not compile, default access
//        System.out.println(uk.capitalCity);         // does not compile, private access

    }
}
