package p14_09_2023;
//Kreirati klasu TestStep koja od privatnih atributa ima:
//opis
//actual vrednost
//expected vrednost
//errorMessage
//konstuktor koji postavlja sve atribute
//getere za sve elemente
//settere nemamo
//metodu validate koja proverava da li su actual i expected vrednosti jednake i ukoliko jesu metoda vraca true u suprotnom vraca false
//metodu za stampu koja stampa test step u formatu:
//|  Opis |
//| Status(failed ili passed) | Error message (ako je test step failovao)
//
//
//	Kreirati klasu TestCase koja od privatnih atributra ima:
//ID
//naziv
//niz test koraka
//metodu addTestStep koja dodaje test step u niz
//metodu koja vraca broj test stepova koji su failovali (oni kod kojih actual vrednost nije jednaka sa expected)
//metodu koja vraca stanje testcase-a. Ukoliko nema koraka koji su failovali metoda vraca “PASSED” u suprotnom “FAILED”
//metoda koja stampa status test case-a u formatu
//ID - Naziv
//|  Opis  |
//|  Status(failed ili passed) | Error message (ako je test step failovao)
//|  Opis  |
//|  Status(failed ili passed) | Error message (ako je test step failovao)
//|  Opis  |
//|  Status(failed ili passed) | Error message (ako je test step failovao)
//ukupan broj koraka / broj test stepova koji su faulovali
//Stanje test case-a (PASSED ILI FALED)


public class Zadatak3 {
    public static void main(String[] args) {
        TestStep step1 = new TestStep("Open app", "", "","error");
        TestStep step2 = new TestStep("Check if login link is visible", "visible", "visible", "error");
        TestStep step3 = new TestStep("Click on login link", "", "", "error");
        TestStep step4 = new TestStep("Check if login button is visible", "visible", "invisible", "Login button is not visible");

        TestCase testCase = new TestCase("ID", "Validate Login Form");

        testCase.addTestStep(step1);
        testCase.addTestStep(step2);
        testCase.addTestStep(step3);
        testCase.addTestStep(step4);

        testCase.printStatus();
    }
}
