package p17_08_2023;

import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite dan: ");
        int dan = s.nextInt();

        System.out.print("Unesite mesec: ");
        int mesec = s.nextInt();

        System.out.print("Unesite godinu: ");
        int godina = s.nextInt();

        // String datum = dan + "-" + mesec + "-" + godina;

        System.out.println(dan + "-" + mesec + "-" + godina);

    }
}
