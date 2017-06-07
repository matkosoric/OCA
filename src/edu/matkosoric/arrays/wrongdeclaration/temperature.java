package edu.matkosoric.arrays.wrongdeclaration;

/**
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class temperature {

    public static void main(String[] args) {

        // size of the array is defined in the instantiation part, after the new keyword that calls constructor,
        // not in the declaration part that states the type.
        double [] measuredTemperature1 = new double[5];
//        double [5] measuredTemperature2 = new double[5];        // does not compile
//        double [5] measuredTemperature3 = new double[];         // does not compile


        // array size must be defined with the integer type
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

    }

}
