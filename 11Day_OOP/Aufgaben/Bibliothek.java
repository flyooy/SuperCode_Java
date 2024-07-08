public class Bibliothek {
    public static void main(String[] args) {

        Buch[] buecher = new Buch[5];
        buecher[0] = new Buch("Der Zauberberg", "Thomas Mann", 123, 1008);
        buecher[1] = new Buch("Die Verwandlung", "Franz Kafka", 987, 76);
        buecher[2] = new Buch("Faust", "Johann Wolfgang von Goethe", 112, 304);
        buecher[3] = new Buch("Die Blechtrommel", "Günter Grass", 556, 592);
        buecher[4] = new Buch("Berlin Alexanderplatz", "Alfred Döblin", 998, 656);
        for (int i = 0; i < buecher.length; i++) {
            System.out.println("Buch #" + (i + 1));
            buecher[i].printDetails();
            System.out.println();
        }
        System.out.println("-----------------------");
        int isbnToSearch = 987;
        Buch gefundeneBuch = Buch.sucheNachISBN(buecher, isbnToSearch);
         if (gefundeneBuch != null) {
            System.out.println("Buch gefunden:");
            gefundeneBuch.printDetails();
        } else {
            System.out.println("Buch mit ISBN " + isbnToSearch + " nicht gefunden.");
        }
    }
}
    
    
  

