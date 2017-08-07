package edu.matkosoric.methods.static_.override;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class MedicalDictionary extends Dictionary{

    // this method >hides< inherited static method from the superclass,
    // since static methods can not be overrided.
    public static void printTypeOfContent () {
        System.out.println("Content: Medical notions.");
    }

    // this is an instance method named exactly the same as the inherited static method.
    // that will disable code compilation.
//    public void printCoverType () {
//        System.out.println("Soft.");
//    }

    // this instance method overrides inherited instance method
    public void printNumberOfPages () {
        System.out.println("1000");
    }


    // this is static method with the same name as the instance method in the parent class.
    // it is forbidden to attempt to override instance method with a static method.
//    public static void printContentLocation () {
//        System.out.println("the end.");
//    }

}
