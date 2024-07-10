import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
public class MainArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> zahlen = new ArrayList<>();
        zahlen.add(1);
        zahlen.add(2);
        zahlen.add(3);
        zahlen.add(4);
        zahlen.add(5);

        zahlen.remove(2);// remove 3;

        zahlen.size();//Grose Array
        zahlen.get(2);//Gib Element auf pos 2 aus

        for (Integer z : zahlen) {
            System.out.println(z);
        }
        System.out.println("-------Sort------");
        zahlen.add(-1);
        zahlen.add(8);
        Collections.sort(zahlen, (o1, o2) -> o1 - o2);

        for (Integer z : zahlen) {
            System.out.println(z);
        }

        System.out.println("-------Contains-----");
        System.out.println(zahlen.contains(4));

        ArrayList<Integer> zahl = new ArrayList<>(zahlen.subList(0, 2));
        System.out.println("-------SubList-----");
        for (Integer z : zahl) {
            System.out.println(z);
        }

        zahlen.add(3);
        zahlen.add(3);
        zahlen.add(3);
        System.out.println("-------Mit Duplikate-----");
        for (Integer z : zahlen) {
            System.out.println(z);
        }
        System.out.println("-------Ohne Duplikate-----");
        ArrayList<Integer> zahlenOhneDuplikate = entferneDuplikate(zahlen);
        for (Integer z : zahlenOhneDuplikate) {
            System.out.println(z);
        }
    }

    
     public static ArrayList<Integer> entferneDuplikate(ArrayList<Integer> list) {
        
        HashSet<Integer> set = new HashSet<>(list);
        
        return new ArrayList<>(set);
    }
}
