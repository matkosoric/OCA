package edu.matkosoric.inheritance.interface_.inheritance;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

// class - even abstract - can not implement another class.
//public abstract class PlantOrganism implements Organism{ }       // does not compile

// class - even abstract - can not extend another interface.
//public abstract class PlantOrganism extends PlantLife{ }       // does not compile

public abstract class PlantOrganism extends Organism{}