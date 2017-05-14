package edu.matkosoric.datatypes;

/**
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */
public class example1 {

    public static void main(String[] args) {



        int decimalNum1 = 5;    // number 5 in a base 10 system (decimal system)
        int decimalNum2 = 34;   // number 34 in a base 10 system (decimal system)
        int decimalNum3 = 827;  // number 827 in a base 10 system (decimal system)
        System.out.println("Base 10 examples: " +   decimalNum1 + "," +
                                                    decimalNum2 + "," +
                                                    decimalNum3 + ".");

        int hexNum1 = 0x9;      // number 10 in a base 16 system (hexadecimal system)
        int hexNum2 = 0xF;      // number 15 in a base 16 system  (hexadecimal system)
        int hexNum3 = 0xD5;     // number 213 in a base 16 system  (hexadecimal system)
        System.out.println("Base 16 examples: " +   hexNum1 + ", " +
                                                    hexNum2 + ", " +
                                                    hexNum3 + ".");

        int octalNum1 = 01;     // number 1 in a base 8 system (ocatal system)
        int octalNum2 = 04;     //
        int octalNum3 = 07;     //

        // symbol 8 is not permitted in the octal system
//        int octalNum = 08;  //does not compile


        //these will not compile
//        int octalIncorrect1 = 08;   //does not compile
//        int octalIncorrect2 = 039;  //does not compile
//        int octalIncorrect3 = 03E;  //does not compile


    }

}
