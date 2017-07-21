package edu.matkosoric.arrays.defining.arraylist;

import java.util.ArrayList;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */
public class VillagePeople {

    public static void main(String[] args) {

        // ArrayList do not accept primitive types,
        // but only their wrappers.
        // therefore, this will not compile
//        ArrayList<int> listIncorrect = new ArrayList<int>();    //does not compile

        // this part of code specifies Integer wrapper as a type of ArrayList elements
        // the list will accept only Integers
        ArrayList<Integer> villagePeoplePeakChardPosition = new ArrayList();
        villagePeoplePeakChardPosition.add(3);
        villagePeoplePeakChardPosition.add(8);
        villagePeoplePeakChardPosition.add(24);
        villagePeoplePeakChardPosition.add(32);
//        listFirst.add(true);  //does not compile
        System.out.println(villagePeoplePeakChardPosition);
        System.out.println(villagePeoplePeakChardPosition.get(1) instanceof Integer);

        // the following code does not declare explicitly
        // a data type for the elements of ArrayList.
        // They are implicitly turned to a wrapper class.
        // Also, there is no limitation for the acceptance of different types
        ArrayList villagePeopleSong = new ArrayList();
        villagePeopleSong.add('Y');
        villagePeopleSong.add('M');
        villagePeopleSong.add('C');
        villagePeopleSong.add('A');
        villagePeopleSong.add(true);   //this will compile
        System.out.println(villagePeopleSong);
        System.out.println(villagePeopleSong.get(1) instanceof Character);
        System.out.println(villagePeopleSong.get(4) instanceof Boolean);

    }

}
