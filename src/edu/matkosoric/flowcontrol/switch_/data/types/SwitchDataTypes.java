package edu.matkosoric.flowcontrol.switch_.data.types;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import edu.matkosoric.datatypes.default_.values.Char;

public class SwitchDataTypes {

    public static void main(String[] args) {

        // switch statement accepts these data types:
        // byte, short, integer, char,
        // their wrappers (Byte, Short, Integer and Character),
        // String (since java 7), and enums.


        // BYTE TYPE
        byte continentCodeByte = 7;
        String continentNameByte;

        switch (continentCodeByte) {
            default: continentNameByte = "Undefined";       // without this line, there would be an initialization error
                break;
            case 1: continentNameByte = "Asia";
                break;
            case 2: continentNameByte = "Africa";
                break;
            case 3: continentNameByte = "North America";
                break;
            case 4: continentNameByte = "Australia";
                break;
            case 5: continentNameByte = "Europe";
                break;
            case 6: continentNameByte = "South America";
                break;
            case 7: continentNameByte = "Antarctica";
                break;
        }
        System.out.println("Continent chosen by byte: " + continentNameByte);



        // SHORT TYPE
        short continentCodeShort = 7;
        String continentNameShort;

        switch (continentCodeShort) {
            default: continentNameShort = "Undefined";       // without this line, there would be an initialization error
                break;
            case 1: continentNameShort = "Asia";
                break;
            case 2: continentNameShort = "Africa";
                break;
            case 3: continentNameShort = "North America";
                break;
            case 4: continentNameShort = "Australia";
                break;
            case 5: continentNameShort = "Europe";
                break;
            case 6: continentNameShort = "South America";
                break;
            case 7: continentNameShort = "Antarctica";
                break;
        }
        System.out.println("Continent chosen by short: " + continentNameShort);



        // INTEGER TYPE
        int continentCodeInteger = 7;
        String continentNameInteger;

        switch (continentCodeInteger) {
            default: continentNameInteger = "undefined";       // without this line, there would be an initialization error
                break;
            case 1: continentNameInteger = "Asia";
                break;
            case 2: continentNameInteger = "Africa";
                break;
            case 3: continentNameInteger = "North America";
                break;
            case 4: continentNameInteger = "Australia";
                break;
            case 5: continentNameInteger = "Europe";
                break;
            case 6: continentNameInteger = "South America";
                break;
            case 7: continentNameInteger = "Antarctica";
                break;
        }
        System.out.println("Continent chosen by integer: " + continentNameInteger);



        //CHAR TYPE
        char temperatureCode = 'c';
        String chosenMeasurement;

        switch (temperatureCode) {
            case 'c': chosenMeasurement = "Celsius";
                    break;
            case 'k': chosenMeasurement = "Kelvin";
                    break;
            case 'f': chosenMeasurement = "Fahrenheit";
                    break;
            default: chosenMeasurement = "undefined";
        }
        System.out.println(chosenMeasurement);



        // STRING TYPE
        String favoriteSFMovie = "Alien";
        int movieCode;
        switch (favoriteSFMovie) {
            case "Terminator":              movieCode = 111; break;
            case "Blade Runner":            movieCode = 222; break;
            case "Alien":                   movieCode = 333; break;
            case "2001: A Space Odyssey":   movieCode = 444; break;
            default:                        movieCode = 000;
        }
        System.out.println(movieCode);



        // ENUM
        Towns myFavoriteTown = Towns.TOKYO;
        char townInitialLetter;
        switch (myFavoriteTown) {
            case CAIRO:         townInitialLetter = 'C'; break;
            case SAO_PAOLO:     townInitialLetter = 'S'; break;
            case MADRID:        townInitialLetter = 'M'; break;
            case NEW_YORK:      townInitialLetter = 'N'; break;
            case TOKYO:         townInitialLetter = 'T'; break;
            default:            townInitialLetter = '-'; break;
        }
        System.out.println(townInitialLetter);


        // switch statement does not accept these data types:
        // boolean, float, double, or objects
/*

        // BOOLEAN TYPE
        boolean powerOn = true;
        switch (powerOn) {                                      // does not compile
            case true:  System.out.println("The power is ON!");
            case false: System.out.println("The power is OFF!");
        }

        // LONG TYPE
        long spaceExplorationEvent = 1957;
        switch (spaceExplorationEvent) {                    // does not compile
            case 1957:          System.out.println("Sputnik"); break;
            case 1969:          System.out.println("First Man on the Moon"); break;
        }


        // FLOAT TYPE
        float PI = 3.14F;
        switch (PI) {           //does not compile
            case 3.14F:     System.out.println("Pi with two decimal places."); break;
            case 3.14159F:   System.out.println("Pi with five decimal places."); break;
        }

        // OBJECT TYPE

        AmericanPresident a = new AmericanPresident(1, "George", "Washington");
        AmericanPresident b = new AmericanPresident(16, "Abraham", "Lincoln");
        AmericanPresident c = new AmericanPresident(35, "John F.", "Kennedy");

        switch (a) {
            case b: System.out.println("Lincoln"); break;       // does not compile
            case c: System.out.println("Kennedy"); break;       // does not compile
            default: System.out.println("Washington");
        }
*/


        // compilation errors may emerge from incompatible values in allowed data types

        // char type can not be negative.
        char agent = 'x';
        switch (agent) {
            case 100: ;
//            case -1:        System.out.println("-1");       // does not compile
            default:        System.out.println("default");
        }

        byte lifeExpectancy = 80;
        switch (lifeExpectancy) {
//            case 4000:      System.out.println("too long!");            // does not compile
//            case 300:       System.out.println("too long!");            // does not compile
//            case 128:       System.out.println("still to long");        // does not compile
            case 127:         System.out.println("It's a deal!");
        }

        short cityPopulation = 30000;
        switch (cityPopulation) {
            case 31000:;
            case 32767:;
//            case 32768:;        // does not compile, value out of range
//            case 100_000:;      // does not compile, value out of range
        }

        char sign = 'g';
        switch (sign) {
            case 'a':   System.out.println("a");
            case '7':   System.out.println("7");
            case 445:   System.out.println("a");
            case 65535: System.out.println("maximum value");
//            case 65536: System.out.println("error");            // does not compile, value out of range
//            case -49:   System.out.println("error");            // does not compile, value out of range, char can not have negative value
        }

    }
}
