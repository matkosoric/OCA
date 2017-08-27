package edu.matkosoric.operators.comparing.integers;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class IntegerComparation {

    // operator == checks for the memory location, disregarding the value itself

    public static void main(String[] args) {

        Integer numberOfFingers_Hands = new Integer (9);
        Integer numberOfFingers_Feet = new Integer(9);
        System.out.println(numberOfFingers_Feet == numberOfFingers_Hands);     // outputs: false

        Integer numberOfHorns1 = 3;
        Integer numberOfHorns2 = 3;
        System.out.println(numberOfHorns1 == numberOfHorns2);       // output: true

    }

}
