package d15_09_2023;
//Kreirati klasu Karton koja ima:
//tip kartona (crveni, zuti)
//konstuktore za koje mislite da ce vam trebati
//gettere i settere za karton
//
//Kreirati klasu Osoba koja ima:
//ime i prezime
//jmbg
//godinu rodjenja
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere
//metodu stampaj koja stampa u formatu:
//(ime i prezime), (jmbg), (godina rodjenja)
//
//Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//broj (broj koji igrac nosi)
//poziciju koju igra (odbrambeni, napadac, … )
//niz kartona
//kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere za broj, kapiten i poziciju
//metodu dodaj karton, gde se dodaje karton u niz
//metodu koja vraca broj zutih kartona
//metodu koja vraca broj crvenih kartona
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//
//U glavnom programu kreirati igraca i dodati mu nekoliko kartona.

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {

        Igrac igrac = new Igrac("Marko Markovic", "120899225645", 2001,8,"golman", false);

        Karton karton1 = new Karton("crveni");
        Karton karton2 = new Karton("zuti");

        igrac.dodajKarton(karton1);
        igrac.dodajKarton(karton2);
        igrac.dodajKarton(new Karton("zuti"));
        igrac.dodajKarton(new Karton("zuti"));
        igrac.dodajKarton(new Karton("crveni"));

        igrac.stampaj();

    }
}
