package edu.matkosoric.inheritance.interface_.keywords;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public interface NotASingleLineCompiled {

    // volatile, transient and synchronized keywords can not be used in the interface

//    volatile void method1();                     // does not compile
//    transient void method2();                    // does not compile
//    synchronized void method3();                 // does not compile

//    volatile default void method4() {}          // does not compile
//    transient default void method5() {}         // does not compile
//    synchronized default void method6() {}      // does not compile

//    volatile int identifier1 = 0;           // does not compile
//    transient int identifier2 = 0;          // does not compile
//    synchronized int identifier3 = 0;       // does not compile

}
