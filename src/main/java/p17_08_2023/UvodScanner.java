package p17_08_2023;

import java.util.Scanner;

public class UvodScanner {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite ime:");
        String ime = s.next();

        System.out.println("Unesite prezime:");
        String prezime = s.next();

        System.out.println("Unesite kilazu:");
        double kg = s.nextDouble();

        System.out.println("Unesite da li ste aktivni:");
        boolean aktivan = s.nextBoolean();

        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("Kilaza: " + kg);
        System.out.println("Aktivnost: " + aktivan);

//        System.out.println("Unesite broj a: ");
//        int a = s.nextInt();
//        System.out.println("Unesite broj b: ");
//        int b = s.nextInt();
//
//        System.out.println("Kraj");
//
//
//        int zbir = a + b;
//        int razlika = a - b;
//        int proizvod = a * b;
//        int kolicnik = a / b;
//
//        System.out.println("a: " + a);
//        System.out.println("b: " + b);
//        System.out.println("Zbir je " + zbir);
//        System.out.println("Razlika je " + razlika);
//        System.out.println("Proizvod je " + proizvod);
//        System.out.println("Kolicnik je " + kolicnik);

        s.close();
    }


}
