package edu.matkosoric.methods.wrapper.signature.temperature3;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Temperature3 {

    // methods with variable arguments are not automatically selected.
    // they can be invoked only with declared array

    public static void main(String[] args) {

        int temp1 = 40;
        Integer temp2 = 50;
        float temp3 = 60.0f;

        int [] temp4 = {40};
        Integer [] temp5 = {50};
        float [] temp6 = {60.0f};

        Temperature3 t3 = new Temperature3();

//        t3.printTemperature(temp1);       // does not compile
//        t3.printTemperature(temp2);       // does not compile
//        t3.printTemperature(temp3);       // does not compile
        t3.printTemperature(temp4);
        t3.printTemperature(temp5);
        t3.printTemperature(temp6);


    }

    private void printTemperature (int ... temp) {
        System.out.println("int var arg");
    }

    private void printTemperature (Integer ... temp) {
        System.out.println("Integer var arg");
    }

    private void printTemperature (float ... temp) {
        System.out.println("float var arg");
    }
}
