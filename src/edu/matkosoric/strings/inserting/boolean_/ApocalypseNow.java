package edu.matkosoric.strings.inserting.boolean_;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class ApocalypseNow {

    // StringBuilder class has a insert method that receives boolean argument

    public static void main(String[] args) {

        StringBuilder opening = new StringBuilder ("Saigon... shit; I'm still only in Saigon");
        opening.insert(opening.lastIndexOf("Saigon"), true);                                            // weird but valid
        System.out.println(opening);        // output: Saigon... shit; I'm still only in trueSaigon

    }
}
