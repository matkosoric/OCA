package edu.matkosoric.operators.comparing.strings;

/**
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class LaWoman {

    public static void main(String[] args) {

        // declaring and initialising
        String motel1 = new String("Motel");
        String motel2 = new String("Motel");
        StringBuilder money1 = new StringBuilder("Money");
        StringBuilder money2 = new StringBuilder("Money");
        String murder1 = "Murder";
        StringBuilder murder2 = new StringBuilder("Murder");

        // comparing string with string
        System.out.println("1. " + motel1.equals(motel2));           // true, since equals method with strings checks for the value inside
        System.out.println("2. " + (motel1 == motel2) + "\n");       // false, since == operator checks for the object memory location

        // comparing stringBuilder with stringBuilder
        System.out.println("3. " + money1.equals(money2));          // false, equals() on stringBuilder checks for the memory location
        System.out.println("4. " + (money1 == money2) + "\n");      // false, also checks for objects equality via memory location

        // comparing String and StringBuilder
        System.out.println("5. " + murder1.equals(murder2) + "\n");
//        System.out.println(murder1 == murder2);         // does not compile
//                                                        // operator == can not be used to compare string and stringBuilder

        System.out.println("6. " + "Madness".equals("Madness"));
        System.out.println("7. " + ("Madness" == "Madness"));
    }

}
