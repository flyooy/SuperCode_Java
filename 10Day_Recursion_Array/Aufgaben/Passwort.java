

public class Passwort {
    public static void main(String[] args) {
        System.out.println("Das Erlernen von Java macht so viel Spass-->");
        StringBuilder result = passGenFirst("Das Erlernen von Java macht so viel Spass");
        StringBuilder result2 = passGenLast("Das Erlernen von Java macht so viel Spass");
        System.out.println(result.toString());
        System.out.println(result2.toString());
    }

    public static StringBuilder passGenFirst(String input) {
        StringBuilder Str = new StringBuilder();

        String[] words = input.split(" ");

        for (int i = 0; i < words.length; i++) {
            char current = words[i].charAt(0);
            Str.append(current);
        }
        
        return Str;
    }
    
    public static StringBuilder passGenLast(String input) {
        StringBuilder Str = new StringBuilder();
      
        
        String[] words = input.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            char current = words[i].charAt(words[i].length()-1);
            Str.append(current);
        }
        
        
        for (int i = 0; i < Str.length(); i++) {
            if (i % 2 == 0) { 
                char c = Str.charAt(i);
                Str.setCharAt(i, Character.toUpperCase(c));
            }
        }
        return Str;
    } 
}
