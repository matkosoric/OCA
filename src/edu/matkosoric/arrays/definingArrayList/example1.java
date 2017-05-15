package edu.matkosoric.arrays.definingArrayList;

import java.util.ArrayList;

/**
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */
public class example1 {

    public static void main(String[] args) {

        // ArrayList do not accept primitive types,
        // but only their wrappers.
        // therefore, this will not compile
//        ArrayList<int> listIncorrect = new ArrayList<int>();    //does not compile

        // this part of code specifies Integer wrapper as a type of ArrayList elements
        // the list will accept only Integers
        ArrayList<Integer> listFirst = new ArrayList();
        listFirst.add(41);
        listFirst.add(42);
        listFirst.add(43);
        listFirst.add(44);
//        listFirst.add(true);  //does not compile
        System.out.println(listFirst);
        System.out.println(listFirst.get(1) instanceof Integer);

        // the following code does not declare explicitly
        // a data type for the elements of ArrayList.
        // They are implicitly turned to a wrapper class.
        // Also, there is no limitation for the acceptance of different types
        ArrayList listSecond = new ArrayList();
        listSecond.add('a');
        listSecond.add('b');
        listSecond.add('c');
        listSecond.add('d');
        listSecond.add(true);   //this will compile
        System.out.println(listSecond);
        System.out.println(listSecond.get(1) instanceof Character);
        System.out.println(listSecond.get(4) instanceof Boolean);

    }

}
