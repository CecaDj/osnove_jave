package d07_09_2023;

import java.util.Scanner;

public class Zadatak5 {
    //Napišite klasu "Oprema" sa atributima: tip (String), marka (String) i cena (double).
    // U glavnoj metodi kreirajte 3 objekta ove klase i postavite im vrednosti unosom sa tasture.
    // Ispisati informacije o opremi.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Oprema prva = new Oprema();
        System.out.println("Tip:");
        prva.tip = s.next();
        System.out.println("Marka:");
        prva.marka = s.next();
        System.out.println("Cena:");
        prva.cena = s.nextDouble();

        Oprema druga = new Oprema();
        System.out.println("Tip:");
        druga.tip = s.next();
        System.out.println("Marka:");
        druga.marka = s.next();
        System.out.println("Cena:");
        druga.cena = s.nextDouble();

        Oprema treca = new Oprema();
        System.out.println("Tip:");
        treca.tip = s.next();
        System.out.println("Marka:");
        treca.marka = s.next();
        System.out.println("Cena:");
        treca.cena = s.nextDouble();

        System.out.println("Oprema: " + prva.tip + ", " + prva.marka + ", " + prva.cena);
        System.out.println("Oprema: " + druga.tip + ", " + druga.marka + ", " + druga.cena);
        System.out.println("Oprema: " + treca.tip + ", " + treca.marka + ", " + treca.cena);

    }
}
