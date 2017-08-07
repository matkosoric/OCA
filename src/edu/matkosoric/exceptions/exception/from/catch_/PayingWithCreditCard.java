package edu.matkosoric.exceptions.exception.from.catch_;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class PayingWithCreditCard {

    // calling method that throws checked exceptions
    // from catch or finally block
    // will cause a compile-time error.

    public static void main(String[] args) {

        PayingWithCreditCard groceriesShopping = new PayingWithCreditCard();

        try {
            groceriesShopping.enterPIN();
        } catch (Exception e) {
//            groceriesShopping.enterPIN();                   // does not compile
            groceriesShopping.checkAvailableAmount();

        } finally {
//            groceriesShopping.enterPIN();                   // does not compile
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
