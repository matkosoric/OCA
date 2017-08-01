package edu.matkosoric.inheritance.hiding.static_;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Brazil {

    // static variable can be declared again in static or instance methods,
    // and receive new value, even if it is originally declared final.
    // they are simply treated as local variables, shadowing original identifier.
    // in both cases, we have valid java code.


    public static final String capitalCity = "Rio de Janeiro";

    public void changeCityInstance (String newCapitalName) {
        String capitalCity = newCapitalName;
        System.out.println("Output from instance method: " + capitalCity);
    }

    public static void changeCityStatic (String newCapitalName) {
        String capitalCity = newCapitalName;
        System.out.println("Output from a static method: " + capitalCity);
    }

    public static void main(String[] args) {

        System.out.println("Initial value: " + capitalCity);

        Brazil b = new Brazil();
        b.changeCityInstance("Brasília");

        // however, capitalCity still has the same value
        System.out.println(capitalCity);

        // calling static method
        changeCityStatic("Brasília");
        System.out.println(capitalCity);

//        capitalCity = "Brasília";       // does not compile, final variable

    }
}
