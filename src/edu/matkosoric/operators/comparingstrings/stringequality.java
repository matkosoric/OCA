package edu.matkosoric.operators.comparingstrings;

/**
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class stringequality {

    public static void main(String[] args) {

        // declaring and initialising
        String motel1 = new String("Motel");
        String motel2 = new String("Motel");
        StringBuilder money1 = new StringBuilder("Money");
        StringBuilder money2 = new StringBuilder("Money");



        System.out.println(motel1.equals(motel2));
        System.out.println(motel1 == motel2);       // outputs false, since == operator checks

        System.out.println(money1.equals(money2));
        System.out.println(money1 == money2);

        // comparing String and StringBuilder
        String murder = "Murder";
        System.out.println(murder.equals(money1));
//        System.out.println(murder == money1);       // does not compile, operatoy == can not be used to compare string and stringBuilder

        System.out.println("Madness".equals("Madness"));
        System.out.println("Madness" == "Madness");
    }

}
