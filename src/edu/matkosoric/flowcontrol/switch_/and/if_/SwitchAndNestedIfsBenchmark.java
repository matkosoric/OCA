package edu.matkosoric.flowcontrol.switch_.and.if_;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class SwitchAndNestedIfsBenchmark {

    // with small number of execution options, switch and nested if's have identical time performance.
    // in the case of large number of possible executions, switch should be quicker.

    public static void main(String[] args) {

        int a = 30;

        long startTime = System.currentTimeMillis();
        switchStatement(a);
        long endTime = System.currentTimeMillis();
        System.out.println("SWITCH-TIME: " + (endTime-startTime));


        try {
            Thread.sleep(1000);

        } catch (Exception e) {

        }

        startTime = System.currentTimeMillis();
        nestedIfStatements(a);
        endTime = System.currentTimeMillis();
        System.out.println("Nested if's: " + (startTime-endTime));

    }


    static void nestedIfStatements(int a) {

        if (a == 1) ;
        else if (a == 2) ;
        else if (a == 3) ;
        else if (a == 4) ;
        else if (a == 5) ;
        else if (a == 6) ;
        else if (a == 7) ;
        else if (a == 8) ;
        else if (a == 9) ;
        else if (a == 10) ;
        else if (a == 11) ;
        else if (a == 12) ;
        else if (a == 13) ;
        else if (a == 14) ;
        else if (a == 15) ;
        else if (a == 16) ;
        else if (a == 17) ;
        else if (a == 18) ;
        else if (a == 19) ;
        else if (a == 20) ;
        else if (a == 21) ;
        else if (a == 22) ;
        else if (a == 23) ;
        else if (a == 23) ;
        else if (a == 24) ;
        else if (a == 25) ;
        else if (a == 26) ;
        else if (a == 27) ;
        else if (a == 28) ;
        else if (a == 29) ;
        else if (a == 30) System.out.println("nested if");
    }


    static void switchStatement(int a) {
        switch(a) {
            case 1: ;
            case 2: ;
            case 3: ;
            case 4: ;
            case 5: ;
            case 6: ;
            case 7: ;
            case 8: ;
            case 9: ;
            case 10: ;
            case 11: ;
            case 12: ;
            case 13: ;
            case 14: ;
            case 15: ;
            case 16: ;
            case 17: ;
            case 18: ;
            case 19: ;
            case 20: ;
            case 21: ;
            case 22: ;
            case 23: ;
            case 24: ;
            case 25: ;
            case 26: ;
            case 27: ;
            case 28: ;
            case 29: ;
            case 30:
                System.out.println("switch");
        }
    }

}
