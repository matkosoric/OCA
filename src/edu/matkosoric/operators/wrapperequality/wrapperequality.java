package edu.matkosoric.operators.wrapperequality;

/**
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class wrapperequality {

    public static void main(String[] args) {

        Boolean pastHappiness = false;
        Boolean futureHappiness = false;
        System.out.println(pastHappiness == futureHappiness);

        Byte fingers = 10;
        Byte toes = 10;
        System.out.println(fingers == toes);




        // NASTAVITI



        // Integer wrapper in the range of -127 to +128 can be compared
        Integer startedLiving = 48;
        Integer diedAt = 48;
        System.out.println(startedLiving == diedAt);

        // however, wrapped Integers outside that scope can not be reliably compared with == operator
        Integer earthAge = 6000;
        Integer universeAge = 6000;
        System.out.println(earthAge == universeAge);

    }

}
