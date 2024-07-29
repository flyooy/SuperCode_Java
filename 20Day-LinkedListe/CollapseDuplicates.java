import java.util.LinkedList;

public class CollapseDuplicates {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        int[] zahlen = { 1, 1, 2, 2, 3, 1, 1 };

        for (int zahle : zahlen) {
            list.add(zahle);
        }
        for (int zahle : list) {
            System.out.print(zahle + " ");
        }
        collapseDuplicates(list);
        System.out.println();

        for (int zahle : list) {
            System.out.print(zahle + " ");
        }

    }

    public static void collapseDuplicates(LinkedList<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1).equals(list.get(i))) {
                list.remove(i);
            }
        }
    }
}
