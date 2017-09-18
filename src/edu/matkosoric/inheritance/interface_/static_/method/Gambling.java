package edu.matkosoric.inheritance.interface_.static_.method;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Gambling implements DiceThrow{

    public static void main(String[] args) {

        // for loop with ten iterations
        for (int i = 0; i<10; i++) {
            int a = DiceThrow.diceRollingStatic();        // static method
            System.out.println("static roll'n: " + a);
        }


        Gambling gambler = new Gambling();

        // for loop with ten iterations
        for (int i = 0; i<10; i++) {
            int a = gambler.diceRollingDefault();        // default method
            System.out.println("default roll'n: " + a);
        }

        // for loop with ten iterations
        for (int i = 0; i<10; i++) {
            int a = gambler.diceRollingInstance();        // instance method
            System.out.println("instance roll'n: " + a);
        }

    }

    // implementation
    @Override
    public int diceRollingInstance() {
        return (int) ((Math.random()*6)+1);
    }
}
