package edu.matkosoric.strings.commonmethods;

/**
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class commonMethods {

    public static void main(String[] args) {

        // this example will list common methods in String and StringBuilder class
        // and several methods easily mismatched with correct class
        String stringClassic = "Gandalf";
//        StringBuilder stringBuilder = "Frodo";      //does not compile, constructor is necessary
        StringBuilder stringBuilder = new StringBuilder("Frodo");



        // COMMON METHODS WITH SIMILAR BEHAVIOR

        // charAt
        System.out.println(stringClassic.charAt(1));
        System.out.println(stringBuilder.charAt(1));

        // codePointAt
        System.out.println(stringClassic.codePointAt(1));
        System.out.println(stringBuilder.codePointAt(1));

        // indexOf
        System.out.println(stringClassic.indexOf("d"));
        System.out.println(stringBuilder.indexOf("d"));

        // lastIndexOf
        System.out.println(stringClassic.lastIndexOf("d"));
        System.out.println(stringBuilder.lastIndexOf("d"));

        // replace
        System.out.println(stringClassic.replace('G', 'Y'));
        System.out.println(stringBuilder.replace(1,3,"555"));
        stringBuilder = new StringBuilder("Frodo");
        // since stringBuilder is mutable, value has to be turned back to
        // the original state in order that following examples work

        // subsequence
        System.out.println(stringClassic.subSequence(0,4));
        System.out.println(stringBuilder.subSequence(0,4));

        //substring
        System.out.println(stringClassic.substring(0,3));
        System.out.println(stringBuilder.substring(0,3));

        // length
        System.out.println(stringBuilder.length());
        System.out.println(stringClassic.length());






        // SPECIFIC METHODS

        // append
//        System.out.println(stringClassic.append(" the Grey"));
        System.out.println(stringBuilder.append(" Baggins"));

        // getBytes
        byte[] temp1 = stringClassic.getBytes();
        System.out.println("getBytes(): ");
        for (byte e : temp1) System.out.print(e + ", ");
        System.out.println();
//        System.out.println(stringBuilder.getBytes());

        // split
        String [] a = stringClassic.split("and");
        for (String e : a) System.out.println(e);
//        System.out.println(stringBuilder.split("and"));

        // startsWith
        System.out.println(stringClassic.startsWith("Gan"));
//        System.out.println(stringBuilder.startsWith("Fro"));

        // toLowerCase
        System.out.println(stringClassic.toLowerCase());
//        System.out.println(stringBuilder.toLowerCase());

        // toUperCase
        System.out.println(stringClassic.toUpperCase());
//        System.out.println(stringBuilder.toUpperCase());

    }
}
