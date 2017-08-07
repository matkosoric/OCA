package edu.matkosoric.flowcontrol.continue_;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class MissingLoop {

    // continue statement can not be outside a loop or switch statement

    public static void main(String[] args) {

        int terminatorSequel = 1;
        int alienSequel = 1;

        while (terminatorSequel < 3) {
            System.out.println("Terminator " + terminatorSequel + " - good movie");
            terminatorSequel++;
        }

//        break;      // does not compile

        do {
            if (alienSequel == 2) continue;         // valid continue
            if (alienSequel == 4) break;            // valid break
            System.out.println("Alien " + alienSequel + " - good movie.");
        } while (alienSequel++ < 5);


        String [] backToTheFuture = new String[] {"BTTF 1", "BTTF 2", "BTTF 2"};
        for (String sequel : backToTheFuture)
            if (sequel == "BTTF 1") {
            System.out.println("First BTTF is fhe best one.");
            break;
        }

//        break;      // does not compile

    }
}
