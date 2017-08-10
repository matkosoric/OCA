package edu.matkosoric.strings.comparing3;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Anaconda {

    public static void main(String[] args) {

        String anna = "Anaconda";
        String cindy = "Anaconda";
        System.out.println(anna.equals(cindy));
        System.out.println(anna == cindy);

        String ellen = new String("Anaconda");
        String marry = new String ("Anaconda");
        System.out.println(ellen.equals(marry));            // equals() compares values
        System.out.println(ellen == marry);                 // == compares object identity


        int length1 = 5;
        int length2 = 5;
//        System.out.println(length1.equals(length2));        // does not compile, primitives do not have equals()
        System.out.println("length: " + (length1 == length2));


        Integer length3 = 6;
        Integer length4 = 6;
        System.out.println(length3.equals(length4));
        System.out.println(length3 == length4);


        Integer lenght5 = 9;
        float length6 = 9.0f;
        System.out.println(lenght5.equals(length6));
        System.out.println(lenght5 == length6);


        Integer lenght7 = new Integer(13);
        Integer length8 = new Integer(13);
        System.out.println(lenght7.equals(length8));
        System.out.println(lenght7 == length8);

    }

}
