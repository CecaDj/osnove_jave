package d16_09_2023;

public class Igrac extends Osoba{
    private int broj;
    private String pozicija;
    private boolean kapiten;

    public Igrac() {
        super();
    }
    public Igrac(String punoIme, String jmbg, int godinaRodjenja, int broj, String pozicija, boolean kapiten) {
        super(punoIme, jmbg, godinaRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
    }
    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Broj: " + this.broj + ", Pozicija: " + this.pozicija + ", Kapiten: " + this.kapiten);
        System.out.println();
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }
}
