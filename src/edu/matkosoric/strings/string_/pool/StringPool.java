package edu.matkosoric.strings.string_.pool;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class StringPool {

    public static void main(String[] args) {

        // string objects are located in the 'string pool',
        // unless they are created with the new keyword,
        // which means that all string variables with the same value
        // will refer to the same memory location.

        String monster1_Original = "Loch Ness Monster";
        String monster2 = "Loch Ness Monster";
        String monster3 = new String("Loch Ness Monster");

        // monsterOriginal and monster2 are referencing the same memory location,
        // while monster3 has its own, separate existence.
        System.out.println("monster1 = monster2 ? " + (monster1_Original == monster2));
        System.out.println("monster1 = monster3 ? " + (monster1_Original == monster3));

        // but given the identical value, their hash will be the same,
        // since String class overrides hashCode() to content comparison, not memory location
        System.out.println("\n" + "Monster1 hash: " + monster1_Original.hashCode());
        System.out.println("Monster2 hash: " + monster2.hashCode());
        System.out.println("Monster3 hash: " + monster3.hashCode());

        // changing the monster1_Original value will not affect the monster2 reference.
        // a new string will be added to the string pool, linked with monster1_original identifier
        monster1_Original = "Godzilla";
        System.out.println("\n" + monster2);

    }
}
