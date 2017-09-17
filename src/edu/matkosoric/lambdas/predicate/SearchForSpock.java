package edu.matkosoric.lambdas.predicate;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchForSpock {

    // demo of lambda expressions with Predicate interface

    public static void main(String[] args) {

        // setting up a small data set
        List<String> enterpriseOfficers = new ArrayList<>();
        enterpriseOfficers.add("James T. Kirk");
        enterpriseOfficers.add("Leonard H. McCoy");
        enterpriseOfficers.add("Montgomery Scott");
        enterpriseOfficers.add("Uhura");
        enterpriseOfficers.add("Spock");
        enterpriseOfficers.add("Pavel Chekov");
        enterpriseOfficers.add("Hikaru Sulu");


        String result1 = searchFor(enterpriseOfficers, a -> a == "Spock");
        System.out.println("first search: " + result1);

        // simple change of the lambda expression is enough for different result
        String result2 = searchFor(enterpriseOfficers, a -> a == "Jean-Luc Picard");
        System.out.println("second search: " + result2);

        // lambda expression could be extracted out
        Predicate <String> predicateParameter = a -> a == "Data";
        String result3 = searchFor(enterpriseOfficers, predicateParameter);
        System.out.println("third search: " + result3);

    }

    private static String searchFor (List<String> officers, Predicate <String> missingOfficer ) {
        for (String officer : officers)
            if (missingOfficer.test(officer) == true) return officer;
        return "";
    }
}

