package edu.matkosoric.strings.copyof;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class VulcanHello {

    // demo of String.copyValueOf() method

    public static void main(String[] args) {

        char [] helloChar = new char[] {'l', 'i', 'v', 'e', ' ', 'l', 'o', 'n', 'g', ' ', 'a', 'n', 'd', ' ', 'p', 'r', 'o', 's','p', 'e', 'r'};

        String helloNew1 = String.copyValueOf(helloChar);
//        String helloNew2 = String.copyValueOf(helloChar, 4);    // does not compile
        String helloNew3 = String.copyValueOf(helloChar, 5, 4);
//        String helloNew4 = String.copyValueOf(helloNew1, 5 ,4);     // does not compile
        String helloNew5 = String.copyValueOf(helloNew1.toCharArray(), 5, 4);

        System.out.println(helloNew1);
        System.out.println(helloNew3);
        System.out.println(helloNew5);

    }

}
