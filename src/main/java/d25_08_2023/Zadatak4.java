package d25_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    //Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
    //Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
    /// / / / /
    //Napomena: Metoda nista ne vraca.
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite n:");
        int n = s.nextInt();
        System.out.println("Unesite karakter:");
        String karakter = s.next();

        stampajKaraktere(n, karakter);

    }
    public static void stampajKaraktere (int n, String karakter) {

        for (int i = 0; i < n; i++) {
            System.out.print(karakter + " ");
        }
    }
}
