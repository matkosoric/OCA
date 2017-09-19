package edu.matkosoric.inheritance.interface_.variables;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class LeonardoDaVinci implements LeonardoInterface {

    // interface variables are implicitly public, static and final

    // implementation of interface methods with blank body
    public void drawing() {}
    public void sculpting() {}
    public void inventing() {}
    public void writing() {}

    public static void main(String[] args) {

        System.out.println(inventionNo1);
        System.out.println(inventionNo2);

        // interface variables are implicitly final and therefore can not be changed
//        inventionNo3 = "Flux capacitor";        // does not compile
//        inventionNo4 = "Warp drive";            // does not compile

    }
}


