package edu.matkosoric.basics;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class InstanceVarAccess {

    // instance variables are available from instance methods without the "this." prefix

    int a = 4;
    int b = 2;

    public static void main(String[] args) {

        new InstanceVarAccess().outputSum(3);

    }

    public void outputSum(int a) {
        System.out.println(a + b);          // 5, variable 'a' is shadowed by parameter
        System.out.println(this.a+this.b);  // 6

    }

}
