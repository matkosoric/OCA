package edu.matkosoric.strings.join;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Telephone {

    // demo of String.join() method

    public static void main(String[] args) {

        // telephone example
        String [] elementsArray = {"555", "1234", "5678"};
        String result = String.join("-",elementsArray);
        System.out.println(result);

        // addition example
        String [] elementsArray2 = {"5", "2", "9"};
        String sum = String.join("+", elementsArray2);
        System.out.println(sum);

    }

}
