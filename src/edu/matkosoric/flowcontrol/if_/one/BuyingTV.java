package edu.matkosoric.flowcontrol.if_.one;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class BuyingTV {

    // in a IF-ELSE-IF staement, when one condition is met,
    // others are not checked.

    public static void main(String[] args) {

        int tvPrice = 90;

        if (tvPrice < 150) System.out.println("The price is fine, I will buy this TV!");
        else if (tvPrice >= 150) System.out.println("The price is too big.");
        else if (tvPrice < 100) System.out.println("The TV is too cheap, I will not buy it!");

    }

}
