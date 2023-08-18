package d17_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    //Napisati program koji proverava da li je kliknuto u okviru login forme za web stranicu.
    // Korisnik unosi x i y koordinate za T1, T2 i M. Ispisati odgovarajuce poruke.

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite koordinatu X1 za T1:");
        int x1 = s.nextInt();

        System.out.println("Unesite koordinatu Y1 za T1:");
        int y1 = s.nextInt();

        System.out.println("Unesite koordinatu X2 za T2:");
        int x2 = s.nextInt();

        System.out.println("Unesite koordinatu Y2 za T2:");
        int y2 = s.nextInt();

        System.out.println("Unesite koordinatu X3 za M:");
        int x3 = s.nextInt();

        System.out.println("Unesite koordinatu Y3 za M:");
        int y3 = s.nextInt();

        if (((x3 >= x1 && x3 <= x2) || (x3 >= x2 && x3 <= x1)) && ((y3 >= y1 && y3 <= y2) || (y3 >= y2 && y3 <= y1))) {
            System.out.println("Kliknuto je unutar forme.");
        } else {
            System.out.println("Nije kliknuto unutar forme.");
        }

    }
}
