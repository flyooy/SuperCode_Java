public class QuadratwurzelBerechnen {
    public static void main(String[] args) {
        double zahl = Double.parseDouble(args[0]);
        double quadratwurzel = Math.sqrt(zahl);
        System.out.println("Die Quadratwurzel von " + zahl + " ist " + quadratwurzel);
    }
}