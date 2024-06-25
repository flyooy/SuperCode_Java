public class AbsoluteZahlBerechnen {
    public static void main(String[] args) {
        double zahl = Double.parseDouble(args[0]);
        double absolutwert = Math.abs(zahl);
        System.out.println("Der Absolutwert von " + zahl + " ist " + absolutwert);
    }
}
