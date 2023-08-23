package d22_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    //Napisati program koji ucitava brojeva od korisnika i za svaki broj prikazuje apsolutnu vrednost
    // sve dok se ne unese nula.
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int number = 1;

        while (number!=0) {
            System.out.println("Unesite broj:");
            number = s.nextInt();

            if (number > 0) {
                System.out.println("Apsolutna vrednost je " + number);
            } else if (number < 0){
                System.out.println("Apsolutna vrednost je "  + -number);
            }
        }
        System.out.println("Kraj programa jer je uneta nula.");
    }
}
