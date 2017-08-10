package edu.matkosoric.polymorphism.chaos;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import edu.matkosoric.exceptions.stack.overflow.Money;

class Moon {
    public int shine = 3;
    public int getShine () {
        System.out.println("Moon " + shine);
    return shine;
    }
}

public class Moonlight extends Moon{

    public int shine = 55;
    public int getShine () {
        System.out.println("Moonlight " + shine);
        return shine;
    }

    public static void main(String[] args) {

        Moon b = new Moonlight();
        System.out.println(b.shine + " " + b.getShine());

        Moonlight bb = (Moonlight) b;
        System.out.println(bb.shine + " " + bb.getShine());

    }

}
