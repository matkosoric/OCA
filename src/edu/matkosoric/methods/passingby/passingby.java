package edu.matkosoric.methods.passingby;

/**
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class passingby {

    public static void main(String[] args) {

        // this example uses StringBuilder since String class behaves untypically for classical objects in this case
        // the code illustrates difference between pass-by-reference and pass-by-value principle

        StringBuilder baseName = new StringBuilder("Lord of the Rings");

        defineFirstPart(baseName);
        System.out.println(baseName);
        defineSecondPart(baseName);
        System.out.println(baseName);
        defineThirdPart(baseName);
        System.out.println(baseName);


        int firstPart = 1;
        System.out.println("\nPrimitive types (like int) are passed to methods by value");
        System.out.println("and therefore unaffected by changes made to method paramteres");
        System.out.println("First: " + firstPart);
        calculateSecondPart(firstPart);
        System.out.println("Second: " + firstPart);
        calculateThirdPart(firstPart);
        System.out.println("Third: " + firstPart);
    }



    private static void calculateSecondPart(int secondPartParameter) {
        secondPartParameter = secondPartParameter + 1;
    }

    private static void calculateThirdPart(int thirdPartParameter) {
        thirdPartParameter = thirdPartParameter + 2;
    }





    private static void defineFirstPart(StringBuilder baseNameParameter) {
        baseNameParameter.append(": The Fellowship of the Ring");
    }

    private static void defineSecondPart(StringBuilder baseNameParameter) {
        baseNameParameter.delete(baseNameParameter.indexOf(":"), baseNameParameter.length());
        baseNameParameter.append(": The Two Towers");
    }

    private static void defineThirdPart(StringBuilder baseNameParameter) {
        baseNameParameter.delete(baseNameParameter.indexOf(":"), baseNameParameter.length());
        baseNameParameter.append(": The Return of the King");
    }

}
