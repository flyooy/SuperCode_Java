import java.util.*;

// Benutzerdefinierte Klasse, die Comparable implementiert
class Person implements Comparable<Person> {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public int compareTo(Person other) {
        // Sortieren nach Alter
        return Integer.compare(this.age, other.age);
    }
    
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class TreeMapCustomObjects {
    public static void main(String[] args) {
        
        // Erstellen einer TreeMap mit natürlicher Ordnung der Person-Objekte (nach Alter)
        TreeMap<Person, String> treeMap = new TreeMap<>();
        treeMap.put(new Person("Alice", 30), "Alice's Info");
        treeMap.put(new Person("Bob", 25), "Bob's Info");
        treeMap.put(new Person("Charlie", 35), "Charlie's Info");
        
        // Anzeigen der Elemente der TreeMap in natürlicher Ordnung
        System.out.println("TreeMap nach Alter sortiert: " + treeMap);
        
        // Erstellen einer TreeMap mit benutzerdefiniertem Comparator (nach Name)
        TreeMap<Person, String> treeMapByName = new TreeMap<>(Comparator.comparing(p -> p.name));
        // TreeMap<Person, String> peopleByAgeDesc = new TreeMap<>(Comparator.comparingInt(Person::getAge).reversed());
        
        treeMapByName.put(new Person("Alice", 30), "Alice's Info");
        treeMapByName.put(new Person("Bob", 25), "Bob's Info");
        treeMapByName.put(new Person("Charlie", 35), "Charlie's Info");
        
        // Anzeigen der Elemente der TreeMap nach Namen sortiert
        System.out.println("TreeMap nach Namen sortiert: " + treeMapByName);
    }
}
