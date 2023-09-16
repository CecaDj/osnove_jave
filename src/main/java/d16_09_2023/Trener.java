package d16_09_2023;

public class Trener extends Osoba{
    private int godineIskustva;
    private String tipTrenera;

    public Trener() {
        super();
    }

    public Trener(String punoIme, String jmbg, int godinaRodjenja, int godineIskustva, String tipTrenera) {
        super(punoIme, jmbg, godinaRodjenja);
        this.godineIskustva = godineIskustva;
        this.tipTrenera = tipTrenera;
    }
    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Godine iskustva: " + this.godineIskustva + ", Tip: " + this.tipTrenera);
        System.out.println();
    }

    public int getGodineIskustva() {
        return godineIskustva;
    }

    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }

    public String getTipTrenera() {
        return tipTrenera;
    }

    public void setTipTrenera(String tipTrenera) {
        this.tipTrenera = tipTrenera;
    }
}
