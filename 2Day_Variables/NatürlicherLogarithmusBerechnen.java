public class NatürlicherLogarithmusBerechnen {
    public static void main(String[] args) {
        double zahl = Double.parseDouble(args[0]);
        double log = Math.log(zahl);
        System.out.println("Der natürliche Logarithmus von " + zahl + " ist " + log);
    }
}
