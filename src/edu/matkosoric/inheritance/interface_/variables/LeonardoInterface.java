package edu.matkosoric.inheritance.interface_.variables;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public interface LeonardoInterface {

    void drawing ();
    void sculpting ();
    void inventing ();
    void writing ();

    String inventionNo1 = "Parachute";
    String inventionNo2 = "Diving Suit";
    String inventionNo3 = "Tank";
    String inventionNo4 = "Helicopter";

    // interface variables and methods can not be private or protected
//    private writing2 ();        // does not compile
//    protected inventing2();     // does not compile

//    private String inventionNo5 = "iPhone";         // does not compile
//    protected String inventionNo6 = "Transistor";   // does not compile

}
