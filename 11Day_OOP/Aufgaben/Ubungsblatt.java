import java.util.Collections;

public class Ubungsblatt {

    private int nummer;
    private int max;
    private int punkt;

    public Ubungsblatt(int nummer, int max, int punkt) {
        this.nummer = nummer;
        this.max = max;
        this.punkt = punkt;
    }

    //Get
    public int getNummer() {
        return nummer;
    }

    public int getMax() {
        return max;
    }

    public int getPunkt() {
        return punkt;
    }

    //Set
    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setPunkt(int punkt) {
        this.punkt = punkt;
    }

    public void printDetails() {

        System.out.println("Nummer: " + nummer);
        System.out.println("Max: " + max);
        System.out.println("Punkt: " + punkt);
    }

    public static void prozentAnteil(Ubungsblatt[] blatt) {
        System.out.println("---------------------------------");
        for (int i = 0; i < blatt.length; i++) {
            if (blatt[i] != null) {
                double prozent = ((double) blatt[i].getPunkt() / blatt[i].getMax() * 100);
                System.out.printf("Der prozentuale Anteil der erreichten Punkte für Blatt %d ist %.2f%%\n", i + 1,
                        prozent);
                if (prozent >= 50) {
                    System.out.printf("Die Klausurzulassungsgrenze für Blatt %d erreicht\n", i + 1);
                } else {
                    System.out.printf("Die Klausurzulassungsgrenze für Blatt %d nicht erreicht\n", i + 1);
                }
            }
        }
    }

    public static void maxMin(Ubungsblatt[] blatt) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int nummerMax = 0;
        int nummerMin = 0;
        
        for (int i = 0; i < blatt.length; i++) {
            int aktuellerPunkt = blatt[i].getPunkt();
            
            if (aktuellerPunkt > max) {
                max = aktuellerPunkt;
                nummerMax = i+1;
            }
            
            if (aktuellerPunkt < min) {
                min = aktuellerPunkt;
                nummerMin = i+1;
            }
        }
    System.out.println("---------------------------------");
        System.out.println("Maximal Punkt ist "  + max + " bei Blatt "  +  nummerMax);
        System.out.println("Minimal Punkt ist "  + min + " bei Blatt "  +  nummerMin);


    }

}