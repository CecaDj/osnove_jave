package mini_projekat;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak5 {
    //Napišite program koji simulira automatsko generisanje random passworda.
    //Korisnik će uneti željenu dužinu passworda, a program će kreirati i ispisati password koji zadovoljava te parametre.
    //Ovaj zadatak zahteva implementaciju različitih metoda za generisanje karaktera i passworda.
    //generisiRandomKarakter: Ova metoda generiše i vraća random karakter.
    // Metoda koristi niz stringova sa elementima koji predstavljaju mala slova, velika slova i brojeve (niz je sa fiksnim vrednostima).
    // Random bira jedan element iz niza i vraća ga kao povreatnu vrednost (string). Ova metoda nema ulazne parametre.
    //generisiRandomSpecijalanKarakter: Ova metoda generiše i vraća random specijalan karakter.
    // Metoda koristi niz stringova sa elementima `@`, `#`, `&`, `*` i `!` (niz je sa fiksnim vrednostima).
    // Random bira jedan element iz niza i vraća ga kao string. Ova metoda nema ulazne parametre.
    //Napomena: Metode generisiRandomSpecijalanKarakter generisiRandomKarakter nemaju nikakvu stampu u sebi!
    //Glavni program:
    //   - Korisnik unosi dužinu passworda i informaciju da li treba sadržati specijalan karakter.
    //   - Koristeći metodu `generisiPassword`, program generiše i ispisuje password.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite duzinu passworda: ");
        int duzinaPassworda = s.nextInt();

        System.out.println("Da li zelite da sadrzi specijalan karakter:");
        boolean specijalanKarakter = s.nextBoolean();

        generisiPassword(duzinaPassworda,specijalanKarakter);

    }

    public static void generisiPassword(int duzinaPassworda, boolean specijalanKarakter) {
        String password = "";
        if(specijalanKarakter) {
            for (int i = 0; i < duzinaPassworda - 1; i++) {
                password += generisiRandomKarakter();
            }
            password = password + generisiRandomSpecijalanKarakter();
        } else {
            for (int i = 0; i < duzinaPassworda; i++) {
                password += generisiRandomKarakter();
            }
        }

        System.out.println("Password: " + password);

    }

    public static String generisiRandomKarakter() {
        Random random = new Random();
        ArrayList<String> karakteri = new ArrayList<>();

        karakteri.add("a");
        karakteri.add("b");
        karakteri.add("C");
        karakteri.add("D");
        karakteri.add("R");
        karakteri.add("5");
        karakteri.add("P");
        karakteri.add("q");
        karakteri.add("9");
        karakteri.add("3");

        String karakter = karakteri.get(random.nextInt(karakteri.size()));
        return karakter;


    }

    public static String generisiRandomSpecijalanKarakter() {
        Random random = new Random();
        ArrayList<String> specijalniKarakteri = new ArrayList<>();

        specijalniKarakteri.add("*");
        specijalniKarakteri.add("%");
        specijalniKarakteri.add("|");
        specijalniKarakteri.add("&");
        specijalniKarakteri.add("$");
        specijalniKarakteri.add("?");
        specijalniKarakteri.add("=");
        specijalniKarakteri.add("-");
        specijalniKarakteri.add("#");
        specijalniKarakteri.add("!");


        String specijalanKarakter = specijalniKarakteri.get(random.nextInt(specijalniKarakteri.size()));
        return specijalanKarakter;

    }


}

