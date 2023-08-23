package d22_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    //Napisati program koji sabira brojeve koje korisnik unosi, pritom da suma ne predje 100.
    // Na kraju programa ispisati sracunatu sumu.
    //Unesite vrednost: 20
    //Unesite vrednost: 50
    //Unesite vrednost: 50
    //Prekoracenje! Kraj programa. Sracunata suma je 70.
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        boolean isOver100 = false;
        int suma = 0;

        while(!isOver100) {
            System.out.println("Unesite vrednost:");
            int number = s.nextInt();

            if (suma + number > 100) {
                isOver100 = true;
            } else {
                suma = suma + number;
            }
        }
        System.out.println("Prekoracenje! Kraj programa. Sracunata suma je " + suma);
    }
}
