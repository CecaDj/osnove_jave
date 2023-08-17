package p17_08_2023;

import java.util.Scanner;

public class Zadatak6 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite a: ");
        int a = s.nextInt();

        System.out.println("Unesite b: ");
        int b = s.nextInt();

        System.out.println("Unesite c: ");
        int c = s.nextInt();

        if (a < 0) {
            System.out.println("Unet broj a nije validan.");
        }
        if (b < 0) {
            System.out.println("Unet broj b nije validan.");
        }
        if (c < 0) {
            System.out.println("Unet broj c nije validan.");
        }


    }
}
