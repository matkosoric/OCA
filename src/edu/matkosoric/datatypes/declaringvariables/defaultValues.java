package edu.matkosoric.datatypes.declaringvariables;

/**
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class defaultValues {

    // STATIC OR CLASS VARIABLES
    // initialisation occurs when the class is loaded
    static byte classByte;
    static short classShort;
    static int classInteger;
    static long classLong;
    static float classFloat;
    static double classDouble;
    static boolean classBoolean;
    static char classChar;

    static String classString;          // Object's default value is null
    static Short classShortWrapper;     // Wrapper's default value is null
    static Float classFloatWrapper;     // Wrapper's default value is null
    static Character classCharWrapper;  // Wrapper's default value is null


    // INSTANCE VARIABLES
    // initalisation occurs upon object creation
    byte instanceByte;
    short instanceShort;
    int instanceInteger;
    long instanceLong;
    float instanceFloat;
    double instanceDouble;
    boolean instanceBoolean;
    char instanceChar;

    String instanceString;
    Short instanceShortWrapper;
    Float instanceFloatWrapper;
    Character instanceCharacterWrapper;


    public static void main(String[] args) {

        //class variables (static variables) have a default value without initialisation
        System.out.println(classByte);
        System.out.println(classShort);
        System.out.println(classInteger);
        System.out.println(classLong);
        System.out.println(classFloat);
        System.out.println(classDouble);
        System.out.println(classBoolean);
        System.out.println(classChar);      //value is set to '\u0000', which is blank space
        System.out.println(classString);            //null
        System.out.println(classShortWrapper);      //null
        System.out.println(classFloatWrapper);      //null
        System.out.println(classCharWrapper);       //null
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");


        //instance variables also have a default value
        defaultValues dvInstance = new defaultValues();
        System.out.println(dvInstance.instanceByte);
        System.out.println(dvInstance.instanceShort);
        System.out.println(dvInstance.instanceInteger);
        System.out.println(dvInstance.instanceLong);
        System.out.println(dvInstance.instanceFloat);
        System.out.println(dvInstance.instanceDouble);
        System.out.println(dvInstance.instanceBoolean);
        System.out.println(dvInstance.instanceChar);
        System.out.println(dvInstance.instanceString);
        System.out.println(dvInstance.instanceShortWrapper);
        System.out.println(dvInstance.instanceFloatWrapper);
        System.out.println(dvInstance.instanceCharacterWrapper);

        // however, since objects are set to null, it is easily possible to encounter a NullPointerException at runtime
        // this will compile, but throw a NullPointerException
//        System.out.println(dvInstance.instanceString.length());
//        System.out.println(dvInstance.instanceShortWrapper.toString());
//        System.out.println(dvInstance.instanceFloatWrapper.byteValue());
//        System.out.println(dvInstance.instanceCharacterWrapper.compareTo('a'));



        // local variables have to be initialised before use
        // otherwise, compilation will not succeed
        byte localByte;
        short localShort;
        int localInteger;
        long localLong;
        float localFloat;
        double localDouble;
        boolean localBoolean;
        char localChar;
        String localString;
        Short localShortWrapper;
        Float localFloatWrapper;
        Character localCharacterWrapper;

//        System.out.println(localByte);
//        System.out.println(localShort);
//        System.out.println(localInteger);
//        System.out.println(localLong);
//        System.out.println(localFloat);
//        System.out.println(localDouble);
//        System.out.println(localBoolean);
//        System.out.println(localChar);
//        System.out.println(localString);
//        System.out.println(localShortWrapper);
//        System.out.println(localFloatWrapper);
//        System.out.println(localCharacterWrapper);


    }

}
