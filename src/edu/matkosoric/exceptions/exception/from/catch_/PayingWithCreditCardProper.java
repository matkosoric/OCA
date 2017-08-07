package edu.matkosoric.exceptions.exception.from.catch_;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class PayingWithCreditCardProper {

    // catch block can have it's own try-catch statement

    public static void main(String[] args) {

        PayingWithCreditCard groceriesShopping = new PayingWithCreditCard();

        try {
            groceriesShopping.enterPIN();
        } catch (Exception e) {
            try {
                groceriesShopping.enterPIN();
            }catch (Exception e2) {                         // exception name have to be different than the exception of the enclosing catch
                System.out.println("Exception catched!");
            }
            groceriesShopping.checkAvailableAmount();

        } finally {
            try {
                groceriesShopping.enterPIN();
            }catch (Exception e2) {                         // exception name have to be different than the exception of the enclosing catch
                System.out.println("Exception catched!");
            }
            groceriesShopping.checkAvailableAmount();
        }
    }


    public void enterPIN () throws Exception {
        throw new Exception();
    }

    public void checkAvailableAmount() throws RuntimeException {
        throw  new RuntimeException();
    }
}
