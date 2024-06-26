public class whileSchleife {

    public static void main(String[] args) {

        int summe1 = 0;
        int summe2 = 0;
        int a = 0;
        while (a < 10)
        {
            System.out.println("Durchlauf: " + a);

            summe1 += a;
            a++;
        }
        
        
        System.out.println(summe1);

        for (int i = 0; i < 10; i++) {
            System.out.println("Durchlauf: " + i);
            summe2 += i;
        }
        System.out.println(summe2);

    }
}
