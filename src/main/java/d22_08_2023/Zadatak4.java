package d22_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    // Napisati program koji od korisnika ucitava brojeve sve dok ne unesu bar dve dvojke ili tri jedinice.
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int counterOne = 0;
        int counterTwo = 0;
        boolean isEnd = false;

        while (!isEnd) {
            System.out.println("Unesite broj:");
            int number = s.nextInt();

            if (number == 1) {
                counterOne = counterOne + 1;
            } else if (number == 2) {
                counterTwo = counterTwo + 1;
            }

            if (counterOne >= 3 || counterTwo >= 2) {
                isEnd = true;
            }

        }
        System.out.println("Kraj programa.");
    }
}
