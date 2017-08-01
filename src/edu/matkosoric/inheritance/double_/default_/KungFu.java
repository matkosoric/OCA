package edu.matkosoric.inheritance.double_.default_;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class KungFu implements headKick, groinKick{



}



interface headKick {

    default Pain strongKickToTheHead () {return new Pain(true);}
    default Pain weakKickToTheHead () {return new Pain(false);}

    //strongRandomKick is a default method in both interfaces
    default Pain strongRandomKick () {return new Pain(true);}
}



interface groinKick {

    default Pain strongKickToTheGroins () {return new Pain(true);}
    default Pain weakKickToTheGroings() {return new Pain(false);}

    //strongRandomKick is a default method in both interfaces which causes compile error in kungFu class
//    default Pain strongRandomKick () {return new Pain(true);}
}
