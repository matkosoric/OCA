package edu.matkosoric.basics;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class PrimitiveNull {

    // primitive data types can not be assigned null,
    // regardless whether variables are static, instance, or local.

//    int primitiveType5 = null;              // does not compile
//    static byte primitiveType6 = null;      // does not compile

    String referenceType2 = null;

    public static void main(String[] args) {

        String referenceType1 = null;
//        int primitiveType1 = null;        // does not compile
//        byte primitiveType2 = null;       // does not compile
//        short primitiveType3 = null;      // does not compile
//        float primitiveType4 = null;       // does not compile

        // local variables have to be initialised before use
        int primitiveType5;
//        System.out.println(primitiveType5);     // does not compile, variable uninitialised


    }

}
