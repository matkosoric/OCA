package edu.matkosoric.flowcontrol.if_.braces;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class Example1 {

    public static void main(String[] args) {

        // without the brackets, the else block belongs to the nearest if, no matter the indentation

        if (4<6)
            if (true == false)
                if (9 == 4) System.out.println("third level");
            else System.out.println("1. Michal Jackson");
        else System.out.println("2. Billie Jean");          // this is alternative to the (true == false) part


        // the program flow can be altered with braces
        if (4<6)
            if (true == false) {
                if (9 == 4) System.out.println("third level");      // this IF now does not have a matching else part
            }
            else System.out.println("3. Michael Jackson");       // here, this is alternative to the (true == false) part
        else System.out.println("4. Billie Jean");

    }

}
