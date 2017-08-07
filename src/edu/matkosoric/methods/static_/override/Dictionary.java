package edu.matkosoric.methods.static_.override;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Dictionary {

    // static method
    public static void printTypeOfContent () {
        System.out.println("Content: Words in general.");
    }

    //static method
    public static void printCoverType () {
        System.out.println("Hard.");
    }

    // instance method
    public void printNumberOfPages() {
        System.out.println("5000");
    }

    // instance method
    public void printContentLocation () {
        System.out.println("the beginning");
    }

}
