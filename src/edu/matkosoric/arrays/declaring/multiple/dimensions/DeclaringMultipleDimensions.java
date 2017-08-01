package edu.matkosoric.arrays.declaring.multiple.dimensions;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class DeclaringMultipleDimensions {

    public static void main(String[] args) {

        // different dimensions of array can be declared in different lines

        // first dimension
        String [] [] [] formsOfWater = new String[3][][];

        // second dimension
        formsOfWater[0] = new String[3][];
//        formsOfWater[1] = new String[][3];  //does not compile, second dimension has priority over the third dimension
        formsOfWater[1] = new String[3][];
        formsOfWater[2] = new String[3][];

        // third dimension
        formsOfWater[0][0] = new String[3];
        formsOfWater[0][1] = new String[3];
        formsOfWater[0][2] = new String[3];
        formsOfWater[1][0] = new String[3];
        formsOfWater[1][1] = new String[3];
        formsOfWater[1][2] = new String[3];
        formsOfWater[2][0] = new String[3];
        formsOfWater[2][1] = new String[3];
        formsOfWater[2][2] = new String[3];

    }

}
