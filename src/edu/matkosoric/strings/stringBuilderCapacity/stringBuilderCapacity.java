package edu.matkosoric.strings.stringBuilderCapacity;

/**
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */
public class stringBuilderCapacity {

    public static void main(String[] args) {


        // default value of StringBuilder capacity is 16.
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.capacity());         // output: 16

        // if created with string parameter, capacity is assigned a value of that string's length + 16
        StringBuilder sb2 = new StringBuilder("Mick");
        System.out.println(sb2.capacity());

        StringBuilder sb3 = new StringBuilder("Mick Jagger");
        System.out.println(sb3.capacity());

        // StringBuilder constructor also accepts integer value to define the initial capacity
        StringBuilder sb4 = new StringBuilder(30);
        System.out.println("Explicity defined capacity: " + sb4.capacity());

        //however, after a change in value, capacity will also automatically grow
        sb4.append("Rolling Stones are starting a new tour.");
        System.out.println("New capacity: " + sb4.capacity());

        // if new value is larger than current capacity, new capacity takes a double value of current capacity+1
        // formula would be: new capacity = (current capacity+1) * 2
        System.out.println("Current capacity: " + sb4.capacity());
        sb4.append(" The new tour should go through towns like New York, London, Rome and Lišane Ostrovičke");
        System.out.println("New capacity: " + sb4.capacity());

        // capacity can be defined even after initialisation with the method ensureCapacity()
        // the method will not have effect (or produce exception) if called with the value smaller than the current capacity
        sb4.ensureCapacity(100);
        System.out.println("ensure capacity() without effect: " + sb4.capacity());
        sb4.ensureCapacity(300);
        System.out.println("ensure capacity() with effect: " + sb4.capacity());

    }
}
