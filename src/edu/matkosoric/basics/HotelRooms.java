package edu.matkosoric.basics;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class HotelRooms {

    // demonstration of System.arraycopy
    // old values are overwritten, not shifted.
    // position index is zero based.

    public static void main(String[] args) {

        int [] reservedRooms = {5,6,7,8};
        int [] alternativeRooms = {0, 0, 0, 0, 0, 0, 0};
        System.arraycopy(reservedRooms, 0, alternativeRooms,5,2);
        for (int k : alternativeRooms) System.out.println(k);

        System.out.println("\n");
        // arraycopy can be used with identical source and destination array
        System.arraycopy(reservedRooms, 1, reservedRooms, 3, 1);
        for (int k : reservedRooms) System.out.println(k);

    }
}
