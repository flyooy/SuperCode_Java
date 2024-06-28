import java.util.Scanner;

public class SchereSteinPapier {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        boolean letin = true;
        
        while (letin) {
            System.out.println("Wähle: 0 = Schere, 1 = Stein, 2 = Papier, 3 = Beenden");
            int personInput = scanner.nextInt();
            if (personInput == 3) {
                System.out.println("Das spiel wurde beendet.");
                letin = false;
                break;
            }
            
            if (personInput < 0 || personInput > 3) {
                System.out.println("Ungültige Spielereingabe");
                continue;
            }

            int computerChoice = computerChoiсe();
            displayChoices(personInput, computerChoice);
            checking(personInput, computerChoice);
        }
        scanner.close();
    }
      

    public static int computerChoiсe() {
        return (int) (Math.random() * 3);
    }
    
    public static void displayChoices(int personChoice, int computerChoice) {
        String[] choices = { "Schere", "Stein", "Papier" };
        System.out.println("Deine Wahl: " + choices[personChoice]);
        System.out.println("Computer Wahl: " + choices[computerChoice]);
    }
        
    public static void checking(int personChoice, int computerChoice) {
            
        if (personChoice == 0 && computerChoice == 0) {
            System.out.println("Tie");
        } else if (personChoice == 0 && computerChoice == 2 || personChoice == 2 && computerChoice == 1
                    || personChoice == 1 && computerChoice == 0) {
            System.out.println("Du hast gewonnen");
            }
                    else {
                        System.out.println("Computer hat gewonnen!");
                    }
    }
}
