package edu.matkosoric.arrays.multidimensionalArray;

/**
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */
public class example2 {

    public static void main(String[] args) {

        //when declaring multidimensional arrays,
        // the size of first dimension is mandatory
        // while others may be defined later on

        int [][][] integerArrayCorrect1  = new int[8][][];

        // the same can be accomplished in two steps
        int [][][] integerArrayCorrect2;
        integerArrayCorrect2 = new int[5][][];

        // and here is an example with the String type
        String [][][] stringArrayCorrect1 = new String[6][][];
        String [][][] stringArrayCorrect2;
        stringArrayCorrect2 = new String[4][][];

        //on the other hand, following examples will not compile
//        int [][][] integerArrayIncorrect1 = new int[][][];   //does not compile
//        int [][][] integerArrayIncorrect2 = new int[][4][];   //does not compile
//        int [][][] integerArrayIncorrect3 = new int[][][9];   //does not compile
//        int [][][] integerArrayIncorrect4 = new int[][7][5];   //does not compile



    }
}
