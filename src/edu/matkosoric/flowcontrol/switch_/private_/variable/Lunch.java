package edu.matkosoric.flowcontrol.switch_.private_.variable;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Lunch {

    // local variables can not have access modifiers

    final String fish = "Fish";             // default access modifier
    private String soup = "Soup";           // instance variable can have access modifier
    private static String grill = "Grill";  // static variables can have access modifier


    public static void main(String[] args) {

        String pizza = "Pizza";
        final String pie = "Pie";
//        private final String sandwich = "Sandwich";     // does not compile, local variable

    }

}
