package d11_09_2023;
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

public class Knjiga {
    private String isbn;
    private String naziv;
    private int godina;
    private Autor autor;

    public Knjiga(){

    }
    public Knjiga(String isbn, String naziv, int godina, Autor autor) {
        this.isbn = isbn;
        this.naziv = naziv;
        this.godina = godina;
        this.autor = autor;
    }

    public void stampaj(){
        System.out.println(this.isbn);
        System.out.println(this.naziv + " - " + this.godina);
        if(autor != null){
            System.out.println(this.autor.getIme() + " " + this.autor.getPrezime());
            System.out.println();
        }
    }

    public String getIsbn(){
        return this.isbn;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public String getNaziv(){
        return this.naziv;
    }
    public void setNaziv(String naziv){
        this.naziv = naziv;
    }
    public int getGodina(){
        return this.godina;
    }
    public void setGodina(int godina){
        this.godina = godina;
    }

    public Autor getAutor(){
        return  this.autor;
    }
    public void setAutor(Autor autor){
        this.autor = autor;
    }

}
