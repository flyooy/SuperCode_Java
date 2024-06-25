public class ZufälligeZahlGenerieren {
    public static void main(String[] args) {
        int zahl1 = Integer.parseInt(args[0]);
        int zahl2 = Integer.parseInt(args[1]);
        int zufallszahlGanz = (int) (Math.random() * (zahl2 - zahl1 + 1)) + zahl1;
        System.out.println("Zufällige Ganzzahl zwischen " + zahl1 + " und " + zahl2 + " ist " + zufallszahlGanz);
    }
}
