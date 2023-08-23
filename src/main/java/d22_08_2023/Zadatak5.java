package d22_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    //Napisati program koji proverava uparenost zagrada.
    // Korisnik unosi matematicku formulu sve dok ne unese znak =.
    // Korisnik unosi svaki karakter jednacine posebno i na kraju programa se ispisuje da li su sve zagrade uparene.
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String input = "";
        int counterOpen = 0;
        int counterClose = 0;

        while (!input.equals("=")) {
            System.out.println("Unos:");
            input = s.next();

            if (input.equals("(")) {
                counterOpen = counterOpen + 1;
            } else if (input.equals(")")) {
                counterClose = counterClose + 1;
            }

        }
        if (counterOpen == counterClose) {
            System.out.println("Zagrade su uparene.");
        } else {
            System.out.println("Zagrade nisu uparene.");
        }
    }
}
