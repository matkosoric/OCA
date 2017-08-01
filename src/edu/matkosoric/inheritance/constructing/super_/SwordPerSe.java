package edu.matkosoric.inheritance.constructing.super_;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public abstract class SwordPerSe {

    protected String swordName;

    // constructor
    SwordPerSe (String s) {
        swordName = s;
    }

    // getter
    public abstract String getSwordName();

}
