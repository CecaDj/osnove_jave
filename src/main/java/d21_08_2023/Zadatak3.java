package d21_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    //Napisati program koji simulira ponasanje speak loud programa.
    // Korisnik unosi N reci a program ispisuje svaku rec na ekranu tako da zadovolji uslov:
    //ako se u unetom tekstu sadrzi ! onda ga ispise tako kako je unet
    //ako se ne sadrzi, program dostampa na kraju
    //	Nakon toga program ispisuje nivo agresivnosti u komunikaciji (u procentima).
    //	Svaka uneta rec sa ! utice na agresivnost.
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite n:");
        int n = s.nextInt();
        int brojac = 0;
        double agresivnost = 0.0;

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite tekst:");
            String tekst = s.next();

            if (tekst.contains("!")) {
                System.out.println(tekst);
                brojac = brojac + 1;
            } else {
                System.out.println(tekst + "!");
            }

        }
        agresivnost = 1.0 * brojac / n * 100;
        System.out.println("Nivo agresivnosti " + agresivnost + "%");
    }
}
