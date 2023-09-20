package d19_09_2023;

public class SuperKartica {
    private int broj;
    private String punoIme;
    private double popust;

    public SuperKartica() {
    }

    public SuperKartica(int broj, String punoIme, double popust) {
        this.broj = broj;
        this.punoIme = punoIme;
        this.popust = popust;
    }

    public void stampaj(){
        System.out.println("Broj kartice: " + this.broj + ", Ime i prezime: " + this.punoIme);
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public double getPopust() {
        return popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }
}
