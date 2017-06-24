package edu.matkosoric.exceptions.stack.overflow;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class Money {

    static long decentBankAccount = 0;
    static long greedyBankAccount = 0;

    public static void main(String[] args) {

        giveMeSomeMoney();

        giveMeMoreMoney();

    }

    // recursive method with an exit condition
    // method has to have a return statement or throw an exception in order to break its execution
    private static boolean giveMeSomeMoney() {
        decentBankAccount++;
        System.out.println(decentBankAccount);
        if (decentBankAccount > 5000) return true;
        giveMeSomeMoney();
        return false;
    }

    // recursive method without the exit condition
    private static void giveMeMoreMoney() {
        greedyBankAccount++;
        System.out.println(greedyBankAccount);
        giveMeMoreMoney();
    }
}
