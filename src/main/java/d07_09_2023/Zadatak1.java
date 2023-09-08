package d07_09_2023;

public class Zadatak1 {
    //Napišite klasu "Student" koja ima sledeće atribute: ime (String), brojIndeksa (int) i fakultet (String).
    // Kreirajte 2-3 objekta ove klase u glavnoj metodi i postavite im vrednosti. Ispisati informacije o studentima.
    public static void main(String[] args) {

        Student prvi = new Student();
        prvi.ime = "Marko Markovic";
        prvi.brojIndeksa = 1;
        prvi.fakultet = "Pravni fakultet";

        Student drugi = new Student();
        drugi.ime = "Petar Petrovic";
        drugi.brojIndeksa = 2;
        drugi.fakultet = "Filozofski fakultet";

        Student treci = new Student();
        treci.ime = "Marija Markovic";
        treci.brojIndeksa = 3;
        treci.fakultet = "Masinski fakultet";

        System.out.println("Student: " + prvi.ime + ", " + prvi.brojIndeksa + ", " + prvi.fakultet);
        System.out.println("Student: " + drugi.ime + ", " + drugi.brojIndeksa + ", " + drugi.fakultet);
        System.out.println("Student: " + treci.ime + ", " + treci.brojIndeksa + ", "+ treci.fakultet);


    }
}
