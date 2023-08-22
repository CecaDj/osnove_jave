package d21_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    //Napisati program koji ucitava N brojeva od korisnika i sabira samo trocifrene brojeve.
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite n:");
        int n = s.nextInt();
        int suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj:");
            int broj = s.nextInt();

            if(broj >= 100 && broj < 1000) {
                suma = suma + broj;
            }

        }
        System.out.println("Suma je: " + suma);
    }
}
