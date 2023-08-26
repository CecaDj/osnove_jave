package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    // Napisati program koji u sebi ima definisan niz od 10 broja (brojevi su proizvoljni)
    // i koji menja vrednost elementa na pozciji K. K i novu vrednost unosi korisnik.
    //Primer:
    //Unesite pozicjiu od 0 do 9: 3
    //Unesite novu vrednost: 11
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
        numbers.add(80);
        numbers.add(90);
        numbers.add(100);

        System.out.println("Unesite poziciju elementa:");
        int index = s.nextInt();
        System.out.println("Unesite novu vrednost:");
        int newInput = s.nextInt();

        numbers.set(index, newInput);
        System.out.println(numbers);
    }
}
