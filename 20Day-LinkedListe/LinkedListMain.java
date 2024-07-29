import java.util.Collections;
import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<>();
        String[] names = { "Alice", "Bob", "Charlie", "Diana", "Eve" };
        for (String name : names) {
            students.add(name);
        }

        students.add(0, "Zara");
        students.add("Fred");

        String firstElement = students.get(0);
        String lastElement = students.get(students.size() - 1);
        String thirdElement = students.get(2);

        System.out.println("LinkedList: " + students);
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);
        System.out.println("Third element: " + thirdElement);

        students.remove(0);
        students.remove(students.size() - 1);
        students.remove(1);

        firstElement = students.get(0);
        lastElement = students.get(students.size() - 1);
        thirdElement = students.get(2);

        System.out.println("LinkedList: " + students);
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);
        System.out.println("Third element: " + thirdElement);

        boolean hasAlice = students.contains("Alice");
        boolean hasEve = students.contains("Eve");
        int charlieIndex = students.indexOf("Charlie");

        System.out.println("Contains 'Alice': " + hasAlice);
        System.out.println("Contains 'Eve': " + hasEve);
        System.out.println("Index of 'Charlie': " + charlieIndex);

        System.out.println("Iterating over all elements:");
        for (String student : students) {
            System.out.println(student);
        }

        // Erstellen und Befüllen der neuen LinkedList
        LinkedList<String> newStudents = new LinkedList<>();
        newStudents.add("George");
        newStudents.add("Hannah");

        students.addAll(newStudents);
        Collections.sort(students);
        System.out.println("Sorted LinkedList: " + students);

        int k = 3; 
        try {
            String kthFromEnd = getKthFromEnd(students, k);
            System.out.println("Das " + k + "-te Element von hinten ist: " + kthFromEnd);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String getKthFromEnd(LinkedList<String> list, int k) {
        int size = list.size();
        if (k <= 0 || k > size) {
            throw new IllegalArgumentException("Index k ist außerhalb des gültigen Bereichs.");
        }
        return list.get(size - k);
    }
}
