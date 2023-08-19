package d18_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    //Napisati program koji simulira stampanje ocitane licne karte u vise primeraka.
    // Korisnik unosi podatke :
    //ime
    //prezime
    //jmbg
    //broj primeraka za stampu

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite ime:");
        String ime = s.next();

        System.out.println("Unesite prezime:");
        String prezime = s.next();

        System.out.println("Unesite jmbg:");
        String jmbg = s.next();

        System.out.println("Unesite broj primeraka za stampu:");
        int brPrimeraka = s.nextInt();

        for (int i = 1; i < brPrimeraka + 1; i++) {
            System.out.println("Primerak " + i);
            System.out.println("*******************************");
            System.out.println("Ime i prezime: " + ime +" " + prezime);
            System.out.println("JMBG: " + jmbg);
            System.out.println("*******************************");
            System.out.println();
        }
    }
}
