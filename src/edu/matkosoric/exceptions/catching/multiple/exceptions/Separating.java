package edu.matkosoric.exceptions.catching.multiple.exceptions;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Separating {

    public static void main(String[] args) {

        // valid catch
        try {
            throw new ArrayIndexOutOfBoundsException ();
        } catch ( ArithmeticException | ArrayStoreException | ClassCastException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception 1 cached!");
        }



        // invalid catch
        // Exception class is a parent class to the all subsequent classes of exceptions

//        try {
//            throw new ArrayIndexOutOfBoundsException ();
//        } catch (Exception | ArithmeticException | ArrayStoreException | ClassCastException | ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception 1 cached!");
//        }



        // invalid catch
        // catch condition can have only one variable that gets assigned to any of the encountered exceptions,
        // not one variable for each of the mentioned Exception types

//        try {
//            throw new ArrayIndexOutOfBoundsException ();
//        } catch (ArithmeticException e1 | ArrayStoreException e2 | ClassCastException e3| ArrayIndexOutOfBoundsException e4) {
//            System.out.println("Exception cached!");
//        }


        // invalid catch
        // in ma multi-catch statement, exceptions have to be ordered from most specific to the most general.
        // otherwise, reversed order would made specific catch blocks unreachable, ad therefore redundant.

        try{
            throw new ClassNotFoundException();
        } catch (Exception e) {
            System.out.println("Exception catched!");
//        } catch (ClassNotFoundException e2) {                 // does not compile
//            System.out.println("Exception catched!");
        }

        // this will compile with reversed order of catch blocks
        try{
            throw new ClassNotFoundException();
        } catch (ClassNotFoundException e2) {
            System.out.println("Exception catched!");
        } catch (Exception e) {
            System.out.println("Exception catched!");
        }
    }


}
