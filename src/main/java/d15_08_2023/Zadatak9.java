package d15_08_2023;

public class Zadatak9 {
//Napisati program koji vrsi procentualnu procenu u fazi skidanja fajla.
// Program od informacija cuva naziv originalnog fajla, velicinu originalnog fajla
// u Mb (megabajtima) i velicinu skunutog dela fajla takodje u Mb.
// Na kraju programa racuna i ispisuje koji je deo fajla skinut.Stampanje se vrsi u formatu

    public static void main(String[] args) {
        String nazivFajla = "profile-image.png ";
        int velicinaOriginalnogFajla = 7;
        int velicinaSkinutogDelaFajla = 2;
        int procenat = 28;

        System.out.println(nazivFajla + velicinaOriginalnogFajla + "Mb/" + velicinaSkinutogDelaFajla + "Mb");
        System.out.println("***************************");
        System.out.println("********" + procenat + "%");
        System.out.println("***************************");


    }
}
