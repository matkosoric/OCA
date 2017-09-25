package edu.matkosoric.operators.comparing.integers;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class IntegerComparation {

    //

    public static void main(String[] args) {

        Integer numberOfFingers_Hands = new Integer (9);
        Integer numberOfFingers_Feet = new Integer(9);
        System.out.println(numberOfFingers_Feet == numberOfFingers_Hands);     // outputs: false

        Integer numberOfHorns1 = 3;
        Integer numberOfHorns2 = 3;
        System.out.println(numberOfHorns1 == numberOfHorns2);       // output: true

        int bones_i = 206;
        double bones_d = 206.00;
        System.out.println(bones_i == bones_d);                     // output: true. int is up-casted to double

        Integer ears_i_w = 4;
        Double ears_d_w = 4.0;
        System.out.println(ears_i_w.equals(ears_d_w));              // false. different wrapper types always return false.
//        System.out.println(ears_i_w == ears_d_w);                   // does not compile, operator == can not be used on objects
    }

}
