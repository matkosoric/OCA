package edu.matkosoric.arrays.array.vs.arraylist;

import java.util.ArrayList;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class ArrayAndArraylistDifferences {

    public static void main(String[] args) {


        // 1. array is not resizeable, while arrayList is.
        // 2. array elements are added to the array using the index number, while arrayList uses the add() method.

        String [] arrayOfStephenKingsNovelsMadeIntoMovies = new String[6];
        arrayOfStephenKingsNovelsMadeIntoMovies[0] = "Misery";
        arrayOfStephenKingsNovelsMadeIntoMovies[1] = "The Shining";
        arrayOfStephenKingsNovelsMadeIntoMovies[2] = "The Shawshank Redemption";
        arrayOfStephenKingsNovelsMadeIntoMovies[3] = "It";
        arrayOfStephenKingsNovelsMadeIntoMovies[4] = "The Green Mile";
        arrayOfStephenKingsNovelsMadeIntoMovies[5] = "Children of the Corn";
//        arrayOfStephenKingsNovelsMadeIntoMovies[6] = "If left uncommented, this will throw an Exception!";

        // array object is fixed and its size can not be changed
        // this line will simply create new, empty String array, with null values
//        arrayOfStephenKingsNovelsMadeIntoMovies = new String[10];

        // elements of an arrarList are added with an add() method, which may include the position (index)
        ArrayList<String> arraylistOfLedZeppelinSongs = new ArrayList<>();
        arraylistOfLedZeppelinSongs.add("Immigrant Song");
        arraylistOfLedZeppelinSongs.add("Stairway to Heaven");
        arraylistOfLedZeppelinSongs.add("Black Dog");
        arraylistOfLedZeppelinSongs.add("Since I've Been Loving You");
        arraylistOfLedZeppelinSongs.add(0, "The Rain Song");
        arraylistOfLedZeppelinSongs.add(3, "Whole Lotta Love");
        arraylistOfLedZeppelinSongs.add(3, "Dazed and Confused");




        // 3. array has a length property, while arrayList has a size() method
        System.out.println("Array size is: " + arrayOfStephenKingsNovelsMadeIntoMovies.length);
        System.out.println("ArrayList size is: " + arraylistOfLedZeppelinSongs.size());




        // 4. array can hold both primitives ond object types.
        //    arrayList can hold only objects. Primitives added to the arrayList will be autoboxed with appropriate wrappers

//        ArrayList<int> zeppelinAlbumsRelease = new ArrayList<int>();    // does not compile
                ArrayList<Integer> zeppelinAlbumsRelease = new ArrayList<Integer>();
        zeppelinAlbumsRelease.add(1975);
        zeppelinAlbumsRelease.add(1969);
        zeppelinAlbumsRelease.add(1970);
        zeppelinAlbumsRelease.add(1971);
        System.out.println("Element in an ArrayList: " + zeppelinAlbumsRelease.get(2).getClass());

        // array can be made out of primitives
        int[] kingsMoviesRelease = new int[6];
        kingsMoviesRelease[0] = 1990;
        kingsMoviesRelease[1] = 1980;
        kingsMoviesRelease[2] = 1994;
        kingsMoviesRelease[3] = 2017;
        kingsMoviesRelease[4] = 1999;
        kingsMoviesRelease[5] = 1984;
        System.out.println("Element in an array: " + kingsMoviesRelease.getClass().getComponentType());




        // 5. arrayList can hold multiple data types, while array can be made of only one type
        ArrayList<Object> randomObjects = new ArrayList<>();
        randomObjects.add("some words");
        randomObjects.add(1);
        randomObjects.add(true);

        // array can hold only one type, defined in the declaration
        int[] interestingBookPageNumbers = new int[10];
        interestingBookPageNumbers[0] = 35;
        interestingBookPageNumbers[1] = 78;
        interestingBookPageNumbers[2] = 113;
//        interestingBookPageNumbers[3] = false;      // does not compile
        interestingBookPageNumbers[4] = (short)151;     // valid statement, implicitly casted to int
//        interestingBookPageNumbers[5] = 201.54F;      // does not compile
//        interestingBookPageNumbers[6] = (long)273;      //does not compile




        // 6. array can be multidimensional, while arrayList is always onedimensional
        String [][] chessFielsArray = new String[8][8];
//        ArrayList<String, String> chessFieldArrayList = new ArrayList<>();      // does not compile


    }

}
