package edu.matkosoric.datatypes.number.systems;

/**
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */
public class NumberSystems {

    public static void main(String[] args) {


        int decimalNum1 = 5;    // number 5 in a base 10 system (decimal system)
        int decimalNum2 = 34;   // number 34 in a base 10 system (decimal system)
        int decimalNum3 = 827;  // number 827 in a base 10 system (decimal system)
        System.out.println("Base 10 examples: " +   decimalNum1 + ", " +
                                                    decimalNum2 + ", " +
                                                    decimalNum3 + ".");

        int hexNum1 = 0x9;      // number 10 in a base 16 system (hexadecimal system)
        int hexNum2 = 0xF;      // number 15 in a base 16 system  (hexadecimal system)
        int hexNum3 = 0xD5;     // number 213 in a base 16 system  (hexadecimal system)
        System.out.println("Base 16 examples: " +   hexNum1 + ", " +
                                                    hexNum2 + ", " +
                                                    hexNum3 + ".");

        int octalNum1 = 02;      // number 2 in a base 8 system (octal system)
        int octalNum2 = 014;     // number 12 in a base 8 system (octal system)
        int octalNum3 = 077;     // number 63 in a base 8 system (octal system)
        System.out.println("Base 8 examples: " +     octalNum1 + ", " +
                                                     octalNum2 + ", " +
                                                     octalNum3 + ".");

        int binaryNum1 = 0b1;                   // number 1 in a base 2 system (binary system)
        int binaryNum2 = 0b0101010;             // number 42 in a base 2 system (binary system)
        int binaryNum3 = 0B11000001110111010;   // number 99258 in a base 2 system (binary system)
        System.out.println("Base 2 examples: " +    binaryNum1 + ", " +
                                                    binaryNum2 + ", " +
                                                    binaryNum3 + ".");


        // symbol 8 is not permitted in the octal system, just like 9 or signs from hexadecimal system
//        int octalIncorrect1 = 08;        //does not compile
//        int octalIncorrect2 = 039;  //does not compile
//        int octalIncorrect3 = 03E;  //does not compile

        // Letters other than A, B, C, D, E, and F are not part of the hexadecimal system
//        int hexIncorrect1 = 0xG;        // does not compile
//        int hexIncorrect2 = 0X12AU;        // does not compile

        // binary form accepts only sign 1 and 0
//        int binaryIncorrect1 = 0B2;                    // does not compile
//        int binaryIncorrect2 = 0b01010101010106;       // does not compile

    }

}
