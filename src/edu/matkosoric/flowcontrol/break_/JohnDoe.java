package edu.matkosoric.flowcontrol.break_;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class JohnDoe {

    // unlabeled break statement can not occur outside switch, while, do-while, and for statement

    public static void main(String[] args) {

        byte a = 3;

        //labeled block
        JOHNDOE: {

            // labeled switch statement
            JANEDOE:
            switch (a) {
                case 1:     System.out.println(1);
                case 2:     System.out.println(2);
                case 3:     System.out.println(3);
                case 4:     break JOHNDOE;
                case 5:     break JANEDOE;
                case 6:     break;                  // unlabeled break
            }

//            break JOHNDOE;      // valid statement, commented because it makes following statements unreachable
//            break;              // does not compile

            // labeled while statement
            while (a < 7) {
                System.out.println(a);
                a++;
                break;              // valid break
            }

//            break;              // does not compile

            do {
                a++;
                System.out.println(a);
                break;              // valid break
            } while (a < 13);

//            break;              // does not compile

            for (int i = 0; i < 4; i++) {
                break;              // valid break
            }

//            break;              // does not compile

        }
    }
}
