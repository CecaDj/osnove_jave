package d08_09_2023;
//Kreirati klasu FacebookPost koja ima:
//   Od atributa:
//ime i prezime korisnika koji je objavio post
//ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//tekst objave
//broj lajkova
//broj deljenja
//  Od metoda:
//like(), koja povecava broj lajkova za 1.
//dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//share(), koja povecava broj deljenja za 1
//print(), koja stampa objavu u formatu:
//(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//(tekst objave)
//Likes (broj lajkova) | Shares (broj deljenja)
//
//U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
public class Zadatak2 {

    public static void main(String[] args) {

        FacebookPost post = new FacebookPost();
        post.userShare = "Petar Petrovic";
        post.userProfile = "Marko Markovic";
        post.likes = 0;
        post.shares = 10;
        post.message = "Cao!";

        FacebookPost post2 = new FacebookPost();
        post2.userShare = "Jovana Jovic";
        post2.userProfile = "Marija Maric";
        post2.message = "Hi!";
        post2.likes = 15;
        post2.shares = 1;

        post.share();
        post2.share();

        post.like();
        post2.like();

        post.dislike();
        post2.dislike();

        post.print();
        post2.print();
    }
}
