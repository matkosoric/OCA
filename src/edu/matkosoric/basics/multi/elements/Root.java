package edu.matkosoric.basics.multi.elements;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Root {

    // final constant can be shadowed in a child class

    final static boolean strength = true;
}


class Tree extends Root{

    static boolean strength = false;

    public static void main(String[] args) {
        System.out.println(strength);
    }

}