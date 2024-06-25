public class Temperaturumwandler {
    public static void main(String[] args) {
        int cGradus = Integer.parseInt(args[0]);
        int fGradus = ((cGradus * 9 / 5) + 32);
        System.out.println(cGradus + "  Grad sind " + fGradus + " Fahrenheit");
    }
}
