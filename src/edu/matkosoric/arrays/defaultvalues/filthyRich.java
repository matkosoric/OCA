package edu.matkosoric.arrays.defaultvalues;

/**
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class filthyRich {

    public static void main(String[] args) {

        // array elements are initialised to their default value
        // they are behaving like static or like instance variables, not like local variables
        // that have to be explicitly initialised.

        // EXAMPLE NO.1.
        int [] myBankAccounts = new int[5];
        for (int particularBankAccountState : myBankAccounts)
            System.out.println(particularBankAccountState);

        // on the other hand, int variable outside the array has to be initialised before usage.
        int age;
//        System.out.println(age);      // does not compile


        // EXAMPLE NO.2.
        // I have four pockets, but they are all empty
        boolean[] cashInMyPockets = new boolean[4];
        for (boolean cashInParticularPocket: cashInMyPockets)
            System.out.println(cashInParticularPocket);

        // ordinary local variable is not initialised, and can not be used.
        boolean youth;
//        System.out.println(youth);      // does not compile


        // EXAMPLE NO.3.
        // since String class is not a primitive, it's default value is set to null
        String [] localLoanSharks = new String[3];
        for (String particularShark : localLoanSharks)
            System.out.println(particularShark);

        // outside the array, uninitialised String object gives a compile time error
        String jimmy;
//        System.out.println(jimmy);      // does not compile

    }
}
