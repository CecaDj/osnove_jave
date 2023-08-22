package d21_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    //Napisati program koji vodi evidenciju koliko je uneto sledecih reakcija.
    // Korisnik unosi N rekacija zatim se prikazuje evidencija:
    //Program podrzava sledece reakcije:
    //like
    //smile
    //heart
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite n:");
        int n = s.nextInt();
        int heartCounter = 0;
        int likeCounter = 0;
        int smileCounter = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Reaguj:");
            String reakcija = s.next();

            if (reakcija.equals("heart")) {
                heartCounter = heartCounter + 1;
            } else if (reakcija.equals("like")) {
                likeCounter = likeCounter + 1;
            } else if (reakcija.equals("smile")) {
                smileCounter = smileCounter + 1;
            }

        }
        System.out.println("Summary: like " + likeCounter + " | smile " + smileCounter + " | heart " + heartCounter);
    }
}
