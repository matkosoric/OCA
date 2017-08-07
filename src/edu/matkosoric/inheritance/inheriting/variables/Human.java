package edu.matkosoric.inheritance.inheriting.variables;
/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Human extends Monkey{

    boolean manners = true;
    static int iq = 100;


    public static void main(String[] args) {

        Human jerry = new Human();
        System.out.println(jerry.manners);
        System.out.println(jerry.iq);

        Monkey larry = new Monkey();
        System.out.println(larry.manners);
        System.out.println(larry.iq);

        System.out.println(new Human().manners + " : " + new Human().iq);
        System.out.println(new Monkey().manners + " : " + new Monkey().iq);

    }
}
