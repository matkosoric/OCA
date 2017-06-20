package edu.matkosoric.methods.parameter.types;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class ParameterTypes {


     public static void main(String[] args) {

        // simple initial method call
        printingThreeStarTrekMovies1("The Wrath of Khan", "The Search for Spock", "The Voyage Home");

        // similar method call with variable argument list
        printingThreeStarTrekMovies2("The Wrath of Khan", "The Search for Spock", "The Voyage Home");
        printingThreeStarTrekMovies2("The Wrath of Khan", "The Search for Spock", "The Voyage Home", "The Final Frontier");

        // does not compile, each parameter type must be defined with a type in a method
//        printingThreeStarTrekMovies3("The Wrath of Khan", "The Search for Spock", "The Voyage Home");

        // does not compile, variable arguments can be only at the end of a parameter list
//        printingThreeStarTrekMovies4 ("The Wrath of Khan", "The Search for Spock", "The Voyage Home", "The Final Frontier");

         // this is valid method, since variable arguments are located at the end of a parameter list in a method
         printingThreeStarTrekMovies5 ("The Wrath of Khan", "The Search for Spock", "The Voyage Home", "The Final Frontier");

     }




    private static void printingThreeStarTrekMovies1(String movie1, String movie2, String movie3) {
        System.out.println("FIRST METHOD:");
        System.out.println(movie1);
        System.out.println(movie2);
        System.out.println(movie3 + "\n");
    }

    private static void printingThreeStarTrekMovies2(String ... starTrekMovies) {
        System.out.println("SECOND METHOD: ");
        for (String movie : starTrekMovies)
            System.out.println(movie);
    }

    // parameter type must be stated for each parameter
    // it is not permitted to use syntax similar to the previous example with variable arguments
/*    private static void printingThreeStarTrekMovies3(String movie1, movie2, movie3) {
        System.out.println("THIRD METHOD: ");
        System.out.println(movie1);
        System.out.println(movie2);
        System.out.println(movie3);
    }*/

        // does not compile
//    private static void printingThreeStarTrekMovies4(String ... starTrekMovies, String additionalMovie) {
//    }

    private static void printingThreeStarTrekMovies5(String singleMovie, String ... starTrekMovies) {
        System.out.println("FIFTH METHOD: ");
        System.out.println(singleMovie);
        for (String movie : starTrekMovies)
            System.out.println(movie);
    }

}
