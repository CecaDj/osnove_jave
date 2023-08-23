package d22_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    //Napisati program koji ucitava RIMSKE brojeva od korisnika
    // i na ekranu ispisuje arapsku vrednost sve dok korisnik ne unese KRAJ.
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String input = "";

        while(!input.equals("KRAJ")) {
            System.out.println("Unesite rimski broj:");
            input = s.next();

            if(input.equals("I")) {
                System.out.println("1");
            } else if (input.equals("V")) {
                System.out.println("5");
            } else if (input.equals("X")) {
                System.out.println("10");
            } else if (input.equals("L")) {
                System.out.println("50");
            } else if (input.equals("C")) {
                System.out.println("100");
            } else if (input.equals("D")) {
                System.out.println("500");
            } else if (input.equals("M")) {
                System.out.println("1000");
            }

        }
        System.out.println("Kraj programa.");
    }
}
