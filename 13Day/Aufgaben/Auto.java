public class Auto {
    private String marke;
    private int baujahr;
    private double kilometerstand;
    private double tankkapazitaet;
    private double tankinhalt;
    private double verbrauch;

    public Auto(String marke, int baujahr, int kilometerstand) {
        this.marke = marke;
        this.baujahr = baujahr;
        this.kilometerstand = kilometerstand;
        kilometerstand = 0;
        tankinhalt = 30;
        tankkapazitaet = 50;
        verbrauch = 7;


    }
    
    public String getMarke() {
        return this.marke;
    }

    public int getBaujahr() {
        return this.baujahr;
    }

    public double getKilometerstand() {
        return this.kilometerstand;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }
   
    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }
   
    public void setKilometerstand(double kilometerstand) {
        this.kilometerstand = kilometerstand;
   }

   public void getDetails() {
        System.out.println("Marke: " + marke);
        System.out.println("Baujahr: " + baujahr);
        System.out.println("Kilometerstand: " + kilometerstand);
        System.out.println();
   }

   public void fahren(Fahrer fahrer, Auto auto, int kilometer) {
       if (kilometer <= 0)
           throw new IllegalArgumentException("Kilometer muss größer als 0 sein.");
       if (fahrer.getAlter() < 18)
           throw new IllegalArgumentException("Der Fahrer muss mindestens 18 Jahre alt sein.");
       kilometerstand += kilometer;
        System.out.println("Neue Kilometerstand: "+ kilometerstand);
        double verbrauchAufTour = kilometer / 100 * verbrauch;
        System.out.println("Verbrauch auf Tour: "+ verbrauchAufTour);
       if (tankinhalt < verbrauchAufTour)
       throw new IllegalArgumentException("Tankinhalt reicht nicht für die angegebene Strecke.");
            tankinhalt -= verbrauchAufTour;
           tankkapazitaet = tankkapazitaet - tankinhalt;
        
           System.out.println("Pruefe Service:");
           auto.pruefeService();
           System.out.println("Reichweite Berechnen:");
           System.out.println(auto.reichweiteBerechnen());
           System.out.println("Tankinhalt aktuell:");
           System.out.println(tankinhalt);
           System.out.println("Tank nach dem Einfüllen:");
           System.out.println(auto.tanken(12));

   }
   
   public double tanken(double liter) {
        if (liter <= 0)
            throw new IllegalArgumentException("Die Menge an Liter muss größer als 0 sein.");

        double zusatzTankinhalt = liter;

        if (tankinhalt + zusatzTankinhalt > tankkapazitaet) {
            throw new IllegalArgumentException("Tank kann nicht mehr Liter aufnehmen als seine Kapazität.");
        }

        tankinhalt += zusatzTankinhalt;
        return tankinhalt;
    }
   
    public void pruefeService() {

        if (kilometerstand >= 15000) {
            System.out.println("Das Auto braucht einen Service");
        }
        else  System.out.println("Das Auto braucht keine Service");
    }

    public double reichweiteBerechnen() {
        return (int) ((tankinhalt / verbrauch) * 100);
    }
}
