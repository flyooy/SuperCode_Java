import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        String str = "hello hello hello World";
        Map<String, Integer> countStr = WortStrZaehlen(str);

        countStrAusgeben(countStr);

    }

    public static Map<String, Integer> WortStrZaehlen(String text) {
        Map<String, Integer> countStr = new HashMap<>();
        String[] woerter = text.split("\\s+");

        for (String wort : woerter) {
            if (!wort.isEmpty()) {
                wort = wort.toLowerCase();
                countStr.put(wort, countStr.getOrDefault(wort, 0) + 1);
            }
        }
        return countStr;
    }

    public static void countStrAusgeben(Map<String, Integer> countStr) {
        for (Map.Entry<String, Integer> entry : countStr.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
