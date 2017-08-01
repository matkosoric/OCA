package edu.matkosoric.methods.final_.override;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class TravelingHome {

    //overloaded method can be final

    public static void main(String[] args) {

        travelHome ();
        travelHome("car");
        travelHome("car", "boat");
        travelHome(5);

    }

    // body is empty in order to make code more readable
    public static void travelHome(){}
    public static void travelHome (String meansOfTransportation) {}
    public static void travelHome (String meansOfTransportation1, String meansOfTransportation2) {}
//    public static final void travelHome ();     // does not compile, conflict with first method
    public static final void travelHome (int milesToTravel) {};

}