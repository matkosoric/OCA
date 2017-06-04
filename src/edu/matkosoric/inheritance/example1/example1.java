package edu.matkosoric.inheritance.example1;

/**
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

// after class name, stating extended class has priority over implementing interface
// if the order is reversed, the code will not compile, for example
// class example2 implements greetingInterface extends abClass {
//    public void interfaceGreeting1(){}
//    public void interfaceGreeting2(){}
//}

public class example1 extends abClass implements greetingInterface  {

    // here is an implementation of interfaceGreetings
    // third method does not have to be implemented, since it is defined in the interface itself
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

interface greetingInterface {
    void interfaceGreeting1 ();
    void interfaceGreeting2 ();
    default void interfaceGreeting3() {
        System.out.println("Hello!");
    }

//    @Override                                             // does not compile
//    default boolean equals (Object obj){return true;}     // interface can not override methods from Object class
}

abstract class abClass {

    abstract public void abstractGreeting4();
    // abstract class can not have a default method
//    default void abstractGreeting5() {System.out.println("What's up?");}; //does not compile

}
