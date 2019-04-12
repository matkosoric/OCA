package edu.matkosoric.operators.wrapper.and.primitive;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class ArmstrongAndDarwin {

    public static void main(String[] args) {

        short moonLandingPrimitive = 1969;
        Long moonLandingWrapper = 1969L;

        System.out.println(moonLandingWrapper == moonLandingPrimitive);         // true
        // because wrapper is unboxed

        System.out.println(moonLandingWrapper.equals(moonLandingPrimitive));    // false
        // because primitive is autoboxed from short to Short wrapper,
        // and comparing different classes (wrappers in this case) returns false


        int theOriginOfSpeciesPrimitive = 1859;
        Integer theOriginOfSpeciesWrapper = 1859;

        System.out.println(theOriginOfSpeciesWrapper == theOriginOfSpeciesPrimitive);       // true
        System.out.println(theOriginOfSpeciesWrapper.equals(theOriginOfSpeciesPrimitive));
        // true, because primitive is autoboxed to integer wrapper that can be compared to other integer wrapper

    }
}
