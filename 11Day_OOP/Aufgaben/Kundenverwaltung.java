public class Kundenverwaltung {
    public static void main(String[] args) {
        
        Kunde kunde1 = new Kunde(1, "Max Mustermann", "max@example.com", "0123456789");
        Kunde kunde2 = new Kunde(2, "Erika Mustermann");
        Kunde kunde3 = new Kunde(3, "Hans Müller", "hans@example.com");

     
        kunde1.printDetails();
        System.out.println();
        kunde2.printDetails();
        System.out.println();
        kunde3.printDetails();
    }
}
