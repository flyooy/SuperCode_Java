public class SummeZiffern {
    public static void main(String[] args) {
        int number = 12345;
        System.out.println(summe(number));

       
    }
    
    
    public static int summe(int number) {
      
        if (number == 0)
            return 0;
        int lastDigit = number % 10; //nehme ich letzte Zahle von number

        return lastDigit + summe(number/10); // letzte Zahle addiere mit Ganze number/10 kommafrei (im Method summe )
    }
    
   
}
