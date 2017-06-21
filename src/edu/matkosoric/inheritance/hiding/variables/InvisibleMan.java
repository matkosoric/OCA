package edu.matkosoric.inheritance.hiding.variables;

/**
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class InvisibleMan extends InvisibilityPerSe {

    static int releaseYear1 = 1934;
    static String name1 = "Claude Rains";
    static int releaseYear2 = 1992;
    static String name2 = "Chevy Chase";
    static int releaseYear3 = 2000;
//    static String name3 = "Kevin Bacon";      // commenting out this line does not cause compile-time error
                                                // program will simply use the inherited value of name3 variable

    String summary1 = "1. Child summary: Ordinary person becomes invisible.";
    // missing summary2


    public static void main(String[] args) {

        // printing static variables from the parent class
        System.out.println(InvisibilityPerSe.name1);
        System.out.println(InvisibilityPerSe.releaseYear1);
        System.out.println(InvisibilityPerSe.name2);
        System.out.println(InvisibilityPerSe.releaseYear2);
        System.out.println(name3);
        System.out.println(InvisibilityPerSe.releaseYear3 + "\n");

        // reading static variables in this class
        System.out.println(name1);
        System.out.println(releaseYear1);
        System.out.println(name2);
        System.out.println(releaseYear2);
        System.out.println(name3);                  // this is the inherited value
        System.out.println(releaseYear3 + "\n");


        // reading instance variables from the parent class
        System.out.println(new InvisibilityPerSe().summary1);
        System.out.println(new InvisibilityPerSe().summary2);

        // reading instance variables from the child class
        System.out.println(new InvisibleMan().summary1);
        System.out.println(new InvisibleMan().summary2);        // this values is inherited from the parent class

    }
}
