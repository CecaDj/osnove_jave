package d07_09_2023;

import java.util.Scanner;

public class Zadatak4 {
    //Napišite klasu "Film" sa atributima: naslov (String), godinaIzdanja (int) i reziser (String).
    // U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti unosom sa tastature.
    // Ispisati informacije o filmovima.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Film film1 = new Film();
        System.out.println("Unesite naslov:");
        film1.naslov = s.next();
        System.out.println("Unesite godinu izdanja:");
        film1.godinaIzdanja = s.nextInt();
        System.out.println("Unesite rezisera:");
        film1.reziser = s.next();

        Film film2 = new Film();
        System.out.println("Unesite naslov:");
        film2.naslov = s.next();
        System.out.println("Unesite godinu izdanja:");
        film2.godinaIzdanja = s.nextInt();
        System.out.println("Unesite rezisera:");
        film2.reziser = s.next();

        Film film3 = new Film();
        System.out.println("Unesite naslov:");
        film3.naslov = s.next();
        System.out.println("Unesite godinu izdanja:");
        film3.godinaIzdanja = s.nextInt();
        System.out.println("Unesite rezisera:");
        film3.reziser = s.next();

        System.out.println("Film: " + film1.naslov + ", " + film1.godinaIzdanja + ", " + film1.reziser);
        System.out.println("Film: " + film2.naslov + ", " + film2.godinaIzdanja + ", " + film2.reziser);
        System.out.println("Film: " + film3.naslov + ", " + film3.godinaIzdanja + ", " + film3.reziser);

    }
}
