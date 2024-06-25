public class RundenBerechen {
    public static void main(String[] args) {
        double zahl = Double.parseDouble(args[0]);
        int dezimalstellen = Integer.parseInt(args[1]);
        double faktor = Math.pow(10, dezimalstellen);
        double gerundet = Math.round(zahl * faktor) / faktor;
        System.out.println(zahl + " gerundet auf " + dezimalstellen + " Dezimalstellen ist " + gerundet);
    }
}
