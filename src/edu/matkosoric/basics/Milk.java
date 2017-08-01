package edu.matkosoric.basics;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Milk {

    // simple scope issue in if-else statement

    public static void main(String[] args) {

        boolean drinkingMilk = false;

        if (drinkingMilk = false) {
            boolean happy = false;
        } else {
//            happy = true;           // does not compile, variable out of scope
        }

//        System.out.println("Are you happy? " + happy);      // does not compile, variable out of scope
    }

}
