package d15_08_2023;

public class Zadatak8 {
    //Napisati program koji za datu boju trazi kontrastnu boju. Svaka boja se sadrzi od 3 komponente RGB(red, green, blue).
    //Svaka komponenta boje je u opsegu od 0 do 255(informativno)
    //Program nalazi kontrastnu boju tako sto svaku komponentu boje oduzme od 255.
    //Primer izvrsenja:
    //Originalna boja: RGB(140, 12,  100)
    //Kontrastna boja: RGB(115, 243, 155)

    public static void main(String[] args) {

        int red = 20, green = 100, blue = 120, redKontrast = 0, greenKontrast = 0, blueKontrast = 0;

        redKontrast = 255 - red;
        greenKontrast = 255 - green;
        blueKontrast = 255 - blue;

        System.out.println("Originalna boja: RGB(" + red + ", " + green + ", " + blue + ")");
        System.out.println("Kontrastna boja: RGB(" + redKontrast + ", " + greenKontrast + ", " + blueKontrast + ")");


    }
}
