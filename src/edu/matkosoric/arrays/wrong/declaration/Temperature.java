package edu.matkosoric.arrays.wrong.declaration;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import java.util.Arrays;

public class Temperature {

    public static void main(String[] args) {

        // size of the array is defined in the instantiation part, after the new keyword that calls constructor,
        // not in the declaration part that states the type.

        double [] measuredTemperature1 = new double[5];
//        double [5] measuredTemperature2 = new double[5];        // does not compile
//        double [5] measuredTemperature3 = new double[];         // does not compile



        // array >size< must be defined with the integer type, or the type that is implicitly casted to integer

        long arraySizeLong = 8;
//        double [] measuredTemperature4 = new double[arraySizeLong];     // does not compile
        float arraySizeFloat = 62.2F;
//        double [] measuredTemperature5 = new double[arraySizeFloat];    // does not compile

        Integer arraySizeIntegerWrapper = 17;
        double [] measuredTemperature6 = new double[arraySizeIntegerWrapper];

        short arraySizeShort = 12;
        double [] measuredTemperature7 = new double[arraySizeShort];

        Byte arraySizeByteWrapper = 25;
        double [] measuredTemperature8 = new double[arraySizeByteWrapper];



        // array values can be set with curly braces - { } - only in first line, during declaration.
        // an attempt to do it later on will produce a compile-time error.
        // after first line, values can be set by using the index, loop, Arrays.fill...

        double [] measuredTemperature9 = new double [] {21.0, 19.8, 34.2, 29.7, 24.1};      // compiles

        double [] measuredTemperature10 = new double [5];
//        measuredTemperature10 = {21.0, 19.8, 34.2, 29.7, 24.1};         // does not compile

        double[] measuredTemperature11 = new double[5];
        measuredTemperature11 [0] = 5.1;
        measuredTemperature11 [1] = 6.7;
        measuredTemperature11 [2] = 1.0;
        measuredTemperature11 [3] = 8.6;
        measuredTemperature11 [4] = 2.2;

        double[ ] measuredTemperature12 = new double[5];
        for (int i = 0; i < 5; i++) {
            measuredTemperature12[i] = (Math.random() * 10);
            System.out.println("Temperature values from loop: " + measuredTemperature12[i]);
        }

        double[] measuredTemperature13 = new double[5];
        Arrays.fill(measuredTemperature13, Math.random() * 10);

    }
}
