package edu.matkosoric.inheritance.importing3.destination;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import static edu.matkosoric.inheritance.importing3.source.Paganism.celebratingSaturnalia;

public class Christianity{

    // only one static element was imported
    // non-static method is not available

    public static void main(String[] args) {

        celebratingSaturnalia();

//        otherCustoms();         // does not compile

    }
}
