package d12_09_2023;

public class Transakcija {
    private String id;
    private Racun uplatilac;
    private Racun primalac;

    public Transakcija(){
    }
    public Transakcija(String id, Racun uplatilac, Racun primalac){
        this.id = id;
        this.uplatilac = uplatilac;
        this.primalac = primalac;
    }

    public double izracunajProviziju(double iznos){
        if (iznos < 4500){
            return 45;
        } else {
            return iznos / 100;
        }
    }

    public void izvrsiTransakciju(double iznos){
        this.uplatilac.skiniSaRacuna(iznos + izracunajProviziju(iznos));
        this.primalac.uplatiNaRacun(iznos);
    }

    public void stampaj(){
        System.out.println("ID: " + this.id);
        System.out.print("Racun sa: ");
        this.uplatilac.stampaj();
        System.out.print("Racun na: ");
        this.primalac.stampaj();

    }

    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Racun getUplatilac() {
        return this.uplatilac;
    }

    public void setUplatilac(Racun uplatilac) {
        this.uplatilac = uplatilac;
    }

    public Racun getPrimalac() {
        return this.primalac;
    }

    public void setPrimalac(Racun primalac) {
        this.primalac = primalac;
    }
}
