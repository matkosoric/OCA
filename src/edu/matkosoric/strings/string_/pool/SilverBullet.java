package edu.matkosoric.strings.string_.pool;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class SilverBullet {

    public static void main(String[] args) {

        String sv1 = "Silver Bullet";
        String sv2 = "";
        sv2 = sv2 + "Silver Bullet";

        System.out.println(sv1.equals(sv2));    // equals() compares values
        System.out.println(sv1 == sv2);         // == operator checks memory location


    }

}
