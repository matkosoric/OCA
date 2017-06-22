package edu.matkosoric.datatypes.declaring.variables;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class DeclaringVariables {

    public static void main(String[] args) {


        boolean b1 = true;
        Boolean b2 = true;
//        boolean b3 = True;      //does not compile, True is not a keyword
//        Boolean b4 = False;     //does not compile, False is not a keyword
        boolean b5 = new Boolean ("True");              // true
        Boolean b6 = new Boolean("tRuE");               // true
        Boolean b7 = new Boolean("fAlSe");              // false
        Boolean b8 = new Boolean("Jimmy Hendrix");      // false



        byte byt1 = 127;
        Byte byt2 = 127;
//        byte byt3 = 128;    //does not compile, value is treated as integer since it is out of scope
//        Byte byt4 = 128;    //does not compile, value is treated as integer since it is out of scope
//        byte byt5 = 34.0;   //does not compile without casting
        byte byt6 = (byte) 34.0;
//        byte byt7 = 34L;    //does not compile without casting
        byte byt8 = (byte) 34L;
        Byte byt9 = (byte) 34L;
//        Byte byt10 = (Byte) 34L;    //does not compile
//        Byte byt11 = Byte.MAX_VALUE + 1;            //does not compile, value is treated as integer since it is out of scope
//        Byte byte12 = (byte) Byte.MAX_VALUE + 1;    //does not compile, value is treated as integer since it is out of scope
        Byte byte13 = (byte) 128;       //value is out of scope, but is nonetheless transformed to the corresponding value in the other side of scope



        short s1 = 88;
        Short s2 = 88;
//        short s3 = 88.2;    //does not compile, double has to be casted
//        Short s4 = 88.2;    //does not compile, double has to be casted
        short s5 = (short) 88.2;
//        Short s6 = (Short) 88.2;    //does not compile, wrapper can not be used for casting
        Short s7 = (short) 88.2;
        short s8 = (short) (int) (float) 88.2;      //output: 88
        short s9 = (short) (byte) (float) 129.2;    //output: -127, due to the (byte) cast



        int i1 = 24;
        Integer i2 = 24;
//        int i3 = 24.7;      //does not compile, value is double
//        Integer i4 = 24.7;  //does not compile, value is double
        int i5 = (int) 24.7;
//        Integer i6 = (Integer) 24.7;    //does not compile, wrapper can not be used for casting
        Integer i7 = (int) 24.7;
//        Integer i8 = (int) 24.7L;   //does not compile



        long l1 = 772;
//        long l2 = 772.9;            //does not compile
        long l3 = (long) 772.9;
//        Long l4 = 772.9;            //does not compile
//        Long l5 = (Long) 772.9;     //does not compile
        Long l6 = (long) 772.9;
//        long l7 = (Long) 772.9;     //does not compile, wrapper can not be used for casting
        long l8 = Long.MAX_VALUE + 1;
        Long l9 = Long.MAX_VALUE + 1;
        long l10 = Long.MIN_VALUE - 1;



//        float f1 = 200d;          //does not compile, double value has to be casted to float
        float f2 = (float) 200d;
//        float f3 = 200.7;         //does not compile, default type of decimal value is double
        float f4 = (float) 200.7;
//        Float f5 = (Float) 200.7; //does not compile, wrapper can not be used for casting
//        Float f6 = 200L;        //does not compile, long value has to be casted to float
        Float f7 = (float) 200L;


        double d1 = 10;
//        Double d2 = 10;           //does not compile, value is integer
//        Double d3 = (Double) 10;  //does not compile, wrapper can not be used for casting
        Double d4 = (double) 10;
        double d5 = 500l;
        double d6 = 300F;
        Double d7 = (double) (byte) 2.0;





    }


}
