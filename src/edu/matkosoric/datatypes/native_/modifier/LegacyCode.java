package edu.matkosoric.datatypes.native_.modifier;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class LegacyCode {

    // native modifier can be used only with methods, not with variables.
    // it indicates that method uses JNI (Java Native Interface) in order to
    // use libraries written in other languages (eg. c or c++), or enable
    // access from native code to java program.

//    native int a;       // does not compile

//    public native static int someRelativelyMisnamedMethod (boolean t) {    }       // does not compile, native method can not have a body

    public native int someSortOfWierdMethod (String killer, int milkshake);


}
