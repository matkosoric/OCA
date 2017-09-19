package edu.matkosoric.strings.stringbuilder.append;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Ace {

    // method append() is part of the StringBuilder class,
    // not String class

    public static void main(String[] args) {

        String kipper_string = "Smoke me a kipper";
//        kipper_string = kipper_string.append(", I'll be back for breakfast.");      // does not compile

        StringBuilder kipper_sb = new StringBuilder("Smoke me a kipper");
        kipper_sb.append(", I'll be back for breakfast.");
        System.out.println(kipper_sb);

        // append method() does not accept index parameter
//        kipper_sb.append(5, ", I'll be back for breakfast.");        // does not compile


        // following code will compile fine
        kipper_sb.append(true);
        System.out.println(kipper_sb);

        kipper_sb.append('y');
        System.out.println(kipper_sb);

        kipper_sb.append(new char[]{' ','r','e','d',' ', 'd', 'w', 'a', 'r', 'f'});
        System.out.println(kipper_sb);

        kipper_sb.append(new char[]{' ','r','e','d',' ', 'd', 'w', 'a', 'r', 'f'}, 4, 6);
        System.out.println(kipper_sb);


        // restart StringBuilder object for further method-torture
        kipper_sb.delete(17, 100);
        System.out.println("RESTART");


        CharSequence sequence = ", I'll be back for breakfast.";
        kipper_sb.append(sequence);
        System.out.println(kipper_sb);

        kipper_sb.append(sequence, 18, 28);
        System.out.println(kipper_sb);

        kipper_sb.append(33.722);
        System.out.println(kipper_sb);

        kipper_sb.append(33.722F);
        System.out.println(kipper_sb);

        kipper_sb.append(111);
        System.out.println(kipper_sb);

        kipper_sb.append(66666666L);
        System.out.println(kipper_sb);

        kipper_sb.append(new Aeroplane());
        System.out.println(kipper_sb);

    }

}
