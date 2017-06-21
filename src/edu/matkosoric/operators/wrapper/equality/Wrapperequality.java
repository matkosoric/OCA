package edu.matkosoric.operators.wrapper.equality;

/**
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class Wrapperequality {

    public static void main(String[] args) {

        Boolean pastHappiness = false;
        Boolean futureHappiness = false;
        System.out.println("Comparing Boolean: " + (pastHappiness == futureHappiness) + "\n");

        Byte fingers = 10;
        Byte toes = 10;
        System.out.println("Comparing Byte: " + (fingers == toes) + "\n");

        Short twoHoursInMinutes1 = 120;
        Short twoHoursInMinutes2 = 120;
        System.out.println("Comparing Short between -127 and +128: " + (twoHoursInMinutes1 == twoHoursInMinutes2));
        Short leaguesUnderTheSea1 = 20000;
        Short leaguesUnderTheSea2 = 20000;
        System.out.println("Comparing larger Short: " + (leaguesUnderTheSea1 == leaguesUnderTheSea2) + "\n");

        // Integer wrapper in the range of -127 to +128 can be compared
        Integer startedLiving = 48;
        Integer diedAt = 48;
        System.out.println("Comparing Integer between -127 and +128: " + (startedLiving == diedAt));

        // however, wrapped Integers outside that scope can not be reliably compared with == operator
        Integer fahrenheit1 = 451;
        Integer fahrenheit2 = 451;
        System.out.println("Comparing larger Integer: " + (fahrenheit1 == fahrenheit2) + "\n");

        // == operator can be used with Character wrapper also
        Character alpha1 = 'A';
        Character alpha2 = 'A';
        System.out.println("Comparing Character (ASCII value " + (int)alpha1 + "): "+ (alpha1 == alpha2));

        // Comparing wrappers outside the scope also returns false, despite the identical value
        Character copyright1 = '©';
        Character copyright2 = '©';
        System.out.println("Comparing Character (ASCII value " + (int)copyright1 + "): "+ (copyright1 == copyright2));
    }

}
