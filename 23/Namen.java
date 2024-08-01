import java.util.ArrayList;
import java.util.Scanner;

/**
 * Namen
 */
public class Namen {

    public static void main(String[] args) {
        ArrayList<String> namen = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(
                    "Geben Sie einen Namen ein, 'LISTE' um die Liste anzuzeigen, oder 'ENDE' um das Programm zu beenden:");
            String personInput = scanner.next();
            if ("ENDE".equals(personInput)) {
                System.out.println("Das Program wird beendet");
                break;
            } else if ("LISTE".equals(personInput)) {
                if (namen.size() > 0) {
                    System.out.println("Namen | " + namen);

                } else {
                    System.out.println("Keine Namen in den Liste");

                }

            } else {
                namen.add(personInput);
                System.out.println("Name wird added");

            }
        }
        scanner.close();
    }
}