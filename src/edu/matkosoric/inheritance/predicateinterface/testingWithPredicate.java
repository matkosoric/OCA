package edu.matkosoric.inheritance.predicateinterface;

import java.util.function.Predicate;

/**
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class testingWithPredicate {

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
        System.out.println("Can a 10 year old person vode? " + votingAge.test(10));
        System.out.println("Can a 56 year old person vode? " + votingAge.test(56));

        System.out.println("If you are 10 years old, can you vote while alcoholised? " + drinkingAge.and(votingAge).test(10));
        System.out.println("If you are 19 years old, can you vote while alcoholised? " + drinkingAge.and(votingAge).test(19));
        System.out.println("If you are 56 years old, can you vote while alcoholised? " + drinkingAge.and(votingAge).test(56));


        // functions with predicates
        watchingMTV("WMKP", (k) -> (k.equals("MTV")));
        watchingMTV("MTV", (k) -> (k.equals("MTV")));



        // filtering lists with predicate





    }


    static void watchingMTV(String channel, Predicate<String> predicate) {
        if (predicate.test(channel)) {
            System.out.println("Watching MTV");
        } else {
            System.out.println("Not watching MTV");
        }
    }


}
