package edu.matkosoric.strings.string_.pool;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class StringPool {

    public static void main(String[] args) {

        // string objects are located in the 'string pool',
        // unless they are created with the new keyword,
        // which means that all string variables with the same value
        // will refer to the same memory location.

        String monsterOriginal = "Loch Ness Monster";
        String monster2 = "Loch Ness Monster";
        String monster3 = new String("Loch Ness Monster");

        // monsterOriginal and monster2 are referencing the same memory location,
        // while monster3 has its own, separate existence
        System.out.println(monsterOriginal == monster2);
        System.out.println(monsterOriginal == monster3);

        // setting the monsterOriginal value to null will not affect the monster2 reference
        monsterOriginal = null;
        System.out.println("\n" + monster2);

    }
}
