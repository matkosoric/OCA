package edu.matkosoric.operators.negative.modulus;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Negativity {

    // result of modulo operation will match first operand(dividend) with its prefix

    public static void main(String[] args) {

        int totality1 = -100;
        int almostComplete1 = -93;
        int remainder1 = totality1%almostComplete1;
        System.out.println(remainder1);                  // output: -7


        int totality2 = 100;
        int almostComplete2 = -93;
        int remainder2 = totality2%almostComplete2;
        System.out.println(remainder2);                  // output: 7

        int totality3 = -100;
        int almostComplete3 = 93;
        int remainder3 = totality3%almostComplete3;
        System.out.println(remainder3);                  // output: -7

        int totality4 = 100;
        int almostComplete4 = 93;
        int remainder4 = totality4%almostComplete4;
        System.out.println(remainder4);                  // output: 7

    }

}
