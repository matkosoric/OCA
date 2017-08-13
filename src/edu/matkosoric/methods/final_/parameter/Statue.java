package edu.matkosoric.methods.final_.parameter;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Statue {

    // final method parameter can not be changed

    public static void main(String[] args) {

        Statue a = new Statue();

        a.chipAway(4);

    }

    public void chipAway (final int numberOfChips) {
//        numberOfChips++;            // does not compile
    }

}
