package edu.matkosoric.flowcontrol.looping.multidimensional.array;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class MultiLoop {



    public static void main(String[] args) {

        int [] [] [] integerArray3D = new int[][][] {
                {{1,1,1}, {2,2,2}},
                {{3,3,3}, {4,4,4}},
                {{5,5,5}, {6,6,6}}};

        // this is valid, but output prints only memory location
        for (int [][] element : integerArray3D)
            System.out.println(element);

        // existing and predefined variables can not be used in enhanced for loop
        byte [] byteArray1D = new byte[9];
        byte counter = 0;
//        for (counter : byteArray1D)             // does not compile
//            System.out.println(counter);


        // element type must match the array content type
        byte [] [] byteArray2D = new byte [4] [4];
//        for (byte element : byteArray2D)            // does not compile



    }

}
