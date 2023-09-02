package mini_projekat;

import java.util.ArrayList;

public class Zadatak2 {
    //Napišite program koji simulira prikazivanje korisnika na Slacku.
    // Prikaz korisnika treba da se izvede tako da prvo budu prikazani aktivni korisnici, a potom neaktivni.
    // Program će čuvati sledeće informacije:
    //Niz korisnika - u ovom nizu će biti sačuvani svi korisnici koji imaju pristup Slacku.
    //Niz aktivnosti - svaki korisnik će biti označen kao aktivan ili neaktivan.
    // Informacije o aktivnostima biće čuvane u nizu gde će za svakog korisnika biti zabeleženo da li je trenutno aktivan ili ne  (true ili false)..
    // Naravno, korisnik i njegova aktivnost će biti upareni po istom indeksu.
    //Program će ispisivati informacije za svakog korisnika na sledeći način:
    //Za aktivne korisnike:
    //  | slika |o Ime Prezime
    //Za neaktivne korisnike:
    //  | slika |x Ime Prezime
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        ArrayList<Boolean> isActive = new ArrayList<>();

        name.add("Pera Peric");
        name.add("Marko Markovic");
        name.add("Stefan Stefanovic");
        name.add("Uros Urosevic");
        name.add("Darko Darkovic");

        isActive.add(true);
        isActive.add(false);
        isActive.add(false);
        isActive.add(true);
        isActive.add(true);

        for (int i = 0; i < name.size(); i++) {
            if (isActive.get(i)) {
                System.out.println("| slika |o " + name.get(i));
            }
        }

        for (int i = 0; i < isActive.size(); i++) {
            if (!isActive.get(i)) {
                System.out.println("| slika |x " + name.get(i));
            }
        }
    }
}
