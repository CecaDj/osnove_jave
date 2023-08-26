package d25_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    //Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite m:");
        int m = s.nextInt();
        System.out.println("Unesite n:");
        int n = s.nextInt();

        int brojevaIzmedju = izbroji(m, n);
        System.out.println("Izmedju " + m + " i " + n + " postoji " + brojevaIzmedju + " brojeva. Kako?");
        for (int i = m; i <= n ; i++) {
            System.out.print(i + ", ");
        }
    }
    public static int izbroji(int m, int n) {
        int brojac = 0;

        for (int i = m; i < n - 1; i++) {
            brojac++;
        }
        return  brojac;
    }
}
