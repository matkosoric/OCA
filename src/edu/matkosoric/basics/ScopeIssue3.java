package edu.matkosoric.basics;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class ScopeIssue3 {

    public static void main(String[] args) {

        // simple for loop
        for (int i = 0; i < 6; i++)
            System.out.println(i);
//            System.out.println(i);      // does not compile, variable out of scope

        // nested for loops
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 5; k++) {
                String doubleDareYou = "Say what again!";
                for (int j = 0; j < 5; j++) {
                }
            }
//            System.out.println(doubleDareYou);      // does not compile, variable out of scope
        }



    }

}
