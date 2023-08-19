package d18_08_2023;

public class Zadatak4 {
    //Napisati program koji stampa 25 _ (donjih crta),
    // pritom na svaku 5. iteraciju odstampa i novi red.
    // Zadatak resiti pomocu FOR petlje.

    public static void main(String[] args) {

        for (int i = 1; i < 26 ; i++) {
            System.out.print("_");
            if(i % 5 == 0) {
                System.out.println();
            }
        }
    }
}
