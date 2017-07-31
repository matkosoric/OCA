package edu.matkosoric.arrays.for_.loop;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Brexit {

    public static void main(String[] args) {


        // enhanced for loop can not be used to remove an element from the ArrayList

        String[] EUList = new String [] {
                "Austria", "Belgium", "Bulgaria", "Croatia", "Republic of Cyprus",
                "Czech Republic", "Denmark", "Estonia,", "Finland", "France",
                "Germany", "Greece", "Hungary", "Ireland", "Italy", "Latvia",
                "Lithuania", "Luxembourg", "Malta", "Netherlands", "Poland",
                "Portugal", "Romania", "Slovakia", "Slovenia", "Spain", "Sweden", "UK"};
        ArrayList<String> listOfEUCountryes = new ArrayList<>(Arrays.asList(EUList));


        // regular for loop
        System.out.println(listOfEUCountryes.size() + "  " + listOfEUCountryes);
        for (int i = 0; i < listOfEUCountryes.size(); i++) {
            if (listOfEUCountryes.get(i) == "UK") {
                listOfEUCountryes.remove(i);
                System.out.println("BREXIT !");
            }
        }
        System.out.println(listOfEUCountryes.size() + "  " + listOfEUCountryes);


        // restarting arraylist
        listOfEUCountryes = new ArrayList<>(Arrays.asList(EUList));

        // enhanced for loop - throws java.util.ConcurrentModificationException
//        for (String particularCountry : listOfEUCountries) {
//            if (particularCountry == "Denmark") listOfEUCountries.remove(particularCountry);
//        }
//        System.out.println(listOfEUCountries.size() + "  " + listOfEUCountries);


        // restarting arraylist
        listOfEUCountryes = new ArrayList<>(Arrays.asList(EUList));

        // iterator
        System.out.println("ITERATOR: ");
        System.out.println(listOfEUCountryes.size() + "  " + listOfEUCountryes);
        Iterator<String> iterator = listOfEUCountryes.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == "UK") {
                iterator.remove();
                System.out.println("BREXIT through the iterator.");
            }
        }
        System.out.println(listOfEUCountryes.size() + "  " + listOfEUCountryes);

    }

}
