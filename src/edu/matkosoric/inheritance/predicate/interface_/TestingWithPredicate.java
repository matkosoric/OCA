package edu.matkosoric.inheritance.predicate.interface_;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class TestingWithPredicate {

    public static void main(String[] args) {

        // declaring predicate with lambda expression
        Predicate <Integer> lessThan300 = (p) ->(p < 300);

        System.out.println(lessThan300.test(400));
        System.out.println(lessThan300.test(982634));
        System.out.println(lessThan300.test(3));
        System.out.println(lessThan300.test(300));
        System.out.println(lessThan300.test(299));


        // predicates can be chained to each other
        Predicate <Integer> drinkingAge = (age) -> (age > 20);
        System.out.println("Can a 10 year old person purchase alcohol? " + drinkingAge.test(10));
        System.out.println("Can a 56 year old person purchase alcohol? " + drinkingAge.test(56));

        Predicate <Integer> votingAge = (age) -> (age > 17);
        System.out.println("Can a 10 year old person vote? " + votingAge.test(10));
        System.out.println("Can a 56 year old person vote? " + votingAge.test(56));

        System.out.println("If you are 10 years old, can you vote while alcoholized? " + drinkingAge.and(votingAge).test(10));
        System.out.println("If you are 19 years old, can you vote while alcoholised? " + drinkingAge.and(votingAge).test(19));
        System.out.println("If you are 56 years old, can you vote while alcoholised? " + drinkingAge.and(votingAge).test(56));


        // functions with predicates
        watchingMTV("WMKP", (k) -> (k.equals("MTV")));
        watchingMTV("MTV", (k) -> (k.equals("MTV")));



        // filtering lists with predicate
        List<Double> bucketOfVariousNumbers = new ArrayList<>();
        bucketOfVariousNumbers.add(1.00000);
        bucketOfVariousNumbers.add(1.61803);
        bucketOfVariousNumbers.add(2.00000);
        bucketOfVariousNumbers.add(2.71828);
        bucketOfVariousNumbers.add(3.00000);
        bucketOfVariousNumbers.add(3.14159);
        bucketOfVariousNumbers.add(4.00000);
        bucketOfVariousNumbers.add(5.00000);
        bucketOfVariousNumbers.add(6.00000);
        bucketOfVariousNumbers.add(6.28318);
        bucketOfVariousNumbers.add(7.00000);
        List<Double> listOfMathematicalConstants =
                searchingForMathConstants (bucketOfVariousNumbers, (k) -> k/k.intValue() > 1);

        for (Double element: listOfMathematicalConstants)
            System.out.println(element);
    }

    // filtering method
    private static List<Double> searchingForMathConstants(List<Double> variousNumbers, Predicate<Double> predicate) {
        List<Double> resultList = new ArrayList<>();
        for (Double element : variousNumbers) {
            if (predicate.test(element))
                    resultList.add(element);
        }
        return resultList;
    }


    // method with predicate as a parameter
    static void watchingMTV(String channel, Predicate<String> predicate) {
        if (predicate.test(channel)) {
            System.out.println("Watching MTV");
        } else {
            System.out.println("Not watching MTV");
        }
    }


}
