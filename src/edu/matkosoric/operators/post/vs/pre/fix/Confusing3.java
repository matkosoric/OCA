package edu.matkosoric.operators.post.vs.pre.fix;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Confusing3 {

    public static void main(String[] args) {


        short a = 1;
        short b = 2;
        System.out.println(a++ + a++ + a++);        // 1 + 2 + 3
        System.out.println(a);                      // at the end, a has value 4
        System.out.println(--b + --b + --b);        // 1 + 0 - 1


        int c = 3;
        int d = 4;
        System.out.println(++c + --c + c);          // 4 + 3 + 3
        System.out.println(d-- + --d);              // 4 + 2, steps are: taking value, decrementing, decrementing, taking value

        int e = 4;
        System.out.println(d-- - --d);              // 4 - 2,

    }

}
