package d15_08_2023;

public class Zadatak11 {
    //Napisati program koji vrsi grubu procenu koliko je vremena potrebno da se skine fajl.
    // Program od informacija cuva naziv fajla, velicinu fajla i brzinu skidanja.
    // Velicina fajla je u Mb a brzina skidana u Mb/s (megabajt u sekundi)

    public static void main(String[] args) {

        String fileName = "profile-image.log";
        int fileSize = 25;
        int downloadSpeed = 3;

        int estimatedTime = fileSize/downloadSpeed;

        System.out.println("File: " + fileName);
        System.out.println("Size: " + fileSize + "Mb");
        System.out.println("Download speed: " + downloadSpeed + "Mb/s");
        System.out.println("Estimated time: " + estimatedTime + "s");

    }
}
