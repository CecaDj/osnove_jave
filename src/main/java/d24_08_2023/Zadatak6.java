package d24_08_2023;

import java.util.ArrayList;

public class Zadatak6 {
    //Napisati program koji vrsi proveru linkova sa stranice. Program cuva 3 niza:
    //niz linkova
    //niz ocekivanih status kodova za linkove iz prvog niza (expected status codes)
    //niz status kodova koje vracaju linkovi iz prvog niza (actual status codes)
    //Program za svaki link vrsi proveru ocekivane i dobijene vrednosti za status kod.
    // Ukoliko se actual i expected vrednosti ne poklapaju ispisati gresku u formatu:
    //Assertion Error: Link <link> expected status code <expected code> but got <actual code>
    public static void main(String[] args) {

        ArrayList<String> link = new ArrayList<>();
        ArrayList<String> expectedStatus = new ArrayList<>();
        ArrayList<String> actualStatus = new ArrayList<>();

        link.add("https://cms.demo.katalon.com/cart/");
        link.add("https://cms.demo.katalon.com/shop/");
        link.add("https://cms.demo.katalon.com/account/");
        link.add("https://cms.demo.katalon.com/cart/");
        link.add("https://cms.demo.katalon.com/test/");

        expectedStatus.add("200");
        expectedStatus.add("200");
        expectedStatus.add("404");
        expectedStatus.add("204");
        expectedStatus.add("200");

        actualStatus.add("200");
        actualStatus.add("200");
        actualStatus.add("400");
        actualStatus.add("200");
        actualStatus.add("404");

        for (int i = 0; i < link.size(); i++) {
            if (!expectedStatus.get(i).equals(actualStatus.get(i))) {
                System.out.println("Assertion Error: Link " + link.get(i) + " expected status code "
                        + expectedStatus.get(i) + " but got " + actualStatus.get(i));
            }
        }

    }
}
