package edu.matkosoric.exceptions.catching.error;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class NuclearPlant {

    // since Error classes do not extend java.lang.Exception,
    // they can not be caught with a try-catch statement.
    // this code will simply cause a main method to throw an InternalError.

    public static void main(String[] args) {

        try {
            startProducingEnergy();
        } catch (Exception e) {
            System.out.println("Can not produce energy.");
        }

    }

    public static void startProducingEnergy () throws Exception{
        throw new InternalError();
    }

}
