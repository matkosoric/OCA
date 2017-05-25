package edu.matkosoric.flowcontrol.ifBraces;

/**
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class example1 {

    public static void main(String[] args) {

        // the else block belongs to the nearest if, no matter the indentation

        if (4<6)
            if (true == false)
                if (9 == 4) System.out.println("third level");
            else System.out.println("7");
        else System.out.println("Hi");          // this is alternative to the (true == false) part

    }

}
