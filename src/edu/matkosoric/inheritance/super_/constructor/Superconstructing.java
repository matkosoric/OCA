package edu.matkosoric.inheritance.super_.constructor;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Superconstructing {

    public static void main(String[] args) {

        // Java automatically inserts super() constructor as a first statement in every constructor
        // super() creates instance of parent class
        bottomClass BC = new bottomClass();
    }
}

class topClass {
    //inserted super() constructor calls Object class,
    // since all object ultimately have a Object class as an ancestor
    public topClass() {System.out.println("TopClass constructor");}
}

class middleClass extends topClass {
    public middleClass() {
        super();        // here is an explicit statement that is inserted at compile-time
                        // in bottomClass and TopClass constructor
        System.out.println("middleClass constructor");}

//        constructor super() can be used only as a first statement in constructor
//        super();        //does not compile
}

class bottomClass extends middleClass {
    public bottomClass() {System.out.println("bottomClass constructor");}
}
