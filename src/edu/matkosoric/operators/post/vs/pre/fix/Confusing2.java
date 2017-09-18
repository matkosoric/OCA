package edu.matkosoric.operators.post.vs.pre.fix;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Confusing2 {

    public static void main(String[] args) {

        int f1 = 5;
        int f2 = f1++;
        int f3 = --f2;

        if ((--f1 == f2--) | (++f3 != ++f2 ))           // this is a real-life example
            f3 += f2--;                                 // that real programmers encounter on a daily basis


        System.out.println("f1: " + f1);
        System.out.println("f2: " + f2);
        System.out.println("f3: " + f3);


    }

}
