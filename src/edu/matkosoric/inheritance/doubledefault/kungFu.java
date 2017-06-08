package edu.matkosoric.inheritance.doubledefault;

/**
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class kungFu implements headKick, groinKick{



}



interface headKick {

    default pain strongKickToTheHead () {return new pain(true);}
    default pain weakKickToTheHead () {return new pain(false);}

    //strongRandomKick is a default method in both interfaces
    default pain strongRandomKick () {return new pain(true);}
}



interface groinKick {

    default pain strongKickToTheGroins () {return new pain(true);}
    default pain weakKickToTheGroing () {return new pain (false);}

    //strongRandomKick is a default method in both interfaces which causes compile error in kungFu class
//    default pain strongRandomKick () {return new pain(true);}
}
