package edu.matkosoric.basics;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class EventsOf1969 {

    // chained initialization in declaration is not permitted in java

    public static void main(String[] args) {

        // 1. valid
        int moonLanding1 = 1969;
        int easyRiderRelease1 = 1969;
        int woodstock1 = 1969;
        int jackKerouacDeath1 = 1969;

        // 2. invalid
//        int moonLanding2 = easyRiderRelease2 = woodstock2 = jackKerouacDeath2 = 1969; // does not compile

        // 3. valid
        int moonLanding3 = 0, easyRiderRelease3 = 0;
        int woodstock3 = moonLanding3 = easyRiderRelease3 = 1969;

        // 4. invalid
        int moonLanding4 = 0, easyRiderRelease4 = 0;
//        int woodstock4 = jackKerouacDeath4 = moonLanding4 = 1969;       // does not compile, jackKerouacDeath

        // 5. valid
        int moonLanding5, easyRiderRelease5, woodstock5, jackKerouacDeath5;
        moonLanding5 = easyRiderRelease5 = woodstock5 = jackKerouacDeath5 = 1969;

        // 6. valid
        // notice that only the last variable is initialised, while others are just declared.
        int moonLanding6, easyRiderRelease6, woodstock6, jackKerouacDeath6 = 1969;

        // 7. valid
        // only first variable is initialised
        int moonLanding7 = 1969, easyRiderRelease7, woodstock7, jackKerouacDeath7;

        // 8. invalid
//        int moonLanding8 = 1969 = easyRiderRelease8 = woodstock8 = jackKerouacDeath8;   // does not compile

    }
}
