package edu.matkosoric.inheritance.interface_.intantiating;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Bukowski implements Writing{

    public static void main(String[] args) {

//        new Writing.writingWithPencil();        // does not compile
//        new Bukowski.writingWithPencil();       // does not compile
//        writingWithPencil();                    // does not compile

        Writing.writingWithPencil();

    }
}
