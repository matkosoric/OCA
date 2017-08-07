package edu.matkosoric.operators.instanceof_.operator;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class InstanceOf {

    public static void main(String[] args) {

        // left operand in a instanceof statement must be an object, but can not be a primitive
        byte b1 = 5;
//        System.out.println(b1 instanceof Byte);      // does not compile

        Byte b2 = 5;
        System.out.println(b2 instanceof Byte);


        // right operand in a instanceof statement must be a class name
        Byte b3 = 5;
//        System.out.println(b3 instanceof byte);         // does not compile


        // unrelated classes can not be compared with instanceof
        Integer i1 = 5;
//        System.out.println(i1 instanceof Byte);         // does not compile
        Byte b4 = 5;
//        System.out.println(b4 instanceof Integer);          // does not compile
        Byte b5 = 5;
//        System.out.println((Integer)b5 instanceof Integer);     // does not compile



    }

}
