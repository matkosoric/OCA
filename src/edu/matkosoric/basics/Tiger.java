package edu.matkosoric.basics;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Tiger {

    // a class can have itself as a field, without compilation errors

    Tiger t;
    String name;

    public static void main(String[] args) {

        Tiger primeFather = new Tiger();
        primeFather.name = "Jimmy";
        System.out.println(primeFather.name);

        // this will compile, but also throw a runtime NullPointerException,
        // since 'second-generation' tiger was not initalised.
//        System.out.println(a.t.name);

        primeFather.t = new Tiger();
        primeFather.t.name = "Alphonso";
        System.out.println(primeFather.t.name);

        // this will compile, but obviously throw the same exception,
        // since most of the objects were not initialised
        primeFather.t.t.t.t.t.t.t.t.t.t.t.t.t.t.name = "Ricky";
    }

}
