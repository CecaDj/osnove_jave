package d11_09_2023;

public class FacebookPost {
    //Kreirati klasu Korisnik koja ima
    //ime
    //prezime
    //gettere i settere za ime i prezime
    //konstuktore koje mislite da su vam potrebni
    //metoda koja stampa u formatu:
    //(ime) (prezime)
    //
    //Kreirati klasu FacebookPost
    //opis
    //korisnik (referenca na korisnika koji je kreirao post)
    //konstrukore koje mislite da su vam potrebni
    //metoda print, stampa u formatu:
    //(ime) (prezime)
    //(opis post-a)
    //
    //U main metodi, kreirati jedan facebook post i jednog korisnika i pozvati svaku od metoda
    private String opis;
    private Korisnik korisnik;

    public FacebookPost(Korisnik korisnik){
        this.korisnik = korisnik;
    }

    public FacebookPost(String opis, Korisnik korisnik){
        this.opis = opis;
        this.korisnik = korisnik;
    }

    public void stampaj() {
        this.korisnik.stampaj();
        System.out.println(this.opis);
    }

    public String getOpis(){
        return this.opis;
    }

    public void setOpis(String opis){
        this.opis = opis;
    }
}
