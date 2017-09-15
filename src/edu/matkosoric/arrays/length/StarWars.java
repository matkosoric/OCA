package edu.matkosoric.arrays.length;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import java.util.ArrayList;

public class StarWars {

    // size of the arraylist can be determined with the size() method

    public static void main(String[] args) {

        ArrayList <String> listOfStarWarsMovies = new ArrayList<>();
        listOfStarWarsMovies.add("The Phantom of Menace");
        listOfStarWarsMovies.add("Attack of the Clones");
        listOfStarWarsMovies.add("Revenge of the Sith");
        listOfStarWarsMovies.add("A New Hope");
        listOfStarWarsMovies.add("The Empire Strikes Back");
        listOfStarWarsMovies.add("Return of the Jedi");
        listOfStarWarsMovies.add("The Force Awakens");
        listOfStarWarsMovies.add("The Last Jedi");
        listOfStarWarsMovies.add("unknown");

        System.out.println(listOfStarWarsMovies.size());
//        System.out.println(listOfStarWarsMovies.length());      // does not compile, there is no length() method in any of the Collections classes
//
    }

}
