package edu.matkosoric.datatypes.number.systems;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Binary {

    public static void main(String[] args) {

        // this is not a binary literal, but hexadecimal.
        // binary literal starts with 0b, not 0xb.
        double a = 0xb101010;
        System.out.println(a);

        // valid binary literal
        float b = 0b100_100;
        System.out.println(b);

        // suffix f, F, d, or D is used only with literals in decimal system, not binary
        //        float c = 0b101010000f;         // does not compile
        float d = 0b101010000;          // binary literal, does not require f, F, d, or D
        float e = 0x1100110;            // hex literal, does not require f, F, d, or D
        float f = 0x10F;                // hex literal, ending F is interpreted as part of the literal

        long g = 0b101100L;             // valid
        long h = 0b101100;              // valid

//        double i = 0b110011D;       // does not compile
        double j = 0b110011;
        double k = 0b110011L;
//        double l = 0b110011d;       // does not compile

    }
}
