package d19_09_2023;

public class Tetrapak extends Ambalaza{
    private boolean reciklaza;
    private double osnovnaCena;

    public Tetrapak() {
        super();
    }

    public Tetrapak(String barkod, String naziv, double netoTezina, double brutoTezina, boolean reciklaza, double osnovnaCena) {
        super(barkod, naziv, netoTezina, brutoTezina);
        this.reciklaza = reciklaza;
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cena() {
        if (this.reciklaza) {
            return this.tezinaPakovanja() * 1.5 + this.osnovnaCena;
        } else {
         return  this.osnovnaCena;
        }
    }

    @Override
    public void stampaj() {
        System.out.println("Barkod: " + this.barkod + " Naziv: " + this.naziv);
        System.out.println("Tezina pakovanja: " + this.tezinaPakovanja());
        System.out.println("Da li se moze reciklirati: " + this.reciklaza + ", Cena: " + this.cena());
    }

    public boolean isReciklaza() {
        return reciklaza;
    }

    public void setReciklaza(boolean reciklaza) {
        this.reciklaza = reciklaza;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }
}
