package edu.matkosoric.datatypes.parsing;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import com.sun.org.apache.xpath.internal.operations.Bool;
import edu.matkosoric.flowcontrol.double_.case_.DoubleCase;

public class Parsing {

    public static void main(String[] args) {


        boolean d1 = true;
        boolean d2 = Boolean.parseBoolean("true");          // true
        boolean d3 = Boolean.parseBoolean("false");         // false
        boolean d4 = Boolean.parseBoolean("False");         // false
        boolean d5 = Boolean.parseBoolean("True");          // true
        boolean d6 = Boolean.parseBoolean("the x-files");   // false
        boolean d7 = Boolean.parseBoolean("TrUe");          // true
        boolean d8 = Boolean.parseBoolean("Truee");         // false

        // valueOf() method produces the same result as parseBoolean() method
        boolean d9 = Boolean.valueOf("true");          // true
        boolean d10 = Boolean.valueOf("false");         // false
        boolean d11 = Boolean.valueOf("False");         // false
        boolean d12 = Boolean.valueOf("True");          // true
        boolean d13 = Boolean.valueOf("the x-files");   // false
        boolean d14 = Boolean.valueOf("TrUe");          // true
        boolean d15 = Boolean.valueOf("Truee");         // false


        byte e1 = 127;
//        byte e2 = 128;                        // does not compile, value out of range
//        byte e3 = Byte.parseByte("128");    // compiles, but throws a runtime NumberFormatException
        byte e4 = -128;
//        byte e5 = -129;                         // does not compile, value out of range
//        byte e6 = Byte.parseByte("-129");   // compiles, but throws a runtime NumberFormatException
        byte e7 = Byte.parseByte("123");
//        byte e8 = Byte.parseByte("123.0");  // compiles, but throws a runtime NumberFormatException
//        byte e9 = Byte.parseByte("123L");   // compiles, but throws a runtime NumberFormatException
//        byte e10 = Byte.parseByte("123.1d");// compiles, but throws a runtime NumberFormatException


        short f1 = 32767;       // max value
        short f2 = -32768;      // min value
//        short f3 = Short.parseShort("15_000");      // compiles, but throws a runtime NumberFormatException
//        short f4 = Short.parseShort("40_000");      // compiles, but throws a runtime NumberFormatException
//        short f4 = Short.parseShort("40000");       // compiles, but throws a runtime NumberFormatException
        short f5 = Short.parseShort("-15000");


        int a1 = 10;
//        int a2 = Integer.parseInt("10.1");        // compiles, but throws a runtime NumberFormatException
        int a3 = Integer.parseInt("10");
//        int a4 = Integer.valueOf("10.1");         // compiles, but throws a runtime NumberFormatException
        int a5 = Integer.valueOf("10");

        float b1 = 20.1f;
        float b2 = Float.parseFloat("20.1");
//        float b3 = Float.parseFloat("20.0k");   // compiles, but throws a runtime NumberFormatException
        float b4 = Float.valueOf("20.1");
//        float b5 = Float.valueOf("20.1w");      // compiles, but throws a runtime NumberFormatException

        double c1 = 30.1;
        double c2 = Double.parseDouble("30.1");
        double c3 = Double.parseDouble("30.1 ");
//        double c4 = Double.parseDouble("30.1p");    // compiles, but throws a runtime NumberFormatException
        double c5 = Double.valueOf("30.1");
//        double c6 = Double.valueOf("30.1.");        // compiles, but throws a runtime NumberFormatException
//        double c7 = Double.valueOf("30.1L");        // compiles, but throws a runtime NumberFormatException
//        double c8 = Double.valueOf("30.1 q");       // compiles, but throws a runtime NumberFormatException

    }

}
