package edu.matkosoric.flowcontrol.switch_.nested.switch_;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by Matko Soric.
 */

public class Miracle {

    public static void main(String[] args) {

        // it is possible to have a nested switch statements
        // this is an illustration of a three-layered switch statement

        String myFavoriteTVShow = "It's Always Sunny in Philadelphia";
        Integer myFavoriteTVShowSeason = 2;
        Integer myFavoriteTVShowEpisode = 14;
        String myFavoriteTVShowEpisodeName = "The Gang Exploits a Miracle";

        switch (myFavoriteTVShow) {
            case "Star Trek: The Next Generation": {
                System.out.println("Star Trek: The Next Generation");
                break;
            }
            case "Red Dwarf": {
                System.out.println("Red Dwarf");
                break;
            }
            case "Seinfeld": {
                System.out.println("Seinfeld");
                break;
            }
            case "That '70s Show": {
                System.out.println("That '70s Show");
                break;
            }
            case "My name is Earl": {
                System.out.println("My name is Earl");
                break;
            }
            case "It's Always Sunny in Philadelphia": {
                System.out.println("It's Always Sunny in Philadelphia");
                switch (myFavoriteTVShowSeason) {
                    case 1: {System.out.println(1); break;}
                    case 2: {
                        System.out.println(2);
                        switch (myFavoriteTVShowEpisode) {
                            case 8: {System.out.println(8); break;}
                            case 9: {System.out.println(9); break;}
                            case 10: {System.out.println(10); break;}
                            case 11: {System.out.println(11); break;}
                            case 12: {System.out.println(12); break;}
                            case 13: {System.out.println(13); break;}
                            case 14: {
                                System.out.println(14);
                                System.out.println("The episode name is: " + myFavoriteTVShowEpisodeName);
                                break;}
                            case 15: {System.out.println(15); break;}
                            case 16: {System.out.println(16); break;}
                            case 17: {System.out.println(17); break;}
                        }
                        break;}
                    case 3: {System.out.println(3); break;}
                    case 4: {System.out.println(4); break;}
                    case 5: {System.out.println(5); break;}
                    case 6: {System.out.println(6); break;}
                    case 7: {System.out.println(7); break;}
                    case 8: {System.out.println(8); break;}
                    case 9: {System.out.println(9); break;}
                    case 10: {System.out.println(10); break;}
                    case 11: {System.out.println(11); break;}
                    case 12: {System.out.println(12); break;}
                    case 13: {System.out.println(13); break;}
                    case 14: {System.out.println(14); break;}
                }
                break;
            }
        }
    }
}
