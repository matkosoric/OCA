package edu.matkosoric.arrays.measuring.dimensions;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */
public class GettingDimensions {

    public static void main(String[] args) {

        // first dimension of an array is in the length field.
        int firstDimension = 8;
        String [][][][][] stringArray = new String [firstDimension][13][6][2][44];
        System.out.println("First dimension: " + stringArray.length);
        System.out.println("Second dimension: " + stringArray[0].length);
        System.out.println("Third dimension: " + stringArray[0][0].length);
        System.out.println("Fourth dimension: " + stringArray[0][0][0].length);
        System.out.println("Fifth dimension: " + stringArray[0][0][0][0].length);

    }
}
