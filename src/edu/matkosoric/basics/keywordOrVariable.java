package edu.matkosoric.basics;

/**
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class keywordOrVariable {

    public static void main(String[] args) {

        /**
        java keywords can not be used in naming variables
        KEYWORDS:

         abstract, continue, for, new, switch, assert, default,
         goto, package, synchronized, boolean, do, if, private,
         this, break, double, implements, protected, throw, byte,
         else, import, public, throws, case, enum, instanceof,
         return, transient, catch, extends, int, short, try, char,
         final, interface, static, void, class, finally, long,
         strictfp, volatile, const, float, native, super, while

         */

        // since Java language is case sensitive, following name variables are permitted, but not encouraged

        int inT;                    short IF;               Float Float;
        int abstract1;              short throwS;           float char_;
        int PACKAGE;                short Character;        float finnaly;
        int _public;                short CATCH;            float finallY;
        boolean instanceOF;         byte True;              char NATIVE;
        boolean Volatile;           byte _abstract;         char StAtIc;
        boolean Final;              byte $new;              char instanceOf;
        Boolean Boolean;            byte synchronised;      char foreach;

        /*
        "null", "true" and "false" are not keywords, but value literals
        still, they can not be used in naming variables
        long null;
        long true;
        boolean true;
        boolean false;
        */

        // these are permitted
        long _;
        long $;
        long _1987623912;
        long $asdfjhaskl;
        long a_2$k_9wq8;

    }
}
