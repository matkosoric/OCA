package edu.matkosoric.inheritance.accessors.commonwealth;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Canada {

    // Canada is in the same package as Australia, but does not extend UK class.
    // it has the same access as Australia class, although it must create the instance of UK class.
    // access is restricted only for the private field (capitalCity).

    public static void main(String[] args) {

        UnitedKingdom uk = new UnitedKingdom();

        System.out.println(uk.citizenship);
        System.out.println(uk.currency);
        System.out.println(uk.queen);
//        System.out.println(uk.capitalCity);         // does not compile, private access

    }
}
