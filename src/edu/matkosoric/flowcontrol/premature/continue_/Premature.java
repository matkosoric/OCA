package edu.matkosoric.flowcontrol.premature.continue_;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Premature {

    public static void main(String[] args) {

        // unconditional continue statement at the beginning of block makes subsequent statements redundant (that is, unreachable)
        int i = 0;
        do {
            continue;
//            i++;        // does not compile
                          // unreachable statement
        } while (i<10);


        // this will compile, although if condition always returns true
        do {
            if (1<2) continue;
            i++;
        } while (i<10);

    }

}
