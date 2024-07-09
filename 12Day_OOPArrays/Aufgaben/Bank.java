
public class Bank {
    public static void main(String[] args) {
        Bankkonto Kunde = new Bankkonto("Max Harisson", "GB2384931H", 22.0);
        Kunde.gibKontoinformationen();
        Bankkonto Kunde2 = new Bankkonto("Richard Madd", "GB234451H", 55.0);
        Kunde2.gibKontoinformationen();
        double betrag = 5.0;
        
         System.out.println("---------abHeben----------");
        Kunde.abHeben(betrag+30);
        System.out.println("---------einZahlen----------");
         Kunde.einZahlen(betrag);
        
        // Kunde.gibKontoinformationen();

        System.out.println("---------uberweisen----------");
        Kunde.uberweisen(Kunde2, betrag);
        System.out.println("---------History Kunde#1----------");
        System.out.println(Kunde.transaktionsHistorien());
        System.out.println("---------History Kunde#2----------");
        System.out.println(Kunde2.transaktionsHistorien());
        Kunde.gibKontoinformationen();
        Kunde2.gibKontoinformationen();

        }
}
