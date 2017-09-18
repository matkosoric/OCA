package edu.matkosoric.strings.chaining;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Godfather {

    // substring() method does not change StringBuilder object like other methods.

    public static void main(String[] args) {

        StringBuilder offer = new StringBuilder ("You can try ask politely for the role, and see how it goes.");

        offer.insert(0, "I'm gonna ").append("an offer ").append("he can't refuse.").delete(10,69)
                .insert(10, "make him ").insert(0, "SUPERMAN: ").substring(10);

        System.out.println(offer);
        System.out.println(offer.substring(10));        // this will print expected result,
        System.out.println(offer);                      // but original StringBuilder object remains the same

    }
}
