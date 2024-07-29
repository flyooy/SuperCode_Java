public class Main {
    public static void main(String[] args) {
        LinkedList zahlen = new LinkedList();
        System.out.println(zahlen.isEmpty());// true

        zahlen.append(1);
        zahlen.append(3);

        zahlen.insert(1, 0);
        System.out.println(zahlen.get(2));

        zahlen.printList();
        zahlen.delete(1);
        zahlen.printList();

    }
}
