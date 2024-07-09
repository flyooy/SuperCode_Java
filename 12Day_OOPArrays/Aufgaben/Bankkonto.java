import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Bankkonto {
    
    private String name;
    private String kontoNummer;
    private double kontoStand;
    private List<String> transaktionsHistorie;

    public Bankkonto(String name, String kontoNummer, double kontoStand) {
        this.name = name;
        this.kontoNummer = kontoNummer;
        this.kontoStand = kontoStand;
        kontoStand = 0.0;
        this.transaktionsHistorie = new ArrayList<>(); 
    }

    //GET

    public String getName() {
        return name;
    }

    public String getKontoNummer() {
        return kontoNummer;
    }

    public double getkontoStand() {
        return kontoStand;
    }

    //SET

    public void setName(String name) {
         this.name =  name;
    }

    public void setKontoNummer(String kontoNummer) {
        this.kontoNummer = kontoNummer;
    }

    public void setkontoStand(double kontoStand) {
        this.kontoStand = kontoStand;
    }

    public void gibKontoinformationen() {

        System.out.println("Name: " + name);
        System.out.println("Konto Nummer: " + kontoNummer);
        System.out.println("Konto Stand: " + kontoStand);
        System.out.println();
    }

    public double einZahlen(double betrag) {
        if (betrag < 0) {
            System.out.println("Der Einzahlungs ist negativ, bitte geben Sie den richtigen Betrag ein.");
            System.out.println();
            return -1;
        } else{
            kontoStand += betrag;
        logTransaktion("Einzahlung", betrag);
        System.out.println("Einzahlung erfolgreich");
        System.out.println();
        return kontoStand;
    }
        
    }

    public double abHeben(double betrag) {
        if (betrag < 0) {
            System.out.println("Der Abhebungsbetrag ist negativ, bitte geben Sie den richtigen Betrag ein.");
            System.out.println();
            return -1;
        }
        if (kontoStand > betrag) {
            kontoStand -= betrag;
            System.out.println("Entzug erfolgreich");
            logTransaktion("Abhebung", betrag);
            System.out.println();
            
        } else {
            System.out.println("Ihr Konto nicht ausreichend gedeckt ist");
            System.out.println();
            return -1;
        }
        return kontoStand;

    }
    private void logTransaktion(String typeTranzaktion, double betrag) {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        String entry = "Typ: " + typeTranzaktion + ", Betrag: " + betrag + ", Zeit: " + formattedDate;
        transaktionsHistorie.add(entry);
    }
    
    public String transaktionsHistorien() {
        StringBuilder historie = new StringBuilder();
        for (String entry : transaktionsHistorie) {
            historie.append(entry).append("\n");
        }
        System.out.println();
        return historie.toString();
    }
    
    public double uberweisen(Bankkonto empfaenger, double betrag) {
        if (betrag < 0) {
            System.out.println("Betrag ist negativ, bitte geben Sie den richtigen Betrag ein.");
            System.out.println();
            return -1;
        }
        if (betrag <= this.kontoStand) {
            this.kontoStand -= betrag;
            empfaenger.kontoStand += betrag;
            String transaktionsDetails = "Überweisung an " + empfaenger.getName() + " (" + empfaenger.getKontoNummer() + ")";
            logTransaktion(transaktionsDetails, betrag);
            empfaenger.logTransaktion("Überweisung von " + this.getName() + " (" + this.getKontoNummer() + ")", betrag);
            System.out.println("Überweisung erfolgreich");
            System.out.println();
        } else
        {
            System.out.println("Ihr Konto ist nicht ausreichend gedeckt");
            System.out.println();
            return -1;
        }
       
        return kontoStand;
    }

}
