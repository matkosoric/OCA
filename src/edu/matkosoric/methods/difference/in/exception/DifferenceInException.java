package edu.matkosoric.methods.difference.in.exception;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class DifferenceInException {

    public static void main(String[] args) {

        Human nietzsche = new Human();

        nietzsche.eating();     // compiles fine, no exception handling needed



        Monkey bobo = new Human();
        Monkey bubu = new Monkey();

//        bobo.eating();      // does not compile, missing exception handling
//        bubu.eating();      // does not compile, missing exception handling

    }

}
