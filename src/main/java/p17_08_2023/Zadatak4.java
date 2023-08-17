package p17_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite a: ");
        int a = s.nextInt();

        System.out.println("Unesite b: ");
        int b = s.nextInt();

        if(b < a) {
            System.out.println("Broj " + b + " je manji od broja " + a);
        }

        if(a < b) {
            System.out.println("Broj " + b + " nije manji od broja " + a);
        }
    }
}
