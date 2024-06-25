public class PotenzBerechnen {
    public static void main(String[] args) {
        double zahl = Double.parseDouble(args[0]);
        double exponent = Double.parseDouble(args[1]);
        double potenz = Math.pow(zahl, exponent);
        System.out.println(zahl + " hoch " + exponent + " ist " + potenz);
    }
}
