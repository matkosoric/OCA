package edu.matkosoric.basics;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Puppy {

    public static void main(String[] args) {

        Puppy rex = new Puppy();
        Dog nick = new Dog();

//        nick = rex; // does not compile, missing downcast

        nick = (Dog) rex;

    }
}

class Dog extends Puppy{ }
