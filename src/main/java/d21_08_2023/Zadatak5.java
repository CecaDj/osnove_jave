package d21_08_2023;

import java.util.Random;
import java.util.Scanner;

public class Zadatak5 {
    //(Za vezbanje) Napisati program za ucenje matematike. Program daje korisniku 5 matematickih zadataka.
    //Svaki nivo predstavlja jednu iteraciju petlje i u svakom nivou korisniku se prikazuju
    // dva random broja koja treba da sabere i poruka o tacnosti resenja.
    // (Program generise random brojeve u opsegu od 0 do 50, ne unosi ih korisnik)
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random random = new Random();


        for (int i = 0; i < 5; i++) {
            int x = random.nextInt(50);
            int y = random.nextInt(50);

            System.out.println("Koliko je " + x + " + " + y + "?");
            int odgovor = s.nextInt();

            if(odgovor == x + y) {
                System.out.println("Cestitam!");
            } else {
                System.out.println("Greska!");
            }

        }
    }
}
