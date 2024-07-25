import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String str = "hello";
        Map<Character, Integer> countStr = buchstabenStrZaehlen(str);
        countStrAusgeben(countStr);
    }

    public static Map<Character, Integer> buchstabenStrZaehlen(String text) {
        Map<Character, Integer> countStr = new HashMap<>();
   
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                countStr.put(c, countStr.getOrDefault(c, 0) + 1);
            }
        }
        return countStr;
    }

    public static void countStrAusgeben(Map<Character, Integer> countStr) {
        for (Map.Entry<Character, Integer> entry : countStr.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}