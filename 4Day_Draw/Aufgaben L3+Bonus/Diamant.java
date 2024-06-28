// Schreibe ein Programm, welches Diamanten in Form von Sternchen (*) in der Konsole ausgibt. Die Größe der Diamanten soll der Benutzer beim Programmaufruf mitgeben.

// Tip: Damit die Diamanten eine gute Form haben, muss die Größe ungerade sein. Entscheide dich, ob du aus einer geraden Zahl eine ungerade machen möchtest oder ob du in dem Fall den Nutzer um eine erneute (ungerade) Eingabe bittest.
// javac Diamant.java
// java Diamant 5
//   *  
//  ***
// *****
//  ***
//   *

public class Diamant {
    public static void main(String[] args) {

        int height = Integer.parseInt(args[0]);

      
      for (int i = 0; i < height / 2; i++) {
        for (int j = 0; j < height / 2 - i; j++) {
            System.out.print(" ");
        }
        for (int k = 0; k < 2 * i + 1; k++) {
            System.out.print("#");
        }
        System.out.println();
    }

    
    for (int i = height / 2; i >= 0; i--) {
        for (int j = 0; j < height / 2 - i; j++) {
            System.out.print(" ");
        }
        for (int k = 0; k < 2 * i + 1; k++) {
            System.out.print("#");
        }
        System.out.println();
        }
    }
}