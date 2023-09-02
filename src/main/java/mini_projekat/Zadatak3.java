package mini_projekat;

import java.util.ArrayList;

public class Zadatak3 {
    //Napišite program koji obavlja zamenu placeholdera u SQL upitu.
    // Za rešenje ovog zadatka, biće potrebno upoznati se sa upotrebom `replace` metode koju pruža `String` klasa u Javi.
    //Program će sačuvati sledeće informacije:
    //1. SQL upit (string) nad kojim će se obaviti zamena.
    //2. Niz vrednosti (niz stringova) koje treba da se ubace umesto placeholdera u SQL upitu.
    public static void main(String[] args) {

        String sqlUpit = "INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country) " +
                "VALUES ('%0', '%1', '%2', '%3', '%4', '%5');";

        ArrayList<String> vrednosti = new ArrayList<>();

        vrednosti.add("Cardinal");
        vrednosti.add("Tom B. Erichsen");
        vrednosti.add("Skagen 21");
        vrednosti.add("Stavanger");
        vrednosti.add("4006");
        vrednosti.add("Norway");

        for (int i = 0; i < vrednosti.size(); i++) {
            String placeholder = "%" + i;
            sqlUpit = sqlUpit.replace(placeholder, vrednosti.get(i));
        }
        System.out.println(sqlUpit);

    }



}
