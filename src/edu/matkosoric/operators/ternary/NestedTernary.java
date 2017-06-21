package edu.matkosoric.operators.ternary;

/**
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class NestedTernary {


    public static void main(String[] args) {

        // statement with ternary operator can be nested within other ternary statement without parentheses

        int result1 = false ? 3 : 5;
        System.out.println(result1);

        int result2 = false ? 3 : 0 < 9 ? 4 : 7;
        System.out.println(result2);

        int result3 = true ? 1 > 0 ? 6 : 13 : 0 < 9 ? 4 : 7;
        System.out.println(result3);

        int result4 = 1 < 8 ? 1 > 0 ? 6 : 13 : 0 < 9 ? 4 : 7;
        System.out.println(result4);

        //this  statement is almost completely unreadable
        int result5 = 1 < 8 ? 1 > 0 ? 7 <= 0 ? 912 : 28 : 19 == 75 ? 88 : 5 : 0 < 9 ? 2 >= 3 ? 45 : 91 : 4 == 2 ? 3 : 9;

        // however, it can be made more readable with parentheses
        int result6 = 1 < 8 ? (1 > 0 ? (7 <= 0 ? 912 : 28) : (19 == 75 ? 88 : 5)) : (0 < 9 ? (2 >= 3 ? 45 : 91) : (4 == 2 ? 3 : 9));
        System.out.println(result5);
        System.out.println(result6);

    }
}
