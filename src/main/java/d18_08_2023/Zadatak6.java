package d18_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    //Napisati program koji ucitava dimenziju table i stampa je na ekranu.
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite dimenziju table:");
        int dimenzija = s.nextInt();

        for (int i = 1; i < dimenzija + 1; i++) {
            for (int j = 1; j < dimenzija + 1; j++) {
                System.out.print("_|");
            }
            System.out.println();
        }
    }
}
