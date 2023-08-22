package d21_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    //Napisati program koji od korisnika ucitava N brojeva i sabira samo parne brojeve.
    // Na kraju programa prikazati sumu.
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite n:");
        int n = s.nextInt();
        int suma = 0;
        String objasnjenje = "";

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj:");
            int broj = s.nextInt();


            if (broj % 2 == 0) {
                suma = suma + broj;
                objasnjenje = objasnjenje + broj + " + ";

            }

        }
        System.out.println("Suma parnih brojeva je: " + suma);
        System.out.println("Objasnjenje: " + objasnjenje + " = " + suma);
    }
}
