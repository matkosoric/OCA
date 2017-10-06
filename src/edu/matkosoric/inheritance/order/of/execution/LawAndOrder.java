package edu.matkosoric.inheritance.order.of.execution;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class LawAndOrder {

    // demo of execution flow

    public static void main(String[] args) {

        Trial trial = new Trial();

    }

}

class Investigation {

    static {
        System.out.println("...static... from Investigation");
    }

    {
        System.out.println("...instance initialisation... from Investigation");
    }

    Investigation() {
        System.out.println("constructor from Investigation");
    }

}



class Trial extends Investigation {

    static {
        System.out.println("...static... from Trial");
    }

    {
        System.out.println("...instance initialisation... from Trial");
    }

    Trial() {
        System.out.println("constructor from Trial");
    }

}