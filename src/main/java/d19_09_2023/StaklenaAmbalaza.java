package d19_09_2023;

public class StaklenaAmbalaza extends Ambalaza{
    private double kaucija;
    private boolean placaKaucija;
    private double osnovnaCena;

    public StaklenaAmbalaza() {
        super();
    }

    public StaklenaAmbalaza(String barkod, String naziv, double netoTezina, double brutoTezina, double kaucija, boolean placaKaucija, double osnovnaCena) {
        super(barkod, naziv, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.placaKaucija = placaKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cena() {
        if (placaKaucija) {
            return this.osnovnaCena * 1.2 + this.kaucija;
        } else {
            return this.osnovnaCena * 1.2;
        }
    }

    @Override
    public void stampaj() {
        System.out.println("Barkod: " + this.barkod + " Naziv: " + this.naziv);
        System.out.println("Tezina pakovanja: " + this.tezinaPakovanja());
        System.out.println("Kaucija: " + this.kaucija + ", Cena: " + this.cena());
    }

    public double getKaucija() {
        return kaucija;
    }

    public void setKaucija(double kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isPlacaKaucija() {
        return placaKaucija;
    }

    public void setPlacaKaucija(boolean placaKaucija) {
        this.placaKaucija = placaKaucija;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }
}
