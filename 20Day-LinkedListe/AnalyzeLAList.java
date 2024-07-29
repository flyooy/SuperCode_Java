import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AnalyzeLAList {

    private static final int WARMUP_SIZE = 100000;
    private static final int TEST_SIZE = 100000;

    public static void main(String[] args) {
        warmUp();

        System.out.println("Testing ArrayList:");
        List<Integer> arrayList = new ArrayList<>();
        performTests(arrayList);

        System.out.println("Testing LinkedList:");
        List<Integer> linkedList = new LinkedList<>();
        performTests(linkedList);

    }

    private static void warmUp() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < WARMUP_SIZE; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
    }

    private static void performTests(List<Integer> list) {
        // 1. Adding elements
        long startTime = System.nanoTime();
        for (int i = 0; i < TEST_SIZE; i++) {
            list.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("Time to add " + TEST_SIZE + " elements: " + (endTime - startTime) / 1e6 + " ms");

        // 2. Adding an element at the beginning
        startTime = System.nanoTime();
        list.add(0, -1);
        endTime = System.nanoTime();
        System.out.println("Time to add an element at the beginning: " + (endTime - startTime) / 1e6 + " ms");

        // 3. Removing an element from the middle
        startTime = System.nanoTime();
        list.remove(TEST_SIZE / 2);
        endTime = System.nanoTime();
        System.out.println("Time to remove an element from the middle: " + (endTime - startTime) / 1e6 + " ms");

        // 4. Accessing a specific element
        startTime = System.nanoTime();
        list.get(TEST_SIZE / 2);
        endTime = System.nanoTime();
        System.out.println("Time to access an element in the middle: " + (endTime - startTime) / 1e6 + " ms");

        // 5. Iterating through the list
        startTime = System.nanoTime();
        for (Integer i : list) {
            // Do nothing
        }
        endTime = System.nanoTime();
        System.out.println("Time to iterate through the list: " + (endTime - startTime) / 1e6 + " ms");

        // 6. Removing the first element
        startTime = System.nanoTime();
        list.remove(0);
        endTime = System.nanoTime();
        System.out.println("Time to remove the first element: " + (endTime - startTime) / 1e6 + " ms");
    }

}