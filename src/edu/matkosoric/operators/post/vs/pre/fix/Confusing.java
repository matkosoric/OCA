package edu.matkosoric.operators.post.vs.pre.fix;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Confusing {

    public static void main(String[] args) {

        byte a = -2;
        byte b = a--;       // b becomes -2, a becomes -3
        byte c = ++b;       // b becomes -1, c becomes -1

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);

    }
}
