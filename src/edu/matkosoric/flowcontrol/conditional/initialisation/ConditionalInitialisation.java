package edu.matkosoric.flowcontrol.conditional.initialisation;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class ConditionalInitialisation {

    public static void main(String[] args) {

        // variable initialisation can not be performed within the IF condition

        int yearofPabloEscobarsBirth;
        int yearOfPabloEscobarsWedding;
        int yearOfPabloEscobarsDeath;

        if (true) yearofPabloEscobarsBirth = 1949;
        System.out.println(yearofPabloEscobarsBirth);


        if (false) yearOfPabloEscobarsWedding = 1976;
//        System.out.println(yearOfPabloEscobarsWedding);     //does not compile

        int k = 40;
        if (k<90) yearOfPabloEscobarsDeath = 1993;
//        System.out.println(yearOfPabloEscobarsDeath);       // does not compile
                                                              // despite the fact the condition will return true

    }

}



