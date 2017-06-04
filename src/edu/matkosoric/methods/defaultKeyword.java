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
    default void interfaceMethod4 (){System.out.println("Interface method no.4.");}


    // default methods, like all interface methods, can not be protected or private
//    protected default void interfaceMethod5 (){System.out.println("Interface method no.5.");}       //does not compile
//    private default void interfaceMethod6 (){System.out.println("Interface method no.6.");}         // does not compile

//    default method can not be static, final or abstract
//    static default void interfaceMethod7 (){System.out.println("Interface method no.7.");}        //does not compile
//    final default void interfaceMethod8 (){System.out.println("Interface method no.8.");}         //does not compile
//    abstract default void interfaceMethod9 (){System.out.println("Interface method no.9.");}      //does not compile


}

abstract class abClass1 {
    abstract void abstractMethod1 ();
    abstract void abstractMethod2 ();
//    default void abstractMethod3(){};       // does not compile, default keyword can not be used in abstract class
}
