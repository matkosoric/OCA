package edu.matkosoric.arrays;

import java.util.ArrayList;

/**
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */
public class example1 {

    public static void main(String[] args) {

        // without explicitly declaring the data type,
        // ArrayList will treat its elements as Object type.

        //this part of code declares Integer wrapper as a type of ArrayList elements
        ArrayList<Integer> listFirst = new ArrayList();
        listFirst.add(41);
        listFirst.add(42);
        listFirst.add(43);
        listFirst.add(44);
        System.out.println(listFirst);
        System.out.println(listFirst.get(1) instanceof Integer);
        System.out.println(listFirst.get(1) instanceof Object);

        // the following code does not declare a data type for the elements of ArrayList
        ArrayList listSecond = new ArrayList();
        listSecond.add(41);
        listSecond.add(42);
        listSecond.add(43);
        listSecond.add(44);
        System.out.println(listSecond);
        System.out.println(listSecond.get(1) instanceof Integer);
        System.out.println(listSecond.get(1) instanceof Object);

    }

}
