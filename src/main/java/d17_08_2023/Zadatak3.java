package d17_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    //Napisati program koji simulira izvrsenja test case-a za redirekciju nakon uspesnog logovanja na sistem.
    // Program sa tastature ucitava actual url stranice, expected url stranice i kod o gresci
    // koja treba da se prikaze ukoliko actual stranica nije kao sto je ocekivano.
    //Objasnjenje: Ucitala se login stranica, uneli ste usename i password, kliknuli na login i
    // nakon logina je potrebno da vas stranica redirektuje na google.com/ivalid_login a vas redirektuje npr na google.com/home.
    //Napomena: Poruku o gresci unesite kao jednu rec.
    //Ukolko je validacija prosla uspesno ispisati 1 Test passed.

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter actual url:");
        String actual = s.next();

        System.out.println("Enter expected url:");
        String expected = s.next();

        System.out.println("Enter error code:");
        String errorCode = s.next();

        if(actual.equals(expected)) {
            System.out.println("1 Test passed.");
        } else {
            System.out.println("Assertion Error: Expected " + expected + " but got " + actual +
                    ", error code: " + errorCode);
        }
    }
}
