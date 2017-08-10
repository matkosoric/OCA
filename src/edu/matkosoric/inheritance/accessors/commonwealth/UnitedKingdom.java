package edu.matkosoric.inheritance.accessors.commonwealth;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class UnitedKingdom {

    public String citizenship = "British citizen";          // available to every class, everywhere
    protected String currency = "Pound";                    // available to classes in the same package (both child and unrelated not), and to child classes in different packages
    String queen = "Elisabeth II";                          // available to classes in the same package (both child and unrelated)
    private String capitalCity = "London";                  // available only within UnitedKingdom class

}
