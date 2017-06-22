package edu.matkosoric.basics;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class SingleLineInstantiation {

    public static void main(String[] args) {

        // this is valid single-line declaration and instantiation for multiple objects
        String detective1, detective2, detective3, detective4 = new String();
        PsychoKiller hannibal, toothFairy = new PsychoKiller();
        Object movie1, movie2, movie3 = new Object();

        // similar statements do not work with primitive types, since there are no constructors in the Class class.
//    short year1, year2, year3 = new short();        // does not compile
//    int n1, n2, n3, n4, n5 = new int();             // does not compile
//    Double d1, d2, d3 = new Double();               // does not compile
        int i1, i2, i3;             // valid statement
        Double h1, h2, h3;          // valid statement

        // this is single-line declaration and initialisation of a String type, that also works with primitives
        String town1, town2, town3, town4 = "any town";
//    String county1 = county2 = county3;           // does not compile
        String village1, village2, village3 = village1 = village2 = "any village";          // Weird but valid
        int population1, population2, population3 = population2 = population1 = 200_000;    // Weird but valid

    }
}


class PsychoKiller {
    String name;
    int age;
}
