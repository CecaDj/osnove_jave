package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    //Napisati program koji ucitava niz A duzine N,
    // i koji nakon unosa niz A stampa sve elemente niza koji su veci od nule.
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Unesite n:");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj:");
            int newNumber = s.nextInt();
            numbers.add(newNumber);
        }

        System.out.println("Brojevi veci od nule u nizu su: ");
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) > 0) {
                System.out.print(numbers.get(i) + ", ");
            }
        }
    }
}
