package edu.matkosoric.flowcontrol.unary.in.loop;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

public class Counting {

    public static void main(String[] args) {

        // first example
        int nineties1 = 1990;
        int nineties2 = 1999;

        FIRSTLOOP: for (; ; nineties1++)
            for (; ; nineties2--)
                if (nineties1>nineties2) break FIRSTLOOP;

        System.out.println(nineties1);
        System.out.println(nineties2);


        // second example
        int a = 0;
        int b = 10;

        for (; a<b; a++, b--);
        System.out.println(a + " : " + b);


        // third example
        int x = 1;
        int y = 9;
        while (x<=y) {
            x++;
            y--;
        }
        System.out.println(x + " : " + y);



        // fourth example
        byte f = 0;
        short g = 10;
        Short h = 0;

        while (f<g) {
            f++;
            g--;
            h++;
        }
        System.out.println(f + " : " + g + " : " + h);


    }
}
