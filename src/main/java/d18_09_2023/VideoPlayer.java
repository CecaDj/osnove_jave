package d18_09_2023;

public class VideoPlayer {
    private int duzina;
    private int trenutnoVreme;
    private int jacinaZvuka;
    private int kvalitet;

    public VideoPlayer() {
    }

    public VideoPlayer(int duzina, int trenutnoVreme, int jacinaZvuka, int kvalitet) {
        this.duzina = duzina;
        this.trenutnoVreme = trenutnoVreme;
        this.jacinaZvuka = jacinaZvuka;
        this.kvalitet = kvalitet;
    }

    public void stampaj(){
        System.out.println("Trenutno vreme: " + this.trenutnoVreme);
        System.out.println("Jacina zvuka: " + this.jacinaZvuka);
        System.out.println("Kvalitet: " + this.kvalitet);
    }

    public int getDuzina() {
        return duzina;
    }

    public void setDuzina(int duzina) {
        this.duzina = duzina;
    }

    public int getTrenutnoVreme() {
        return trenutnoVreme;
    }

    public void setTrenutnoVreme(int trenutnoVreme) {
        this.trenutnoVreme = trenutnoVreme;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public void setJacinaZvuka(int jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public int getKvalitet() {
        return kvalitet;
    }

    public void setKvalitet(int kvalitet) {
        this.kvalitet = kvalitet;
    }
}
