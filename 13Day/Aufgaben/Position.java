
/**
 * Position
 */
public class Position {
    public int x;
    public int y;

    public Position(int p1, int p2) {
        this.x = p1;
        this.y = p2;
    }
    
    public static void main(String[] args) {
        Position p1 = new Position(3, 3);
        Position p2 = new Position(6, 6);
        Position p3 = p1;

        p1 = p2; //Die Werte von p1 werden p2 zugewiesen
        p2 = new Position(9, 9); // Den p2-Werten werden neue Werte von 9,9 zugewiesen
        p3.y = 12;//Die Werte von p3.y werden geändert und p3.x bleibt gleich wie p1, da p3=p1 oben

        System.out.println("p1 -> X: " + p1.x + ", Y: " + p1.y);
        System.out.println("p2 -> X: " + p2.x + ", Y: " + p2.y);
        System.out.println("p3 -> X: " + p3.x + ", Y: " + p3.y);
    }


    public static void mainAusgabe2(String[] args) {
        Position p1 = new Position(0, 0);
        Position p2 = new Position(0, 0);
        p1 = p2; // p1 = p2 bewirkt, dass die beiden Variablen p1 und p2 auf dasselbe Objekt im Speicher verweisen.
        p1.x = 21;
        p2.y = 11; // ändert dasselbe Objekt, da p1 und p2 auf dasselbe Objekt zeigen.
        p2 = p1;
        System.out.println("p1 -> X: " + p1.x + ", Y: " + p1.y);
        System.out.println("p1 -> X: " + p2.x + ", Y: " + p2.y);
        // Die beiden Variablen p1 und p2 verweisen auf dasselbe Objekt, so dass Änderungen in einer Variablen auch in der anderen sichtbar werden.
    }


    public static void mainAusgab1(String[] args) {
        Position p1 = new Position(11, 21);
        Position p2 = new Position(11, 21);

        if (p1 == p2) {
		System.out.println("true");
    } else {
        System.out.println("false"); //ausgibt false, deswegen vergleich Referenz
    }

    }
}
