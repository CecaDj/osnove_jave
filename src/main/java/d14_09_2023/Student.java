package d14_09_2023;

import java.util.ArrayList;

public class Student {
    private int brIndeksa;
    private String punoIme;
    private String tipStudija;
    private ArrayList<Ispit> ispiti;

    public Student() {
        this.ispiti = new ArrayList<>();
    }

    public Student(int brIndeksa, String punoIme, String tipStudija) {
        this.brIndeksa = brIndeksa;
        this.punoIme = punoIme;
        this.tipStudija = tipStudija;
        this.ispiti = new ArrayList<>();
    }

    public void dodajIspit (Ispit ispit){
        this.ispiti.add(ispit);
    }

    public double izracunajProsek() {
        double suma = 0;
        int counter = 0;

        for (int i = 0; i < this.ispiti.size(); i++) {
            if (this.ispiti.get(i).polozenIspit()) {
                suma = suma + this.ispiti.get(i).getOcena();
                counter++;
            }
        }
        return suma / counter;
    }

    public void stampaj(){
        System.out.println(this.brIndeksa + " - " + this.punoIme + " - " + this.tipStudija);
        for (int i = 0; i < this.ispiti.size(); i++) {
            this.ispiti.get(i).stampaj();
        }
        System.out.println("Prosecna ocena: " + izracunajProsek());
    }


    public int getBrIndeksa() {
        return brIndeksa;
    }

    public void setBrIndeksa(int brIndeksa) {
        this.brIndeksa = brIndeksa;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }
    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }
}
