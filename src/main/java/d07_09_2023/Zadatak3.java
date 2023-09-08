package d07_09_2023;

public class Zadatak3 {
    //Napišite klasu "Proizvod" sa atributima: naziv (String) i cena (double).
    // U glavnoj metodi kreirajte 3 objekta ove klase i postavite im vrednosti. Ispisati informacije o proizvodima.
    public static void main(String[] args) {
        Proizvod prvi = new Proizvod();
        prvi.naziv = "Chips";
        prvi.cena = 200.0;

        Proizvod drugi = new Proizvod();
        drugi.naziv = "Snickers";
        drugi.cena = 100.2;

        Proizvod treci = new Proizvod();
        treci.naziv = "Guarana";
        treci.cena = 100.5;

        System.out.println("Proizvod: " + prvi.naziv + ", " + prvi.cena);
        System.out.println("Proizvod: " + drugi.naziv + ", " + drugi.cena);
        System.out.println("Proizvod: " + treci.naziv + ", " + treci.cena);

    }
}
