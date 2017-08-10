package edu.matkosoric.methods.false_.constructor;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Jupiter {

    int rings;

    // this is a 'false' constructor, due to the void keyword.
    // this is an instance method.
    public void Jupiter (int numberOfRings) {
        this.rings = numberOfRings;
    }

    public static void main(String[] args) {

        Jupiter j1 = new Jupiter();         // compiles, since there is a default no-arguments constructor
        j1.Jupiter(29);         // this sets the rings value
        System.out.println(j1.rings);

//        Jupiter j2 = new Jupiter(3);        // does not compile, since there is no constructor
                                              // that accepts any parameters.
    }
}
