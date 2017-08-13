package edu.matkosoric.inheritance.casting;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Execution {

    // examples of possible and impossible casts between objects with varying reference and object types

    public static void main(String[] args) {

        Pangaea a = new Pangaea();

        Pangaea b1 = new Africa();
        Africa b2 = new Africa();

        Pangaea c1 = new EuroAsia();
        EuroAsia c2 = new EuroAsia();

        Pangaea d1 = new Asia();
        EuroAsia d2 = new Asia();
        Asia d3 = new Asia();


        // object 'a' can not be down casted, since its object type is Pangaea
//        Africa temp1 = (Africa)a;       // compiles, but throws a run-time ClassCastException
//        EuroAsia temp2 = (EuroAsia)a;   // compiles, but throws a run-time ClassCastException
//        Asia temp3 = (Asia)a;           // compiles, but throws a run-time ClassCastException

        b1 = a;     // after this, variable b1 changes its targeted object from
                    // Africa object type to the object of Pangaea object type.
                    // reference type (Pangaea) remains unaffected.

//        b1 = (Africa)a;     // compiles, but throws a run-time ClassCastException
//        b2 = a;             // does not compile, incompatible types.
                              // b2 is Africa as a reference type, but since Africa extends Pangaea,
                              // object 'a' (of Pangaea type) can be down casted to Africa during compilation.
                              // however, during runtime, there will be a ClassCastException, since
                              // variable 'a' can not change its reference type.
//        b2 = (Africa) a;    // compiles, but throws a run-time ClassCastException

        // variable b1 already has Pangaea as a reference type
        // while variable b2 gets up-casted to the Pangaea domain.
        // in both cases variable 'a' reference type remains unaffected.
        a = (Pangaea)b1;        // redundant casting
        a = (Pangaea)b2;        // redundant casting

   }
}
