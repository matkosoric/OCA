package edu.matkosoric.exceptions.chainOfMethods;

import java.io.IOException;
import java.text.ParseException;

/**
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class chain {

    // top method has to list all of the checked exceptions that might emerge
    // during the program execution

    public static void main(String[] args) throws   IOException,
                                                    ClassNotFoundException,
                                                    ParseException{
        firstOrderMethod();
    }

    private static void firstOrderMethod() throws   IOException,
                                                    ClassNotFoundException,
                                                    ParseException {
        secondOrderMethod();
    }

    private static void secondOrderMethod() throws  ClassNotFoundException,
                                                    ParseException {
        thirdOrderException();
    }

    private static void thirdOrderException() throws ParseException{

        // NullPointerException is unchecked exception, and therefore
        // it is not mentioned in any of the throws
        throw new NullPointerException();

    }
}
