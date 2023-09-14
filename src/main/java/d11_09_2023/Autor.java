package d11_09_2023;

public class Autor {
    //Kreirati klasu Autor koja ima
    //-ime i prezime
    //-konstuktore koje mislite da su vam potrebni
    //-gettere i settere za atribute
    //-metodu print koja stampa u formatu:
    //(ime autora) (prezime autora)
    //
    //Kreirati klasu Knjiga koji ima:
    //-ISBN
    //-naziv
    //-godina izdanja
    //-autor
    //-konstuktore koje mislite da su vam potrebni
    //-gettere i settere za atribute
    //-metodu print koja stampa u formatu (izbegavati dupliranje koda):
    //(ISBN)
    //(naziv) - (godina izdanja)
    //autor: (ime autora) (prezime autora)
    //
    //	U glavnom programu napraviti vise autora sa vise knjiga.
    private String ime;
    private String prezime;

    public Autor(){

    }
    public Autor(String ime, String prezime) {
     this.ime = ime;
     this.prezime = prezime;
    }

    public void stampaj(){
        System.out.println(this.ime + " " + this.prezime);
    }

    public String getIme(){
        return this.ime;
    }
    public void setIme(String ime){
        this.ime = ime;
    }
    public String getPrezime(){
        return this.prezime;
    }
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

}
