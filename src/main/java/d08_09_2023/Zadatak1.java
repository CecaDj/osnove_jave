package d08_09_2023;
//Napisati klasu Proizvod koja ima atribute
//    //naziv proizvoda (String)
//    //cenu proizvoda (double)
//    //težinu proizvoda u gramima. (double)
//    //	i metode:
//    //stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//    //povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu.
//    //Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//    //vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust,a povratnu vrednost je cena proizvoda kada se uračuna popust.
//    // Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
//    // Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
//    //racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe.
//    //za tezinu do 100g, postarina iznosi 200din
//    //za tezinu od 101g do 500g, postarina iznosi 400din
//    //za tezinu preko 500g, postarina iznosi 1000din
//    //U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.

public class Zadatak1 {

    public static void main(String[] args) {

        Proizvod proizvod = new Proizvod();
        proizvod.naziv = "Cokolada";
        proizvod.cena = 300;
        proizvod.tezina = 200;

        Proizvod proizvod2 = new Proizvod();
        proizvod2.naziv = "Cips";
        proizvod2.cena = 200;
        proizvod2.tezina = 120;

        proizvod.stampaj();
        proizvod2.stampaj();

        proizvod.povecajCenu(20);
        proizvod2.povecajCenu(50);

        proizvod.vratiCenuSaPopustom(10);
        proizvod2.vratiCenuSaPopustom(50);

        proizvod.racunajPostarinu();
        proizvod2.racunajPostarinu();


    }
}
