package edu.matkosoric.inheritance.valid.import_;

/*
import java.lang.Math.*;                // missing static keyword
import java.lang.Math.PI;               // missing static keyword
import static java.lang.*;              // wrong path
import static java.lang.*.PI;           // wrong syntax
*/

import static java.lang.Math.*;             // either works
//import static java.lang.Math.PI;          // either works

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class PIclass {

    public static void main(String[] args) {

        System.out.println(PI);

    }
}
