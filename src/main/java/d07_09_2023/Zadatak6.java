package d07_09_2023;

public class Zadatak6 {

    public static void main(String[] args) {
         Vozilo vozilo = new Vozilo();
         vozilo.marka = "Fiat";
         vozilo.model = "Punto";
         vozilo.godinaProizvodnje = 2010;
         vozilo.registarskiBroj = "NS123-AA";

         Vozac vozac = new Vozac();
         vozac.imeIPrezime = "Petar Petrovic";
         vozac.jmbg = "1234567890000";
         vozac.brojVozackeDozvole = "1234578";
         vozac.datumIstekaDozvole = "10.10.2024.";

         Ruta ruta = new Ruta();
         ruta.polaznaTacka = "Petra Petrovica 8";
         ruta.odrediste = "Marka Markovica 10a";
         ruta.duzina = 10;
         ruta.ocekivanoVremePutovanja = "15 min";
    }
}
