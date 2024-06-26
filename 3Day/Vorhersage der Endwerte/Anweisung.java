public class Anweisung {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 0; i < 10; i++) {
            a += i;
           // System.out.println("a = " + a);
        }
        

        int b = 0;
        for (b = 0; b < 10; b++) {
            b += b;
           // System.out.println("b = " + b);
        }
   

        int c = 0;
        for (int i = 0; i < 10; i++) {
            c += c++;
            //System.out.println("c = " + c);
        }
     

        //Bonus
        System.out.println("Bonus");
        int n = 123456789;
        int m = 0;
        while (n != 0) {
            m = (10 * m) + (n % 10);
            n = n / 10;
          // System.out.println("m = " + m);
           //  System.out.println("n = " + n);
        }
       
        
        

    }
    
    
}