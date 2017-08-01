package edu.matkosoric.basics;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class ModulusNegativeByNegative {

    public static void main(String[] args) {

        // modulus operator returns negative result when first operand is negative

        System.out.println("11 divided by 5 is: " + 11/5 + ", and the remainder is: " + 11 % 5);
        System.out.println("11 divided by -5 is: " + 11/-5 + ", and the remainder is: " + 11 % -5);
        System.out.println("-11 divided by 5 is: " + -11/5 + ", and the remainder is: " + -11 % 5);
        System.out.println("-11 divided by -5 is: " + -11/-5 + ", and the remainder is: " + -11 % -5);

    }
}
