package edu.matkosoric.methods.method.signature;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class MyDriver {

    public static void main(String[] args) {

        // return type is NOT part of the method signature.
        // therefore, similar methods with only difference in return type will
        // produce a compile-time error

        // proper method overload
        System.out.println(getMyDriversName());
        System.out.println(getMyDriversName("overloaded method with a string argument"));
        System.out.println(getMyDriversName(2.3));

        // wrong method overload
        // the only difference between these methods is the return type,
        // making them ambiguous
//        System.out.println(checkMyDriversName("Thelma and Louise"));
//        System.out.println(checkMyDriversName("Mad Max"));

    }



    public static String getMyDriversName() {
        return "Stuntman Mike";
    }

    public static String getMyDriversName(String stringArgument) {      // unused argument
        return "Dominic Toretto";
    }

    public static String getMyDriversName(double doubleArgument) {     // unused argument
        return "Travis Bickle";
    }


    // conflicting method overloads

//    private static boolean checkMyDriversName(String s) {
//        return true;
//    }
//
//    private static byte checkMyDriversName(String s) {
//        return (byte)1;
//    }

}
