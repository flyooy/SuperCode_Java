public class LogischeAusdrücke {
    public static void main(String[] args){
	
       //int a = 10;          // muss true ergeben 
        // int a = 3;        // muss false ergeben
        // int a = 1000;     // muss false ergeben
       
    
     // boolean ergebnis = a > 5 && a < 55;
      //System.out.println(ergebnis);
       
      //01
      int a = 15;
      boolean ergebnis1 = a > 10 && a < 20;
      System.out.println("Zahl liegt zwichen 10  und  20 " + ergebnis1);

      //02
      boolean ergebnis2;
      int alt = 33;
      if (ergebnis2 = alt > 18 && alt < 25){
        System.out.println("Alter zwichen 18 -25  " + ergebnis2);
      }
      else if (ergebnis2 = alt > 65) {
          System.out.println("Alter als 65  " + ergebnis2);
      }
        else{
            System.out.println("Alter nicht passt " + ergebnis2);
        }

        //03
        int zahl1 = 1;
        int zahl2 = -5;
        int zahl3 =5;
        boolean ergebnis3;

        ergebnis3 = (zahl1 > 0 && zahl2 > 0) || (zahl1 > 0 && zahl3 > 0) || (zahl2 > 0 && zahl3 > 0);
        if (ergebnis3) {
            System.out.println("Mindestens zwei Zahlen sind positiv " + ergebnis3);
        } else {
            System.out.println("Weniger als zwei Zahlen sind positiv "+  ergebnis3);
        }

        //04
        int zahlDurch = 5;
        boolean nichtDurch2Und3 = (zahlDurch % 2 != 0) && (zahlDurch % 3 != 0);
        if(nichtDurch2Und3)
        {
            System.out.println(zahlDurch + " ist weder durch 2 noch durch 3 " + nichtDurch2Und3);
        }
        else 
        {
            System.out.println(zahlDurch + " ist durch 2 oder durch 3 " + nichtDurch2Und3);
        }

        //05

        int b = 0;
        int c = 5;
        int d = 0;
        boolean ergebnis5 = (b == 0 && c == 0 && d == 0);
        if (ergebnis5) {
            System.out.println(b + " " + c + " " + d +  " sind alle 0 " + ergebnis5);
        }
        else {
            System.out.println(b + " " + c + " " + d + " sind nicht alle 0 " + ergebnis5);
        }
        
        //06

        int i = 2;
        int f = 3;
        int g = 4;
        boolean ergebnis6 = (i == f && i == g && f == g);
        if (ergebnis6) {
            System.out.println(i + " " + f + " " + g +  " sind alle gleich " + ergebnis6);
        }
        else {
            System.out.println(i + " " + f + " " + g + " sind nicht alle gleich " + ergebnis6);
        }

        //07
        boolean a1 = false; 
        boolean b1 = true; 
        boolean c1 = true; 

     
        if ((a1 && b1 && !c1) || (a1 && !b1 && c1) || (!a1 && b1 && c1)) {
       
        System.out.println(String.valueOf(a1) + String.valueOf(b1) + String.valueOf(c1) + " Genau eine Bedingung ist falsch.");
    } else {

        System.out.println(String.valueOf(a1) + String.valueOf(b1) + String.valueOf(c1)
                + " Nicht genau eine Bedingung ist falsch.");
    }

    //08
    int multiplea = 42;
    boolean ergebnis8; 
    if (ergebnis8 = (multiplea % 2 == 0 && multiplea % 7 == 0) || (multiplea % 7 == 0 && multiplea % 11 == 0) )
    {
        System.out.println(multiplea + " ist ein Vielfaches von 2 und 7 oder ein Vielfaches von 7 und 11. " + ergebnis8 );
    }

    //09
    boolean a2 = true; 
    boolean b2 = true; 
    boolean c2 = true; 

 
    if ((a2 && b2 && c2) || (!a2 && !b2 && !c2) ) {
   
    System.out.println(String.valueOf(a2) + String.valueOf(b2) + String.valueOf(c2) + " sind alle drei true oder alle drei false");
} else {

    System.out.println(String.valueOf(a2) + String.valueOf(b2) + String.valueOf(c2)
            + "  sind Nicht alle drei true oder alle drei false");
}

}   
}
