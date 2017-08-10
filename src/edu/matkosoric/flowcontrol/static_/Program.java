package edu.matkosoric.flowcontrol.static_;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Program {

    // reference to a static field causes initialisation of only
    // the class of interface that actually declares it,
    // even if it is referred through the name of a subclass,
    // sub-interface, or class that implements an interface.
    // basically, static initialisation of subclass is not executed.

    public static void main(String[] args) {
        System.out.println(Green.name);
    }
}
