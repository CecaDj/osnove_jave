package d12_09_2023;
//Kreirati klasu ZeleniKarton koja ima:
//ime i prezime studenta
//broj indeksa
//naziv predmeta
//ime i prezime profesora
//ocenu - od 5 do 10
//gettere i settere
//konstruktore
//metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//metodu stampaj koja stampa podatke u formatu:
//		(naziv predmeta) - (ocena)
//		Student: ime i prezime, broj indeksa
//		Profesor: ime i prezime
//
//	U glavnoj klasi:
//kreirati niz od 5 zelenih kartona za ispite i odstampati podatke za sve ispite
//Zatim program pronalazi i ispisuje prosecnu ocenu za sve ispite
public class ZeleniKarton {
    private String punoImeStudenta;
    private int brIndeksa;
    private String nazivPredmeta;
    private String profesor;
    private int ocena;

    public ZeleniKarton(int brIndeksa){
        this.brIndeksa = brIndeksa;
    }

    public ZeleniKarton(String punoImeStudenta, int brIndeksa, String nazivPredmeta, String profesor, int ocena){
        this.punoImeStudenta = punoImeStudenta;
        this.brIndeksa = brIndeksa;
        this.nazivPredmeta = nazivPredmeta;
        this.profesor = profesor;
        this.ocena = ocena;
    }

    public boolean daLiJeIspitPolozen(){
        if(this.ocena > 5){
            return true;
        } else {
            return false;
        }
    }
    public void stampaj(){
        System.out.println("Predmet: " + this.nazivPredmeta + " - Ocena: " + this.ocena);
        System.out.println("Student: " + this.punoImeStudenta + ", Broj indeksa: " + this.brIndeksa);
        System.out.println("Profesor: " + this.profesor);
        System.out.println();
    }


    public String getPunoImeStudenta(){
        return this.punoImeStudenta;
    }
    public void setPunoImeStudenta(String punoImeStudenta){
        this.punoImeStudenta = punoImeStudenta;
    }
    public int getBrIndeksa(){
        return this.brIndeksa;
    }
    public String getNazivPredmeta(){
        return this.nazivPredmeta;
    }
    public void setNazivPredmeta(String nazivPredmeta){
        this.nazivPredmeta = nazivPredmeta;
    }
    public String getProfesor(){
        return this.profesor;
    }
    public void setProfesor(String profesor){
        this.profesor = profesor;
    }
    public int getOcena(){
        return this.ocena;
    }
    public void setOcena(int ocena){
        this.ocena = ocena;
    }

}
