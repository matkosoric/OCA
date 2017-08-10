package edu.matkosoric.inheritance.linking.constructors;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Crust extends Core {

    // this works fine

    int a, b, c;

    public Crust (int x, int y) {
        System.out.println("this will call no-args constructor in the superclass");
    }

    public Crust (int x) {
        super (x);
    }

}
