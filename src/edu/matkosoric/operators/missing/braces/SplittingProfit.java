package edu.matkosoric.operators.missing.braces;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class SplittingProfit {

    public static void main(String[] args) {
        calculateMyShare (26900.00, 13.84);
    }


    public static long calculateMyShare (double annualProfit, double mySharePercentage) {

//        return (long) annualProfit/mySharePercentage;       // does not compile
        return (long) (annualProfit/mySharePercentage);     // proper cast

    }
}
