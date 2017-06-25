package edu.matkosoric.flowcontrol.construction.sequence;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class HumanBody extends Skin{

    // this example illustrates the order of execution blocks when object instance is created.
    // static initialisation block are run at the beginning of program, before the main method.
    // instance initialisation blocks are run before each instance creation, and since these
    // classes form an inheritance hierarchy, top level class instance if created first, and the lowest
    // level class instance last.


    public static void main(String[] args) {

        // program execution start
        System.out.println("\t\t\nMAIN METHOD STARTED!");

        // creating the instance of HumanBody class will initiate a chain of parent class constructors
        HumanBody hb = new HumanBody();

        // static variables from the Bones class are accessible to the HumanBody instance
        System.out.println(hb.numberOfBones);
    }



    // instance initialisation block -  initialisation block called before instance creation
    {        System.out.println("HumanBody initialisation");    }

    // Human Body constructor
    HumanBody () {
        System.out.println("Human body constructor");
    }

    // static initialisation block - initialisation block for Skin class
    static {System.out.println("...loading HumanBody.class..."); }
}



// Bones class is a top class in this case, directly under the Object class
class Bones {

    static int numberOfBones = 206;

    // static initialisation block - initialisation block for Bones class
    static {System.out.println("...loading Bones.class...");}

    // instance initialisation block - initialisation block called before instance creation
    {        System.out.println("Bones initialisation");    }

    // constructor
    Bones () {        System.out.println("Bones constructor");    }

}




class Muscles extends Bones{

    // static initialisation block - initialisation block for Muscles class
    static {System.out.println("...loading Muscles.class..."); }

    // instance initialisation block - initialisation block called before instance creation
    {        System.out.println("Muscles initialisation");    }

    // Muscles constructor
    Muscles () {        System.out.println("Muscles constructor");    }

}




class Skin extends Muscles{

    // static initialisation block - initialisation block for Skin class
    static {System.out.println("...loading Skin.class..."); }

    // instance initialisation block  - initialisation block called before instance creation
    {        System.out.println("Skin initialisation");    }

    // Skin constructor
    Skin () { System.out.println("Skin constructor");     }

}
