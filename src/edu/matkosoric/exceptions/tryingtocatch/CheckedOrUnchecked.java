package edu.matkosoric.exceptions.tryingtocatch;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

/**
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class CheckedOrUnchecked {

    public static void main(String[] args) {

        // checked exceptions have to be enclosed in a try-catch block,
        // or else they will not compile

//        throw new Exception();                              // does not compile
//        throw new IOException();                            // does not compile
//        throw new FileNotFoundException();                  // does not compile
//        throw new ParseException("Talking Heads", 3);       // does not compile
//        throw new ClassNotFoundException();                 // does not compile
//        throw new CloneNotSupportedException();             // does not compile
//        throw new InstantiationException();                 // does not compile
//        throw new InterruptedException();                   // does not compile
//        throw new NoSuchMethodException();                  // does not compile
//        throw new NoSuchFieldException();                   // does not compile



        // these exceptions will compile

        try {
            throw new Exception();
        } catch (Exception e) {}

        try {
            throw new IOException();
        } catch (IOException e) {}

        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {}

        try {
            throw new ParseException("Talking Heads", 3);
        } catch (ParseException e) {}

        try {
            throw new ClassNotFoundException();
        } catch (ClassNotFoundException e) {}

        try {
            throw new CloneNotSupportedException();
        } catch (CloneNotSupportedException e) {}

        try {
            throw new InstantiationException();
        } catch (InstantiationException e) {}

        try {
            throw new InterruptedException();
        } catch (InterruptedException e) {}

        try {
            throw new InterruptedException();
        } catch (InterruptedException e) {}

        try {
            throw new NoSuchMethodException();
        } catch (NoSuchMethodException e) {}

        try {
            throw new NoSuchFieldException();
        } catch (NoSuchFieldException e) {}



        // on the other hand, unchecked exceptions can be thrown outside the try-catch block
        // without any compilation errors

        int option = 3;
        switch (option) {
            case 1:        throw new ArrayIndexOutOfBoundsException();
            case 2:        throw new ClassCastException();
            case 3:        throw new IllegalArgumentException();
            case 4:        throw new IllegalStateException();
            case 5:        throw new NullPointerException();
            case 6:        throw new NumberFormatException();
            case 7:        throw new AssertionError();
            case 8:        throw new ExceptionInInitializerError();
            case 9:        throw new StackOverflowError();
            case 10:       throw new NoClassDefFoundError();
            case 11:       throw new SecurityException();
        }

    }
}
