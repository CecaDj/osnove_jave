package d15_08_2023;

public class Zadatak10 {
//Napisati program koji izracunava velicinu slike na temelju dostupnih podataka.
// Program cuva sledece informacije o slici:
//Naziv slike
//Rezoluciju (duzina i visina)
//Na osnovu rezolucije, program racuna ukupan broj piksela u slici. Svaki piksel zauzima 1b (bajt).
//Teorijski primer: ako je rezolucija slike 20x10, tada slika sadrzi ukupno 200 piksela, čime je njena velicina 200b.
//Nakon toga, program treba da prikaze velicinu slike izrazenu u kilobajtima (kb) i megabajtima (mb), uzimajuci u obzir sledece konverzije:
//1 kb = 1024b
//1 Mb= 1024 kb

    public static void main(String[] args) {

        String nazivSlike = "profile-image.log";
        int duzinaSlike = 1920, visinaSlike = 1080;
        double velicinaKb = duzinaSlike * visinaSlike / 1024;
        double velicinaMb = velicinaKb / 1024;

        System.out.println("File: " + nazivSlike);
        System.out.println("Resolution: " + duzinaSlike + "x" + visinaSlike);
        System.out.println("Size (kb): " + velicinaKb);
        System.out.println("Size (Mb): " + velicinaMb);
    }
}
