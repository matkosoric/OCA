package edu.matkosoric.flowcontrol.stopped.by.exception;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class ProfitShare {

    // since 'companyProfit()' throws an error, right-side statement was not executed
    // and 'myShareInCompany' remains a zero value.

    public static void main(String[] args) {

        int myShareInCompany = 0;
        int myCashOutValue = 0;

        try {
            myCashOutValue = companyProfit() * (myShareInCompany = 50);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(myShareInCompany);
        }
    }

    public static int companyProfit() throws Exception {
        throw new Exception("Bankrupt!");
    }

}
