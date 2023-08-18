package d17_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    //Napisati program koji u zavisnosti od operatora koji unosi korisnik sa tastature (operator je string
    // i moze imati vrednosti +, - , *, /) racuna  i ispisuje na ekranu odgovarajuci zbir, razliku, proizvod
    // ili kolicnik za dva broja a i b uneta sa tastature.

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite a:");
        int a = s.nextInt();

        System.out.println("Unesite b:");
        int b = s.nextInt();

        System.out.println("Unesite operator:");
        String operator = s.next();

        int zbir = a + b;
        int razlika = a - b;
        int proizvod = a * b;
        int kolicnik = a / b;

        if(operator.equals("+")) {
            System.out.println("Rezultat: " + zbir);
        }
        if(operator.equals("-")) {
            System.out.println("Rezultat: " + razlika);
        }
        if(operator.equals("*")) {
            System.out.println("Rezultat: " + proizvod);
        }
        if(operator.equals("/")) {
            System.out.println("Rezultat: " + kolicnik);
        }

    }
}
