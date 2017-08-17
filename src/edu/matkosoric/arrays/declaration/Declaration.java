package edu.matkosoric.arrays.declaration;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Declaration {

    public static void main(String[] args) {

//        int [][][] integerArray1 = {{1,1,1}, {2,2,2}, {3,3,3}};         // does not compile, missing dimension
        int [][][] integerArray1 = {{{1,1,1}, {2,2,2}, {3,3,3}}};

//        int [] [] integerArray3 = new int[][] {7,7,7};      // does not compile, missing dimension
        int [] [] integerArray4 = new int[][] {{7,7,7}, {}};

//        int [6] integerArray5 = new int[];       // does not compile, array size can not be on the left side of declaration
        int [ ] integerArray6 = new int[6];

        Object recentYearsObj = new int[]{2015, 2016, 2017};
//        Object [] recentYearsInt = new int [3];             // does not compile

//        int [] [] integerArray7 = new int [][] {{1,1,1}  {2,2,2}};    // does not compile, missing comma

        // valid combinations
        int [] integerArray8 = new int[] {5,6,7};
        int [][] integerArray9 = new int[][] {integerArray8, integerArray8, integerArray8, {4,4,4}};
        int [][][] integerArray10 = new int[][][] {integerArray9};

        int [][] integerArray11 = new int [2][5];
//        integerArray11 [0] = {3,3,3,3,3};       // does not compile, initialisation can be done only during declaration

    }
}
