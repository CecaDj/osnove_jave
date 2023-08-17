package p17_08_2023;

import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite prvi broj: ");
        double a = s.nextDouble();

        System.out.print("Unesite drugi broj: ");
        double b = s.nextDouble();

        System.out.print("Unesite treci broj: ");
        double c = s.nextDouble();

        double srednjaVrednost = (a + b + c) / 3;

        System.out.println("Srednja vrednost je: " + srednjaVrednost );
    }
}
