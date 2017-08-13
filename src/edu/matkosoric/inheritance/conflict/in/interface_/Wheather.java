package edu.matkosoric.inheritance.conflict.in.interface_;


/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Wheather implements Rain, Snow{

    // implementation of badWeather() method will not cause ambivalence in compilation,
    // despite the identical method name in both interfaces.
    @Override
    public void badWeather() {
        System.out.println("Implementation of badWeather().");
    }


    public static void main(String[] args) {

        Wheather a = new Wheather();
        a.badWeather();                 // valid without casting
        ((Rain)a).badWeather();         // redundant cast, but valid
        ((Snow)a).badWeather();         // redundant cast, but valid

        // code will compile if there is no reference to the 'amountOf' constant
        // which is ambivalent and has to be accessed through interface name.
//        System.out.println(a.amountOf);           // does not compile
        System.out.println(((Snow)a).amountOf);     // valid
        System.out.println(((Rain)a).amountOf);     // valid



    }

}
