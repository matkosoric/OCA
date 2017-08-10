package edu.matkosoric.inheritance.interface_.inheritance;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

// interface can not extend another class
//public interface PlantLife extends Organism {}      // does not compile


// interface can extend another interface
public interface PlantLife extends Life{ }
