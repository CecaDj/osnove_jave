package d07_09_2023;

public class Zadatak2 {
    //Napišite klasu "Automobil" sa atributima: marka (String), model (String) i godinaProizvodnje (int).
    // U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti. Ispisati informacije o automobilima.
    public static void main(String[] args) {

        Automobil prvi = new Automobil();
        prvi.marka = "Nissan";
        prvi.model = "Micra";
        prvi.godinaProizvodnje = 2004;

        Automobil drugi = new Automobil();
        drugi.marka = "Toyota";
        drugi.model = "Yaris";
        drugi.godinaProizvodnje = 2009;

        Automobil treci = new Automobil();
        treci.marka = "Fiat";
        treci.model = "500";
        treci.godinaProizvodnje = 2016;

        System.out.println("Automobil: " + prvi.marka + ", " + prvi.model + ", " + prvi.godinaProizvodnje);
        System.out.println("Automobil: " + drugi.marka + ", " + drugi.model + ", " + drugi.godinaProizvodnje);
        System.out.println("Automobil: " + treci.marka + ", " + treci.model + ", " + treci.godinaProizvodnje);


    }
}
