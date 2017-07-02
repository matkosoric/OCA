package edu.matkosoric.flowcontrol.falling.down;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */


public class FallingDown {

    public static void main(String[] args) {

        // example of falling through a switch statement
        // all cases will be processed, since there is no break statement
        String weaponOfChoice = "Katana Sword";

        // without break statements
        System.out.println("\tFirst choice: ");
        switch (weaponOfChoice) {
            case "Katana Sword":
                System.out.println("Katana Sword");
            case "A Claw Hammer":
                System.out.println("A Claw Hammer");
            case "A Baseball Bat":
                System.out.println("A Baseball Bat");
            case "Chainsaw":
                System.out.println("Chainsaw");
        }

        // with break statements
        System.out.println("\n\tSecond choice: ");
        switch (weaponOfChoice) {
            case "Katana Sword":
                System.out.println("Katana Sword"); break;
            case "A Claw Hammer":
                System.out.println("A Claw Hammer"); break;
            case "A Baseball Bat":
                System.out.println("A Baseball Bat"); break;
            case "Chainsaw":
                System.out.println("Chainsaw"); break;
                }

    }
}
