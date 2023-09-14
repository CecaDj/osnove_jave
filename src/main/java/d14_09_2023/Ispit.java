package d14_09_2023;

public class Ispit {
    private String nazivPredmeta;
    private int ocena;
    private String profesor;

    public Ispit() {
    }

    public Ispit(String nazivPredmeta, int ocena, String profesor) {
        this.nazivPredmeta = nazivPredmeta;
        this.ocena = ocena;
        this.profesor = profesor;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }
    public boolean polozenIspit(){
        if (this.ocena > 5) {
            return true;
        } else {
            return false;
        }
    }

    public void stampaj(){
        System.out.println(this.nazivPredmeta + " - " + this.profesor + " - " + this.ocena);
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
}
