package edu.matkosoric.inheritance.accessors.commonwealth;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Australia extends UnitedKingdom {

    // Australia class is a subclass of the UnitedKingdom class,
    // located in the identical package.
    // it does not have access only to the private members of UnitedKingdom class.

    public static void main(String[] args) {

        Australia au = new Australia();
        System.out.println(au.citizenship);
        System.out.println(au.currency);
        System.out.println(au.queen);
//        System.out.println(au.capitalCity);     // does not compile, private access

    }

}
