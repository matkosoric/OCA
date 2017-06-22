package edu.matkosoric.exceptions.finally_.block;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class Multiplefinallyblock {

    public static void main(String[] args) {

        try {
            throw new ArithmeticException ();
        } catch (ArithmeticException ariEx) {
            System.out.println("Exception cached!");
        } finally {
            System.out.println("First finally block");
        }
//        finally{                                              // does not compile
//            System.out.println("Second finally block");       // only one finally block is permitted for each try statement
//        }
    }

}
