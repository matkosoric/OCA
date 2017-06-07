package edu.matkosoric.operators.comparingstrings;

/**
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class laWoman {

    public static void main(String[] args) {

        // declaring and initialising
        String motel1 = new String("Motel");
        String motel2 = new String("Motel");
        StringBuilder money1 = new StringBuilder("Money");
        StringBuilder money2 = new StringBuilder("Money");
        String murder1 = "Murder";
        StringBuilder murder2 = new StringBuilder("Murder");

        // comparing string with string
        System.out.println(motel1.equals(motel2));
        System.out.println((motel1 == motel2) + "\n");       // outputs false, since == operator checks for the object equality

        // comparing stringBuilder with stringBuilder
        System.out.println(money1.equals(money2));
        System.out.println((money1 == money2) + "\n");

        // comparing String and StringBuilder
        System.out.println(murder1.equals(murder2) + "\n");
//        System.out.println(murder1 == murder2);         // does not compile
//                                                        // operator == can not be used to compare string and stringBuilder

        System.out.println("Madness".equals("Madness"));
        System.out.println("Madness" == "Madness");
    }

}
