import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String str1 = "hello world";
        String str2 = "world hello";
        System.out.println(haveSameElements(str1, str2));
    }

    public static boolean haveSameElements(String str1, String str2) {

        if (str1.length() != str2.length())
            return false;
        HashMap<Character, Integer> countMap1 = new HashMap<>();
        for (char c : str1.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                countMap1.put(c, countMap1.getOrDefault(countMap1, 0) + 1);

            }
        }
        HashMap<Character, Integer> countMap2 = new HashMap<>();
        for (char c : str2.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                countMap2.put(c, countMap2.getOrDefault(countMap2, 0) + 1);

            }
        }

        return countMap1.equals(countMap2);

    }
}