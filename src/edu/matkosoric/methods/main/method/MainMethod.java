package edu.matkosoric.methods.main.method;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class MainMethod {

    // original main method
    public static void main(String[] args) {
//        String args = "Second string";   //does not compile, the variable name is already defined in the main method parameter list
//        String [] args = {"first string", "second string"};     //does not compile, it is a naming issue, not a type issue
    }

    //it is valid to have a 'similar' method with different name (capital M)
    public static void Main(String[] args) {}

    // it is valid to have a method called main,
    // in addition to the original main method, with different signature.
    // it is treated as separate, unique method.
    public static void main(int[] args) {}
    public static void main(byte[] args) {}
    public static void main(float[] args) {}
    public static void main(String[] args, int a) {}
    public static void main(String[] args, int ... b) {}


    //public static int main(String[] args) {return 6;}
    // Will not compile if there is also original main method.
    // Since return type is not a part of method's signature,
    // this will be seen by the compiler as a duplicate main method.
    // if you remove original main method, this method will compile
    // and be treated as application's entry point.

    // keywords "public" and "static" can be written in reversed order
    // following two statements are treated as equal by the compiler
//    public static void main(String[] args) {}
//    static public void main(String[] args) {}

}


