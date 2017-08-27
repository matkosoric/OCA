package edu.matkosoric.operators.post.vs.pre.fix;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Confusing {

    public static void main(String[] args) {

        byte a = -2;
        byte b = a--;
        byte c = ++b;

        System.out.println("a: " + a + ", b: " + b + ", c: " + c);

    }
}
