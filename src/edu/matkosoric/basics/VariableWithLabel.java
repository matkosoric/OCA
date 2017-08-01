package edu.matkosoric.basics;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class VariableWithLabel {

    public static void main(String[] args) {

        // the label can not be used in the same line with a variable declaration

//        THEBEGINING: int i = 0;         // does not compile


        SECONDBEGINING:
        {
            for (int i = 0; i < 10; i++) {
                System.out.println("i: " + i);
                if (i == 5) break SECONDBEGINING;
            }
        }


        int k = 0;
        THIRDBEGINING:
        {

            INNERLABEL:
//            System.out.println("third beginning");       // if left uncommented, this line will produce compile-time error
                                                           // since it has to be located right before the loop
            do {
                k++;
                System.out.println("k: " + k);
                if (k == 5) break THIRDBEGINING;
                if (k == 3) {
                    System.out.println("inner");
                    continue INNERLABEL;
                }
                System.out.println("skiped over in third iteration");
            } while (k < 30);


        }


        THEEND:
        System.out.println("THE END");

    }
}
