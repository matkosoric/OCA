package edu.matkosoric.inheritance.superconstructor;


public class superconstucting {

    public static void main(String[] args) {

        // Java automatically inserts super() constructor as a first statement in every constructor
        // super() creates instance of parent class
        bottomClass BC = new bottomClass();
    }
}

class topClass {
    //inserted super() constructor calls Object class,
    // since all object ultimately have a Object class as an ancestor
    public topClass() {System.out.println("topClass constructor");}
}

class middleClass extends topClass {
    public middleClass() {
        super();        // here is an explicit statement that is inserted at compile-time
                        // in bottomClass and topClass constructor
        System.out.println("middleClass constructor");}

//        constructor super() can be used only as a first statement in constructor
//        super();        //does not compile
}

class bottomClass extends middleClass {
    public bottomClass() {System.out.println("bottomClass constructor");}
}
