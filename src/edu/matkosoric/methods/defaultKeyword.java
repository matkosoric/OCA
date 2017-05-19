package edu.matkosoric.methods;

/**
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class defaultKeyword {

//    default void classMethod1(){};      //does not compile, default keyword can not be used in regular class

}

interface interface1 {
    void interfaceMethod1 ();
    void interfaceMehtod2 ();
//    default void interfaceMethod3();     //does not compile, default method must have a body
    default void interfaceMethod4 (){System.out.println("Interface method no.4.");
    }
}

abstract class abClass1 {
    abstract void abstractMethod1 ();
    abstract void abstractMethod2 ();
//    default void abstractMethod3(){};       // does not compile, efault keyword can not be used in abstract class
}
