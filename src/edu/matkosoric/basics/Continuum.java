package edu.matkosoric.basics;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Continuum {

    // deducing from a variable will eventually end up at the positive side of its range

    public static void main(String[] args) {

        int position = 0;
        while (position-- < 10) {       // this will evaluate to false when value becomes smaller than -2147483648, integer's smaller value
            continue;
        }
        String result = position > 20 ? "Larger than 20" : "Smaller than 20";

        System.out.println(position);
        System.out.println(result);

    }

}
