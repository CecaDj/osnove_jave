package d25_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    //Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije
    // vraca novu vrednost koja se formira kao na primeru. METODA NISTA NE STAMPA.
    //ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
    //ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite prvi broj:");
        String prviBroj = s.next();
        System.out.println("Unesite drugi broj:");
        String drugiBroj = s.next();

        String novaVrednost = formirajDvocifrenBroj(prviBroj, drugiBroj);
        System.out.println("Nova vrednost iznosi " + novaVrednost);
    }
    public static String formirajDvocifrenBroj (String a, String b) {

        String dvocifrenBroj = a + b;
        return dvocifrenBroj;
    }
}
