import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class EindeutigeElemente<T> {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, 2, 3, 4, 5, 1);

        boolean b = hasUniqueElements(a);

        System.out.println("Gibt Set Eindeuitige Elemente? " + b);
    }

    public static <T> boolean hasUniqueElements(List<T> list) {
        Set<T> set = new HashSet<>(list);
        return set.size() == list.size();
    }
}
