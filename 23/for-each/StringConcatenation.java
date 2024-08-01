/**
 * StringConcatenation
 */
import java.util.Arrays;
import java.util.List;
public class StringConcatenation {
public static void main(String[] args) {
    List<String> strings = Arrays.asList("Hallo", " ", "Welt", "!");
    StringBuilder result = new StringBuilder();

    strings.forEach(s -> result.append(s));
    System.out.println(result.toString());
}
    
}