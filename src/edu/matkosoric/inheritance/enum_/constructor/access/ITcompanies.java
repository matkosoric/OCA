package edu.matkosoric.inheritance.enum_.constructor.access;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public enum ITcompanies {

    // enum constructor can have private or default scope,
    // but it can not be protected or public.

    FACEBOOK(1),
    GOOGLE(2),
    APPLE(3),
    IBM(4);

    private final int companyCode;

//    public ITcompanies (int code) {           // does not compile, enum constructor can not be public
//        this.companyCode = code;
//    }
    ITcompanies (int code) {
        this.companyCode = code;
    }


}
