package edu.matkosoric.inheritance.constructing.super_;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Excalibur extends SwordPerSe {

//    Excalibur (String s){}        // does not compile

    // proper constructor with the super call
    Excalibur (String s){
        super(s);
    }

    @Override
    public String getSwordName() {
        return swordName;
    }
}
