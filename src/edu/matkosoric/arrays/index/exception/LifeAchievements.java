package edu.matkosoric.arrays.index.exception;

import java.util.ArrayList;
import java.util.List;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class LifeAchievements {

    public static void main(String[] args) {

        // arrayList has a zero-based index

        List<String> lifeAchievements = new ArrayList<>();
        lifeAchievements.add("being born");
        String firstAchievement = lifeAchievements.get(1);          // compiles, but throws a run-time IndexOutOfBoundsException
        System.out.println(firstAchievement);

    }
}
