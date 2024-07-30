
//Stack Aufgabe 3
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
    
        // Erstellen eines neuen Stacks
        Stack<Integer> stack = new Stack<>();

        // Elemente zum Stack hinzufügen
        stack.push(5);
        stack.push(10);
        stack.push(15);

        // Überprüfen, ob der Stack leer ist
        System.out.println("Ist der Stack leer? " + stack.isEmpty());

        // Anzeigen des obersten Elements des Stacks, ohne es zu entfernen
        System.out.println("Oberstes Element des Stacks: " + stack.peek());

        // Entfernen und Rückgabe des obersten Elements des Stacks
        int poppedElement = stack.pop();
        System.out.println("Entferntes Element: " + poppedElement);

        // Anzeigen der Größe des Stacks
        System.out.println("Größe des Stacks: " + stack.size());

        // Löschen des Stacks
        stack.clear();
        System.out.println("Ist der Stack leer nach dem Löschen? " + stack.isEmpty());
    }
}
