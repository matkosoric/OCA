package edu.matkosoric.methods.wrapper.signature.temperature2;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Temperature2 {

    // methods with variable arguments are not automatically selected.
    // they can be invoked only with declared array

    public static void main(String[] args) {

        int temp1 = 40;
        Integer temp2 = 50;
        float temp3 = 60.0f;

        Temperature2 t2 = new Temperature2();

//        t2.printTemperature2(temp1);         // does not compile, ambiguous reference
//        t2.printTemperature2(temp2);         // does not compile, ambiguous reference
        t2.printTemperature2(temp3);
    }

    private void printTemperature2 (int ... temp) {
        System.out.println("int var arg");
    }

    private void printTemperature2 (Integer ... temp) {
        System.out.println("Integer var arg");
    }

    private void printTemperature2 (float ... temp) {
        System.out.println("float var arg");
    }
}
