import org.w3c.dom.Text;

public class Recursion {

    public static void main(String[] args) {
        isPalindrome("otto");
    }
    
    public static boolean isPalindrome(String input) {
        
        int count = input.length();
        StringBuilder Str = new StringBuilder();

        if (count <= 0) {
            return false;
        }
        char c = input.charAt(count-1);
        isPalindrome(" " + c);
        Str.append(c);
        System.out.println(Str);
        if (input.equals(Str.toString()))
            return true;
            
        return true;
    }
}