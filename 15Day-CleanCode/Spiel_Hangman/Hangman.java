import java.util.Scanner;
import java.util.ArrayList;

public class Hangman {

        public static int versuchen = 7;
        private static final String[] deutcheWorte = {
                        "apfel",
                        "baum",
                        "wasser",
                        "fisch",
                        "haus",
                        "buch",
                        "auto",
                        "hund",
                        "katze",
                        "blume"
        };

        public static void main(String[] args) {
                Hangman();
        }

        public static void Hangman() {

                System.out.println("Start Spielen");
                String rateWort = randomWord();
                char[] buchstaben = new char[rateWort.length()];
                char[] gerateneBuchstaben = new char[versuchen];
                System.out.println(rateWort);
                for (int i = 0; i < buchstaben.length; i++) {
                        buchstaben[i] = '_';
                        System.out.print(buchstaben[i] + " ");
                }
                System.out.println();
                System.out.println("Ein Wort hat " + rateWort.length() + " buchstaben");

                Scanner scanner = new Scanner(System.in);
                while (versuchen > 0) {
                        System.out.println("Verbleibende Versuche: " + versuchen);
                        for (int i = 0; i < versuchen; i++) {
                                System.out.print("∆ ");
                        }
                        System.out.println();
                        System.out.println("Bitte geben Sie einen Buchstaben ein:");
                        String input = scanner.nextLine();
                        if (input.length() == 1) {
                                char buchstabe = input.charAt(0);
                                boolean isCorrect = false;
                                for (int i = 0; i < rateWort.length(); i++) {
                                        char b = rateWort.charAt(i);
                                        if (b == buchstabe) {
                                                buchstaben[i] = b;
                                                isCorrect = true;
                                        }

                                }
                                boolean isBereits = false;
                                for (int i = 0; i < gerateneBuchstaben.length; i++) {
                                        if (gerateneBuchstaben[i] == buchstabe) {
                                                isBereits = true;
                                                break;
                                        }
                                }

                                if (!isCorrect && !isBereits) {
                                        
                                        for (int i = 0; i < gerateneBuchstaben.length; i++) {
                                                if (gerateneBuchstaben[i] == '\u0000') { 
                                                        gerateneBuchstaben[i] = buchstabe;
                                                        break;
                                                }
                                                
                                        }
                                        versuchen--;

                                } else if (isBereits) {
                                        
                                        System.out.println(
                                                        "Dieser Buchstabe war bereits vorhanden, versuchen Sie es erneut.");
                                }
                                    
                                System.out.print("Geratene Buchstaben: ");
                                for (int i = 0; i < gerateneBuchstaben.length; i++) {
                                        if (gerateneBuchstaben[i] != '\u0000') {
                                                System.out.print("[" + gerateneBuchstaben[i] + "]");
                                        }
                                }
                                System.out.println();
                                boolean fertigSpiele = true;
                                if (versuchen > 0) {
                                        hangmanImage();
                                        System.out.print("Wort ");
                                        for (int i = 0; i < buchstaben.length; i++) {
                                                if (buchstaben[i] == '_') {
                                                        fertigSpiele = false;
                                                }
                                                System.out.print(buchstaben[i]);
                                        }
                                        System.out.println();
                                } else if (versuchen == 0) {
                                        hangmanImage();
                                        fertigSpiele = true;
                                        System.out.println("Wort: " + rateWort);
                                        break;
                                }

                                if (fertigSpiele) {
                                        System.out.println("Du gewonnen");
                                        break;
                                }
                        } else
                                System.out.println("Falch.Bitte geben Sie nur einen Buchstaben ein:");

                }

                scanner.close();

        }

        private static String randomWord() {
                return deutcheWorte[(int) (Math.random() * deutcheWorte.length)];
        }

        public static void hangmanImage() {
                if (versuchen == 6) {
                        System.out.println("Wrong guess, try again");
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println("___|___");
                        System.out.println();
                }
                if (versuchen == 5) {
                        System.out.println("Wrong guess, try again");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("___|___");
                }
                if (versuchen == 4) {
                        System.out.println("Wrong guess, try again");
                        System.out.println("   ____________");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("   | ");
                        System.out.println("___|___");
                }
                if (versuchen == 3) {
                        System.out.println("Wrong guess, try again");
                        System.out.println("   ____________");
                        System.out.println("   |          _|_");
                        System.out.println("   |         /   \\");
                        System.out.println("   |        |     |");
                        System.out.println("   |         \\_ _/");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("   |");
                        System.out.println("___|___");
                }
                if (versuchen == 2) {
                        System.out.println("Wrong guess, try again");
                        System.out.println("   ____________");
                        System.out.println("   |          _|_");
                        System.out.println("   |         /   \\");
                        System.out.println("   |        |     |");
                        System.out.println("   |         \\_ _/");
                        System.out.println("   |           |");
                        System.out.println("   |           |");
                        System.out.println("   |");
                        System.out.println("___|___");
                }
                if (versuchen == 1) {
                        System.out.println("Wrong guess, try again");
                        System.out.println("   ____________");
                        System.out.println("   |          _|_");
                        System.out.println("   |         /   \\");
                        System.out.println("   |        |     |");
                        System.out.println("   |         \\_ _/");
                        System.out.println("   |           |");
                        System.out.println("   |           |");
                        System.out.println("   |          / \\ ");
                        System.out.println("___|___      /   \\");
                }
                if (versuchen == 0) {
                        System.out.println("GAME OVER!");
                        System.out.println("   ____________");
                        System.out.println("   |          _|_");
                        System.out.println("   |         /   \\");
                        System.out.println("   |        |     |");
                        System.out.println("   |         \\_ _/");
                        System.out.println("   |          _|_");
                        System.out.println("   |         / | \\");
                        System.out.println("   |          / \\ ");
                        System.out.println("___|___      /   \\");

                }
        }
}