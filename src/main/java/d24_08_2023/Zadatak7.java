package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak7 {
    // (Za vezbanje) Napisati program koji ucitava niz a duzine N.
    // Nakon unosa niza a, formira se niz b tako sto se prva 3 elementa niza a kopiraju u niz b,
    //a ostale elemente niza b ispuniti jedinicama.(niz b je iste duzine kao i niz a)
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> numbersA = new ArrayList<>();
        ArrayList<Integer> numbersB =new ArrayList<>();

        System.out.println("Unesite n:");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj:");
            int newNumber = s.nextInt();
            numbersA.add(newNumber);
        }

        for (int i = 0; i < numbersA.size(); i++) {
            if(i < 3) {
                numbersB.add(numbersA.get(i));
            } else {
                numbersB.add(1);
            }
        }

        System.out.print("Niz A: ");
        for (int i = 0; i < numbersA.size(); i++) {
            System.out.print(numbersA.get(i) + ", ");
        }
        System.out.print("Niz B: ");

        for (int i = 0; i < numbersB.size(); i++) {
            System.out.print(numbersB.get(i) + ", ");

        }
    }
}
