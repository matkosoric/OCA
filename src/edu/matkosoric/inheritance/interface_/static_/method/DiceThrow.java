package edu.matkosoric.inheritance.interface_.static_.method;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public interface DiceThrow {

    // static methods in interface must have a body

    public static int diceRollingStatic() {
        return (int) ((Math.random()*6)+1);         // static method must have a body
    }

    default int diceRollingDefault () {
        return (int) ((Math.random()*6)+1);         // default method must have a body
    }

    int diceRollingInstance();                      // instance method can not have a body

}
