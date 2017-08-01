package edu.matkosoric.basics;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Book {

    // final variables must be initialised in one of three possible ways:
    // during declaration, in the constructor, or in the initialisation block.
    // if class initialises these fields in two or more ways, there will be a compile-time error.

    final int ID = 0;
    final String title = "title";
    final String author = "author";
    final int year = 0;
    final long ISBN = 0;

    // initialisation block, executed on every object creation
//    {
//        ID = 0;
//        title = "title";
//        author = "author";
//        year = 0;
//        ISBN = 0;
//    }

    // constructor
//    public Book(int ID, String title, String author, int year, long ISBN) {
//        this.ID = ID;
//        this.title = title;
//        this.author = author;
//        this.year = year;
//        this.ISBN = ISBN;
//    }

    public static void main(String[] args) {

        Book a = new Book();
        System.out.println(a.title);

    }

}
