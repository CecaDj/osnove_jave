package d15_08_2023;

public class Zadatak5 {
//    Napisati program koji racuna i ispisuje povrsinu i obim trougla. KOREN BROJA 3 neka bude konstanta 1.73.
//    Za stranicu trougla postavite proizvoljnu vrednost.

    public static void main(String[] args) {

        int a = 10, obim = 0;
        double korenBroja3 = 1.73, povrsina = 0;

        obim = 3 * a;
        povrsina = a * a * korenBroja3 / 4;

        System.out.println("a: " + a);
        System.out.println("Povrsina je " + povrsina);
        System.out.println("Obim je " + obim);
    }
}
