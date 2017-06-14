package edu.matkosoric.exceptions.implicitlyfinal;

/**
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class implicitlyFinal {

    public static void main(String[] args) {

        // exception variable is implicitly final and therefore a constant that can not be given another value
        try {
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("Exception catched!");
//            e = new ArrayIndexOutOfBoundsException();       // does not compile, e is constant
        }


        // variable name for the exception can be reused when is goes out of scope
        try {

            throw new ArithmeticException();

        } catch (NullPointerException e1) {
            System.out.println("Exception e1 catched!");        // regular exception
        } catch (SecurityException e2) {
            System.out.println("Exception e2 catched!");
        } catch (NumberFormatException e3) {
            System.out.println("Exception e3 catched!");
//            e2 = new IndexOutOfBoundsException();           // does not compile, because e2 is out of scope,
                                                              // not because it is implicitly final
        } catch (IndexOutOfBoundsException e4) {
            System.out.println("First e4 catched!");
        } catch (ArithmeticException e4) {                    // the same variable name can be reused in some
                                                              // other catch block when first declaration goes out of scope
            System.out.println("Second e4 exception!");
        }

    }
}
