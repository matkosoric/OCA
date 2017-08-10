package edu.matkosoric.polymorphism.instanceof_;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class TV extends Radio{

    public static void main(String[] args) {

        Sound i1 = new Radio();
        Sound i2 = new TV();

        Radio r1 = new Radio();
        Radio r2 = new TV();

        TV tv = new TV();

        Golf golf = new Golf();


        System.out.println("first object: " + (i1 instanceof Sound));
        System.out.println("first object: " + (i1 instanceof Radio));
        System.out.println("first object: " + (i1 instanceof TV) + "\n");

        System.out.println("second object: " + (i2 instanceof Sound));
        System.out.println("second object: " + (i2 instanceof Radio));
        System.out.println("second object: " + (i2 instanceof TV) + "\n");

        System.out.println("third object: " + (r1 instanceof Sound));
        System.out.println("third object: " + (r1 instanceof Radio));
        System.out.println("third object: " + (r1 instanceof TV) + "\n");

        System.out.println("fourth object: " + (r2 instanceof Sound));
        System.out.println("fourth object: " + (r2 instanceof Radio));
        System.out.println("fourth object: " + (r2 instanceof TV) + "\n");

        System.out.println("fifth object: " + (tv instanceof Sound));
        System.out.println("fifth object: " + (tv instanceof Radio));
        System.out.println("fifth object: " + (tv instanceof TV) + "\n");

        System.out.println("sixth object: " + (golf instanceof Sound));
        System.out.println("sixth object: " + (golf instanceof Golf));
//        System.out.println("sixth object: " + (golf instanceof Radio));     // does not compile, unrelated classes
//        System.out.println("sixth object: " + (golf instanceof TV));        // does not compile, unrelated classes


    }

    public void makingSound () {
        System.out.println("...TV sound");
    }
}
