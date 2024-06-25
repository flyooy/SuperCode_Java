public class Sale {
    public static void main(String[] args) {

        double zahl = Double.parseDouble(args[0]);
        double rabbat = (zahl * 60) / 100;
        String rabattPreis = String.format("%.2f", rabbat);
        System.out.println("Rabattierter Preis: " + rabattPreis + " €");
    }
}
