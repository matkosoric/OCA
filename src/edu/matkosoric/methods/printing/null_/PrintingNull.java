package edu.matkosoric.methods.printing.null_;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class PrintingNull {

    static String empty3;

    public static void main(String[] args) {

        // this will compile and produce 'null' as an output
        String empty1 = null;
        System.out.println(empty1);

        // local variable is not initialised, resulting with compilation error
        String empty2;
//        System.out.println(empty2);     // does not compile

        // class variables are automatically initialised with null
        System.out.println(empty3);
    }

}
