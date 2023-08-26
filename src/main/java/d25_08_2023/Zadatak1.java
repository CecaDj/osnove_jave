package d25_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    //Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
    // Iz main-a pozvati izvrsenje metode za razlicite vrednosti.
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost:");
        int vrednost = s.nextInt();

        stampajVrednostZa10Vecu(vrednost);
    }

    public static void stampajVrednostZa10Vecu(int broj) {

        System.out.println("Vrednost " + broj + " uvecana za 10 iznosi: " + (broj + 10));
    }
}
