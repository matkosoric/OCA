package edu.matkosoric.inheritance;

/**
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

interface greetingInterface {
    void interfaceGreeting1 ();
    void interfaceGreeting2 ();
    default void interfaceGreeting3() {
        System.out.println("Hello!");
    }
}

abstract class abClassGreeting {

    abstract public void abstractGreeting4();
    // abstract class can not have a default method
//    default void abstractGreeting5() {System.out.println("What's up?");}; //does not compile

}

public class example1 extends abClassGreeting implements greetingInterface  {

    // Here is an implementation of methods listed in the
    // interfaceGreetings interface and abClassGreeting class.
    // Third method does not have to be implemented, since it is defined in the interface itself
    @Override
    public void interfaceGreeting1() { System.out.println("How are you?");
    }
    @Override
    public void interfaceGreeting2() { System.out.println("Hi!");
    }
    @Override
    public void abstractGreeting4() { System.out.println("Good day!");
    }

    public static void main(String[] args) {

        example1 a = new example1();
        a.interfaceGreeting1();
        a.interfaceGreeting2();
        a.interfaceGreeting3();
        a.abstractGreeting4();

    }
}

// Interface implementation is stated after the class inheritance.
// Reversed order will cause a compilation error.
//class example1Reversed implements greetingInterface extends abClassGreeting   {}   //does not compile

