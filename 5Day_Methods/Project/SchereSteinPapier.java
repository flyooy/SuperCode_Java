import java.util.Scanner;

public class SchereSteinPapier {
    public static int counterPerson = 0;
    public static int counterComp = 0;
    public static int counterThreeWinnerPerson = 0;
    public static int counterThreeWinnerComp = 0;
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
       
        
        while (true) {
            System.out.println("Wähle: 0 = Schere, 1 = Stein, 2 = Papier, 3 = Beenden");
            int personInput = scanner.nextInt();
            if (personInput == 3) {
              
                if (counterComp > counterPerson)

                {
                    System.out.println("Das spiel wurde beendet.");
                    System.out.println(
                            "Computer gewonnt mit " + counterComp + " Punkten. Nochmals spiel, um zu gewinnen ");
                } else if (counterComp < counterPerson)
                {
                    System.out.println("Das spiel wurde beendet.");
                    System.out.println("Du gewonnst mit " + counterPerson + " Punkten. Hübscher Junge, komm zurück, um noch zu gewinnen.");
                } else if (counterComp == counterPerson && counterComp !=0 && counterPerson!=0) {
                    System.out.println("Das spiel wurde beendet.");
                    System.out.println("Es ist unentschieden, und du bist nicht schlecht");
            } else { System.out.println("Das spiel wurde beendet."); }
                
                break;
            }
            
            if (personInput < 0 || personInput > 3) {
                System.out.println("Ungültige Spielereingabe");
                continue;
            }

            int computerChoice = computerChoiсe();
            displayChoices(personInput, computerChoice);
            checking(personInput, computerChoice);
            checkingPoint();
            
            System.out.println("Spieler gewonnt " + counterPerson + " mal");
            System.out.println("Computer gewonnt " + counterComp + " mal");

            
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
        } else if (personChoice == 0 && computerChoice == 2 ||
                personChoice == 2 && computerChoice == 1 ||
                personChoice == 1 && computerChoice == 0) {
            System.out.println("Du hast gewonnen");
            counterPerson++;
            counterThreeWinnerPerson++;
            counterThreeWinnerComp = 0; 
        } else {
            System.out.println("Computer hat gewonnen!");
            counterComp++;
            counterThreeWinnerComp++;
            counterThreeWinnerPerson = 0;
        }
    }
    
    public static void checkingPoint() {
        if (counterThreeWinnerPerson == 3) {
            System.out.println("Wow, 3mal gewonnt? + 1 point Extra");
            counterPerson++;
            counterThreeWinnerPerson = 0;
        } 
       
        if (counterThreeWinnerComp == 3) {
            System.out.println("Wow, 3mal gewonnt? + 1 point Extra");
            counterComp++;
            counterThreeWinnerComp = 0;
        } 
    }
    
}
