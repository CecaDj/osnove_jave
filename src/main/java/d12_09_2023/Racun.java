package d12_09_2023;

public class Racun {
    private String brRacuna;
    private String klijent;
    private double stanje;

    public Racun(double stanje){
        this.stanje = stanje;
    }
    public Racun(String brRacuna, String klijent, double stanje){
        this.brRacuna = brRacuna;
        this.klijent = klijent;
        this.stanje = stanje;
    }

    public void uplatiNaRacun(double uplata){
        this.stanje = this.stanje + uplata;
    }
    public void skiniSaRacuna(double isplata){
        this.stanje = this.stanje - isplata;
    }

    public void stampaj(){
        System.out.println(this.klijent + " - Broj racuna: " + this.brRacuna);
        System.out.println("Stanje na racunu je: " + this.stanje + " rsd.");
    }

    public String getBrRacuna(){
        return this.brRacuna;
    }
    public void setBrRacuna(String brRacuna){
        this.brRacuna = brRacuna;
    }
    public String getKlijent(){
        return this.klijent;
    }
    public void setKlijent(String klijent){
        this.klijent = klijent;
    }
    public double getStanje(){
        return this.stanje;
    }
}
