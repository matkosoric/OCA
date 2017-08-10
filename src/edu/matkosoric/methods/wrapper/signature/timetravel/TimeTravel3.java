package edu.matkosoric.methods.wrapper.signature.timetravel;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class TimeTravel3 {

    public static void main(String[] args) {

        TimeTravel3 marty = new TimeTravel3();

        int yearInt = 2034;
        marty.timeTravel(yearInt);

        long yearLong = 2034L;
//        marty.timeTravel(yearLong);             // does not compile, when appropriate method is commented out

        Integer yearIntegerWrapper = 2034;
        marty.timeTravel(yearIntegerWrapper);

        Long yearLongWrapper = 2034L;
//        marty.timeTravel(yearLongWrapper);      // does not compile, when appropriate method is commented out

        int [] yearIntegerVarArg1 = {2034};
        marty.timeTravel(yearIntegerVarArg1);

        int [] yearIntegerVarArg2 = {2034, 2044};
        marty.timeTravel(yearIntegerVarArg2);

        long [] yearLongVarArg1 = {2034L};
//        marty.timeTravel(yearLongVarArg1);      // does not compile, when appropriate method is commented out

        long [] yearLongVarArg2 = {2034L, 2044L};
//        marty.timeTravel(yearLongVarArg2);      // does not compile, when appropriate method is commented out

    }

    void timeTravel (int destinationYear) {        System.out.println("int");    }

//    void timeTravel (long destinationYear) {        System.out.println("long");    }

    void timeTravel (Integer destinationYear) {        System.out.println("Integer wrapper");    }

//    void timeTravel (Long destinationYear) {        System.out.println("Long wrapper");    }

    void timeTravel (int ... destinationYear) {        System.out.println("int var arg");    }

//    void timeTravel (long ... destinationYear) {        System.out.println("long var arg");    }
}
