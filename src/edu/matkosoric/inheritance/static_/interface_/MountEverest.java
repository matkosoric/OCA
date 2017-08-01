package edu.matkosoric.inheritance.static_.interface_;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class MountEverest {

    // non-nested interface can not be static.
    // also, every nested interface is automatically static.

    static interface Wind {    }             // implicitly static nested interface
    static class Snow {  }                   // static nested class
    class Cold { }                           // non-static nested class

}

interface Walking {                          // non-static non-nested interface
}

//static interface Running { }    // does not compile, non-nested interface can not be static
