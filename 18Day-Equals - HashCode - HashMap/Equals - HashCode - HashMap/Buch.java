import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Buch {
    private String titel;
    private String autor;
    private String isbn;

    // Konstruktor
    public Buch(String titel, String autor, String isbn) {
        this.titel = titel;
        this.autor = autor;
        this.isbn = isbn;
    }

    // Getter-Methoden
    public String getTitel() {
        return titel;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Buch{" + "titel='" + titel + '\'' + ", autor='" + autor + '\'' + ", isbn='" + isbn + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Buch buch = (Buch) o;
        return Objects.equals(titel, buch.titel) && Objects.equals(autor, buch.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titel, autor);
    }

    public static void main(String[] args) {
        Buch buch1 = new Buch("Der Herr der Ringe", "J.R.R. Tolkien", "978-3-123456-47-2");
        Buch buch2 = new Buch("Der kleine Prinz", "Antoine de Saint-Exupéry", "978-3-123456-48-9");
        Buch buch3 = new Buch("1984", "George Orwell", "978-3-123456-49-6");
        Buch buch4 = new Buch("Der Herr der Ringe", "J.R.R. Tolkien", "978-3-123456-50-2"); // Doppeltes Buch

        System.out.println(buch1.toString());
        System.out.println(buch2.toString());
        System.out.println(buch3.toString());

        System.out.println("buch1 equals buch2: " + buch1.equals(buch2));
        System.out.println("buch1 equals buch3: " + buch1.equals(buch3));

        System.out.println("buch1 hashCode: " + buch1.hashCode());
        System.out.println("buch2 hashCode: " + buch2.hashCode());
        System.out.println("buch3 hashCode: " + buch3.hashCode());

        HashMap<Buch, Integer> buchMap = new HashMap<>();

        addOrUpdateBook(buchMap, buch1, 10);
        addOrUpdateBook(buchMap, buch2, 2);
        addOrUpdateBook(buchMap, buch3, 8);
        addOrUpdateBook(buchMap, buch4, 7);

        for (Map.Entry<Buch, Integer> buch : buchMap.entrySet()) {
            System.out.println(buch.getKey() + " -> Anzahl der Exemplare: " + buch.getValue());
        }

        // Überprüfen, ob das Buch in der HashMap vorhanden ist
        Buch buchzuPruefen1 = new Buch("1984", "George Orwell", "978-3-123456-49-6");
        Buch buchzuPruefen2 = new Buch("Der kleine Prinz", "Antoine de Saint-Exupéry", "978-3-123456-48-9");

        if (buchMap.containsKey(buchzuPruefen1)) {
            System.out.println("Das Buch ist in der HashMap vorhanden.");
        } else {
            System.out.println("Das Buch ist nicht in der HashMap vorhanden.");
        }

        // Entferne das Buch aus der HashMap
        if (buchMap.containsKey(buchzuPruefen1)) {
            buchMap.remove(buchzuPruefen1);
            System.out.println(buchzuPruefen1 + " wird removed");
        } else {
            System.out.println("Das Buch ist nicht in der HashMap vorhanden.");
        }
        // Entferne das Buch aus der HashMap oder verringeren Anzahl
        removeOrUpdateBook(buchMap, buchzuPruefen2);

        for (Map.Entry<Buch, Integer> buch : buchMap.entrySet()) {
            System.out.println(buch.getKey() + " -> Anzahl der Exemplare: " + buch.getValue());
        }

    }

    public static void addOrUpdateBook(Map<Buch, Integer> buchMap, Buch buch, int anzahl) {
        buchMap.merge(buch, anzahl, Integer::sum);
    }

    public static void removeOrUpdateBook(Map<Buch, Integer> buchMap, Buch buch) {
        if (buchMap.containsKey(buch)) {
            int currentCount = buchMap.get(buch);
            if (currentCount > 1) {
                System.out.println("Fur " + buch + " wird anzahl verringeren");
                buchMap.put(buch, currentCount - 1);
            } else {
                System.out.println(buch + " wird removed");
                buchMap.remove(buch);
            }
        }
    }
}