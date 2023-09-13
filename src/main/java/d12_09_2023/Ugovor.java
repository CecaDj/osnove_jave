package d12_09_2023;
//Zadatak
//Za potrebe agencije za nekretnine kreirati  klasu FizickoLice koje ima:
//ime i prezime
//broj licne karte
//jmbg
//podatak da li je osoba vec jednom kupovala nekretninu preko agencije (boolean)
//konstuktore
//gettere i settere, jmbg ne sme da se menja
//metodu stampaj, koja stmpa podatke u formatu:
//ime i prezime, broj licne karte
//
//	Kreirati klasu Ugovor koja ima:
//godinu, dan i mesec sklapanja ugovora
//osobu koja prodaje nekretninu (fizicko lice)
//osobu koja kupuje nekretninu (fizicko lice)
//cenu za koju se prodaje nekretnina
//adresu nekretnine (ulica br., grad)
//metodu koja vraca procenat zarade
//za osobu koja je vec kupovale nekretninu preko agencije je 0.02 dok je za one koji nisu 0.03
//metodu koja racuna zaradu agencije pri prodaji nekretninte koja ukljucujei poreze, takse i usluge agencije, prema formuli:
//1000 + cena za koju se prodaje * procenat zarade
//metodu koja stampa ugovor u formatu:
//Dana (dan.mesec.godina.)god sklopljen je ugovor izmedju (print prodavca) i (print kupca) o kupovini nekretnine (adresa)
// po ceni od (cena nekretnin) pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od (zarada agencije)
public class Ugovor {
    private String datum;
    private FizickoLice prodavac;
    private FizickoLice kupac;
    private double cena;
    private String adresa;

    public Ugovor(FizickoLice prodavac, FizickoLice kupac, String adresa){
        this.prodavac = prodavac;
        this.kupac = kupac;
        this.adresa = adresa;
    }
    public Ugovor(String datum, FizickoLice prodavac, FizickoLice kupac, double cena, String adresa){
        this.datum = datum;
        this.prodavac = prodavac;
        this.kupac = kupac;
        this.cena = cena;
        this.adresa = adresa;
    }

    public double procenatZarade(){
        if (this.kupac.getPrethodnaKupovina()){
            return 0.02;
        } else {
            return 0.03;
        }
    }
    public double zaradaAgencije(){
        return 1000 + this.cena * this.procenatZarade();
    }

    public void stampajUgovor(){
        System.out.print("Dana " + this.datum + " sklopljen je ugovor izmedju ");
        this.prodavac.stampaj();
        System.out.print(" i ");
        this.kupac.stampaj();
        System.out.print(" o kupovini nekretnine " + this.adresa + " po ceni od " + this.cena + "dinara pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od " + this.zaradaAgencije() + " dinara");
    }


    public String getDatum(){
        return this.datum;
    }
    public void setDatum(String datum){
        this.datum = datum;
    }
    public FizickoLice getProdavac(){
        return this.prodavac;
    }
    public FizickoLice getKupac(){
        return this.kupac;
    }
    public double getCena(){
        return this.cena;
    }
    public void setCena(double cena){
        this.cena = cena;
    }
    public String getAdresa(){
        return this.adresa;
    }
}
