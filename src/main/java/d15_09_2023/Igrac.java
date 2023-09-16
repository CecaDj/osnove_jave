package d15_09_2023;

import java.util.ArrayList;

public class Igrac extends Osoba {
    private int broj;
    private String pozicija;
    private ArrayList<Karton> kartoni;
    private boolean kapiten;

    public Igrac() {
        super();
        this.kartoni = new ArrayList<>();
    }

    public Igrac(String punoIme, String jmbg, int godinaRodjenja, int broj, String pozicija, boolean kapiten) {
        super(punoIme, jmbg, godinaRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.kartoni = new ArrayList<>();
        this.kapiten = kapiten;
    }

    public void dodajKarton(Karton karton){
        this.kartoni.add(karton);
    }

    public int brZutihKartona(){
        int counter = 0;
        for (int i = 0; i < this.kartoni.size(); i++) {
            if (kartoni.get(i).getTip().equals("zuti")){
                counter++;
            }
        }
        return counter;
    }

    public int brCrvenihKartona(){
        int counter = 0;
        for (int i = 0; i < this.kartoni.size(); i++) {
            if (kartoni.get(i).getTip().equals("crveni")) {
                counter++;
            }
        }
        return counter;
    }
    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Broj: " + this.broj + ", Pozicija: " + this.pozicija + ", Kapiten: " + this.kapiten +
                 ", Broj zutih kartona: " + this.brZutihKartona() + ", Broj crvenih kartona: " + this.brCrvenihKartona());
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

    public ArrayList<Karton> getKartoni() {
        return kartoni;
    }
}
