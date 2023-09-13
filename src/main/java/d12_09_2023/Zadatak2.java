package d12_09_2023;

import java.util.ArrayList;

//Kreirati klasu ZeleniKarton koja ima:
//ime i prezime studenta
//broj indeksa
//naziv predmeta
//ime i prezime profesora
//ocenu - od 5 do 10
//gettere i settere
//konstruktore
//metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//metodu stampaj koja stampa podatke u formatu:
//		(naziv predmeta) - (ocena)
//		Student: ime i prezime, broj indeksa
//		Profesor: ime i prezime
//
//	U glavnoj klasi:
//kreirati niz od 5 zelenih kartona za ispite i odstampati podatke za sve ispite
//Zatim program pronalazi i ispisuje prosecnu ocenu za sve ispite
public class Zadatak2 {
    public static void main(String[] args) {
        ArrayList<ZeleniKarton> ispiti = new ArrayList<>();
        int suma = 0;
        double prosek = 0;

        ispiti.add(new ZeleniKarton("Jovana Markovic", 125, "Rimsko pravo", "Lazar Petrovic", 6));
        ispiti.add(new ZeleniKarton("Marija Jovic", 120, "Gradjansko pravo", "Jovan Peric", 10));
        ispiti.add(new ZeleniKarton("Branko Brankovic", 80, "Rimsko pravo", "Lazar Petrovic", 8));
        ispiti.add(new ZeleniKarton("Jovana Markovic", 125, "Krivicno pravo", "Djordje Jankovic", 7));
        ispiti.add(new ZeleniKarton("Branko Brankovic", 80, "Krivicno pravo", "Djordje Jankovic",5));

        for (int i = 0; i < ispiti.size(); i++) {
            ispiti.get(i).stampaj();
        }


        for (int i = 0; i < ispiti.size(); i++) {
            suma = suma + ispiti.get(i).getOcena();
        }
        prosek = 1.0 * suma / ispiti.size();
        System.out.println("Prosek: " + prosek);
    }


}
