package edu.matkosoric.polymorphism.with.interface_;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Tree extends Seed {

    // initially created object determines what methods will be called

    public static void main(String[] args) {

        Tree oak = new Tree();
        Seed oakSeed = new Tree();
        NeedForWater need = new Tree();

        System.out.println(oak);        // output Tree
        System.out.println(oakSeed);    // output Tree
        System.out.println(need);       // output Tree

    }
    public String toString () {
        return "Tree";
    }
}
