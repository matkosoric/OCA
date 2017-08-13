package edu.matkosoric.flowcontrol.switch_;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class PrePostSwitch {

    public static void main(String args[]){
        char a;

        // first loop, ++a
        for (a=0;a<5;a++){
            switch(++a){
                case 0: System.out.println("A1"); break;
                case 1: System.out.println("B1"); break;
                case 2: System.out.println("C1"); break;
                case 3: System.out.println("D1"); break;
                case 4: System.out.println("E1"); break;
            }
        }


        // second loop, a++
        for (a=0;a<5;a++){
            switch(a++){
                case 0: System.out.println("A2"); break;
                case 1: System.out.println("B2"); break;
                case 2: System.out.println("C2"); break;
                case 3: System.out.println("D2"); break;
                case 4: System.out.println("E2"); break;
            }
        }

    }
}

