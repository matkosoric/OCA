package edu.matkosoric.basics;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class BooleanTrap {

    public static void main(String[] args) {

        boolean x = false;
        boolean y = false;

//        boolean a1 = (x != y = !x);      // does not compile, interpreted as ((x != y) = !x) or (false = !x)
        boolean a2 = (x != (y = !x));      // operator precedence has to be adopted to proper syntax


        boolean i1 = true;
        boolean i3 = (i1 = false) | i1;     // after i1 = false, second i1 is changed to false
        System.out.println(i3);

    }
}
