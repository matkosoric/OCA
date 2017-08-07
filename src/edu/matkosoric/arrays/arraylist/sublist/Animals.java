package edu.matkosoric.arrays.arraylist.sublist;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import java.util.ArrayList;
import java.util.List;

public class Animals {

    // sublist() from arraylist demonstration

    public static void main(String[] args) {

        List wildAnimals = new ArrayList();
        wildAnimals.add("Lion");
        wildAnimals.add("Tiger");
        wildAnimals.add("Kangaroo");
        wildAnimals.add(1, "Whale");

        List domesticAnimals = new ArrayList();
        domesticAnimals.add("Cat");
        domesticAnimals.add("Dog");
        domesticAnimals.add(1, "Parrot");

        List animalsISaw = new ArrayList();
        animalsISaw.addAll(domesticAnimals);
        animalsISaw.add(wildAnimals.subList(1,1));

        System.out.println(animalsISaw);

    }
}
