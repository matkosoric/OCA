package edu.matkosoric.arrays.declaration;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import java.util.Objects;

public class Declaration {

    public static void main(String[] args) {

//        int [6] intArray1 = new int[];       // does not compile, array size can not be on the left side of declaration
        int [ ] intArray = new int[6];

        Object recentYearsObj = new int[]{2015, 2016, 2017};
//        Object [] recentYearsInt = new int [3];             // does not compile

    }

}
