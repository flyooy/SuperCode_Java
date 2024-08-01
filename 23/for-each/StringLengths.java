import java.util.*;
public class StringLengths {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hallo", "Welt", "Java", "Programmierung");

        strings.forEach(s-> System.out.println(s + ": " + s.length()));
    }
}
