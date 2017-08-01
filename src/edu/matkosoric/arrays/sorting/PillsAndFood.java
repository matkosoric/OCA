package edu.matkosoric.arrays.sorting;

import java.util.Arrays;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class PillsAndFood {

    public static void main(String[] args) {

        // Arrays.sort() method can be called on various arrays with various types such as
        // byte, char, double, float, integer, long, object, and short, with an optional
        // delimiting range for sorting (from some index to some other index)

        int [] timeForBluePills = new int[3];
        timeForBluePills[0] = 23;
        timeForBluePills[1] = 7;
        timeForBluePills[2] = 15;
        Arrays.sort(timeForBluePills);
        for (int element : timeForBluePills)
            System.out.println(element);

        short [] timeForRedPills = {8, 11, 14, 17, 20, 23, 2, 5};
        Arrays.sort(timeForRedPills);
        for (short element : timeForRedPills)
            System.out.println(element);


        // however, Arrays.sort does not work with multidimensional arrays
        float [][] weeklyMealSchedule ={
                {7.00F, 12.00F, 18.00F},
                {7.00F, 12.00F, 18.00F},
                {8.00F, 13.00F, 17.00F},
                {7.00F, 12.00F, 18.00F},
                {7.00F, 12.00F, 18.00F},
                {8.00F, 13.00F, 17.00F},
                {7.00F, 12.00F, 18.00F}};
//        Arrays.sort(weeklyMealSchedule);    // compiles, but throws a run-time ClassCastException

    }

}
