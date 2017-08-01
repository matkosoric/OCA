package edu.matkosoric.inheritance.accessors.commonwealth.overseas.territories;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import edu.matkosoric.inheritance.accessors.commonwealth.UnitedKingdom;

public class Bermuda extends UnitedKingdom{

    // Bermuda class is a subclass of UK class in a different package.
    // hierarchical folder structure does not affect the rules of inheritance.
    // two classes in the same package share the identical folder path.
    // Bermuda class can access only public and protected members of UK class.

    public static void main(String[] args) {

        Bermuda bm = new Bermuda();

        System.out.println(bm.citizenship);     // public access in UK class
        System.out.println(bm.currency);        // protected access in the UK class
//        System.out.println(bm.queen);           // does not compile, default access in the UK class
//        System.out.println(bm.capitalCity);     // does not compile, private access in the UK class

    }

}
