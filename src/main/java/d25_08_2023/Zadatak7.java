package d25_08_2023;

import java.util.Scanner;

public class Zadatak7 {
    //Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
    // U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.
    //
    //Ako se proslede brojevi 4,6,1 u poziv metode, metoda vraca 1
    //Ako se proslede brojevi 4,6,33 u poziv metode, metoda vraca 4
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite prvi broj:");
        int prviBroj = s.nextInt();
        System.out.println("Unesite drugi broj:");
        int drugiBroj = s.nextInt();
        System.out.println("Unesite treci broj:");
        int treciBroj = s.nextInt();

        int najmanjiBroj = vratiNajmanjiBroj(prviBroj, drugiBroj, treciBroj);
        System.out.println("Najmanji broj je: " + najmanjiBroj);

    }
    public static int vratiNajmanjiBroj(int broj1, int broj2, int broj3) {
        int najmanji = broj1;

        if (broj2 < najmanji) {
            najmanji = broj2;
        } else if (broj3 < najmanji) {
            najmanji = broj3;
        }
        return najmanji;
    }
}
