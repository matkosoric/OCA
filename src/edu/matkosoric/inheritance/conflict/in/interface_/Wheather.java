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
    public void badWeather() {    }

    // code will compile if there is no reference to the 'amountOf' constant
    // which is ambivalent and has to be accessed through interface name.
    public static void main(String[] args) {
//        System.out.println(amountOf);       // does not compile
    }

}
