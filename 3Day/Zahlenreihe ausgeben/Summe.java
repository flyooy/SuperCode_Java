
public class Summe {
    public static void mainSumme(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        System.out.println("Die Summe aller Zahlen von 1 bis 100 ist: " +sum);
    }

    public static void mainGeradenSumme(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("Die Summe aller geraden Zahlen von 1 bis 100 ist: " +sum);
    }



    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println("Die Summe aller ungeraden Zahlen von 1 bis 100 ist: " +sum);
    }

}