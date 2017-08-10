package edu.matkosoric.basics;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class forName {

    // demo of Class.forName() method

    public static void main(String[] args) {

        try {
            System.out.println(Class.forName("java.lang.String"));
            System.out.println(Class.forName("edu.matkosoric.basics.HotelRooms"));
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

}
