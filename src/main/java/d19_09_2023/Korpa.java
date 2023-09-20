package d19_09_2023;

import java.util.ArrayList;

public class Korpa {
    private ArrayList<Ambalaza> ambalaze;

    public Korpa() {
        this.ambalaze = new ArrayList<>();
    }
    public void dodajAmbalazu(Ambalaza ambalaza){
        this.ambalaze.add(ambalaza);
    }

    public void izbaciAmbalazu(String barkod){

        for (int i = 0; i < this.ambalaze.size(); i++) {
            if (this.ambalaze.get(i).getBarkod().equals(barkod)){
                this.ambalaze.remove(i);
            }
        }
    }

    private ArrayList<Double> ceneSaPopustom(double popust){
       ArrayList<Double> cene = new ArrayList<>();

        for (int i = 0; i < this.ambalaze.size(); i++) {
            double cena = this.ambalaze.get(i).cena() - popust;
            cene.add(cena);
        }
        return cene;
    }
    public double ukupnaCenaKorpe(SuperKartica kartica){
        double ukupno = 0;
        ArrayList<Double> cene = new ArrayList<>();
        cene = ceneSaPopustom(kartica.getPopust());

        for (int i = 0; i < cene.size(); i++) {
            ukupno += cene.get(i);
        }
        return ukupno;
    }

    public ArrayList<Ambalaza> getAmbalaze() {
        return ambalaze;
    }
}
