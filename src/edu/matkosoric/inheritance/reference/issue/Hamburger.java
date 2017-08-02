package edu.matkosoric.inheritance.reference.issue;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

class Food {
    public static void eating() {
        System.out.println("Eating food in general.");
    }
}

class Meat extends Food {
    public static void eating() {
        System.out.println("Eating meat");
    }
    public static void cooking() {
        System.out.println("Cooking meat");
    }
}

public class Hamburger extends Meat{

    // reference type (at the beginning of variable declaration)
    // determines what methods can be called from the instance of declared object type

    public static void main(String[] args) {

        Food a = new Hamburger();
        Meat b = new Hamburger();
        Hamburger c = new Hamburger();

        a.eating();
        b.eating();
        c.eating();

//        a.cooking();      // does not compile, since Food as a reference type does not have a cooking() method
        b.cooking();
        c.cooking();        // instance of Hamburger class inherited the cooking() method from the Meat class.


        // 'a' object can be down-casted to proper Hamburger object,
        // but the reference of variable 'a' can not be changed
        ((Hamburger) a).cooking();          // valid statement

//        a = ((Hamburger) a);                // redundant casting, does not change reference type
//        a.cooking();                        // does not compile

        // new object can be created by down-casting 'a' variable, with properly set reference type
        Hamburger d = (Hamburger)a;
        d.cooking();
    }

    public static void eating() {
        System.out.println("Eating hamburger");
    }

}
