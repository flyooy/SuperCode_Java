public class FormelsammlungRechteck {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        
        int u = (2 * a) + (2 * b);
        System.out.println("Umfang = " + u);

        int A = a * b;
        System.out.println("Flächeninhalt = " + A);

        int powa = (int)Math.pow(a,2);
        int powb = (int) Math.pow(b, 2);
        double summeab = (powa + powb);
        double d = Math.sqrt(summeab);
        System.out.println("Diagonalenlänge = " + d);

        double r = d / 2;
        System.out.println("Umkreisradius = " + r);

    }
}
