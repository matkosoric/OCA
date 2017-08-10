package edu.matkosoric.flowcontrol.switch_.initialisation;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Cigarettes {

    public static void main(String[] args) {

        int smokedToday = 20;
        int leftToSmoke;

        // without the break statement, this will compile
        switch (smokedToday) {
            case 2: leftToSmoke = 28;
            case 15: leftToSmoke = 15;
            default: leftToSmoke = 10;
        }
        System.out.println(leftToSmoke);


        // but, with the break statement, there will be a problem
        int smokedYesterday = 24;
        int leftUnsmoked;

        switch (smokedToday) {
            case 10: leftUnsmoked = 20;
            case 15: leftUnsmoked = 15;
            case 7: leftUnsmoked = 23; break;
            default: leftUnsmoked = 30;
            case 1:
        }
//        System.out.println(leftUnsmoked);       // does not compile

    }

}
