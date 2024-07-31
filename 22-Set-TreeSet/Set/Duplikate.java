import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplikate {
    public static void main(String[] args) {
        List<Integer> listMitDuplikate = Arrays.asList(1, 2, 3, 4, 5, 1);
        System.out.println(listMitDuplikate);
        Set<Integer> setOhneDuplikate = new HashSet<>(listMitDuplikate);
        List<Integer> listOhneDuplikate = new ArrayList<>(setOhneDuplikate);
        System.out.println(listOhneDuplikate);

    }

}
