package edu.matkosoric.methods.returning;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Returning {

    public static void main(String[] args) {

//        int a = method1();      //does not compile, the compiler 'sees' method1 signature with the void return type
//        System.out.println(a);

        int b = method2();
        System.out.println(b);
    }



    public static void method1 (){
//        return 3;       //does not compile, value of return statement (3) does not match the return declaration
    }

    public static int method2() {
        return 5;
//        System.out.println("Method 2");           // does not compile, unreachable statement
                                                    // statements after the return keyword are not permitted
    }

}


