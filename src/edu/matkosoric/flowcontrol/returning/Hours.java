package edu.matkosoric.flowcontrol.returning;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Hours {

    public static void main(String[] args) {

        System.out.println(getHour());

    }

    private static int getHour() {

        int [] hoursArray = new int[] {6, 14, 22};

        try {
            return hoursArray[9];
        } catch (Exception e) {
            return hoursArray[1];
        } finally {
            return hoursArray[2];
        }

        // this is unreachable statement
//        return 0;             // does not compile
    }

}
