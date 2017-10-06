package edu.matkosoric.inheritance.casting;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import edu.matkosoric.inheritance.casting.data.types.Asia;
import edu.matkosoric.inheritance.casting.data.types.EuroAsia;
import edu.matkosoric.inheritance.casting.data.types.Pangaea;

public class Execution2 {

    // examples of possible and impossible casts between objects with varying reference and object types

    public static void main(String[] args) {

        Pangaea a = new Pangaea();

        Pangaea c1 = new EuroAsia();
        EuroAsia c2 = new EuroAsia();

        Pangaea d1 = new Asia();
        EuroAsia d2 = new Asia();
        Asia d3 = new Asia();

//        c1 = a;           // compiles fine and does not produce any runtime exception,
                            // but affects following statements.

//        c1 = (EuroAsia)a;     // compiles, but throws a runtime ClassCastException

//        c2 = a;         // does not compile.
                          // reference type of c2 (EuroAsia) is subclass of reference type of a (Pangaea)
//        c2 = (EuroAsia)a;   // compiles, but throws a runtime ClassCastException



        a = c1;                 // variable c1 has Pangaea as its reference type.

//        a = (EuroAsia)c1;       // compiles, but throws a runtime ClassCastException

        a = (Pangaea)c1;            // redundant casting

        a = c2;
        a = (EuroAsia)c2;
        a = (Pangaea)c2;


    }
}
