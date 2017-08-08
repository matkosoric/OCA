package edu.matkosoric.polymorphism.shadowing.vs.overriding;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

class AncientGreece{
    public String officialLanguage = "Greek";
    public String getLargestCityName() {
        return "Athens";
    }
}


class RomanEmpire extends AncientGreece{
    public String officialLanguage = "Latin";
    public String getLargestCityName() {
        return "Rome";
    }

    public static void main(String[] args){

        AncientGreece a = new AncientGreece();
        AncientGreece b = new RomanEmpire();
        RomanEmpire c = new RomanEmpire();

        // in the first case, everything works fine
        System.out.println(a.officialLanguage);
        System.out.println(a.getLargestCityName() + "\n");

        // in this case, officialLanguage variable remains the same
        System.out.println(b.officialLanguage);
        System.out.println(b.getLargestCityName()+ "\n");           // method is overridden

        // everything works fine
        System.out.println(c.officialLanguage);
        System.out.println(c.getLargestCityName());

    }
}