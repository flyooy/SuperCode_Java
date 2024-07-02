public class StringProcessing {
    public static void main(String[] args) {
        indexOf("Hello Freunde!", "bl");
    }

    public static int indexOf(String input, String search) {

        int result = input.indexOf(search);
        if (result != -1)
            System.out.println("Substring '" + search + "' found at index: " + result);
        else {
            System.out.println("Substring '" + search + "' not found");
        }
        return result;
    }
    

    
    public static String toLowerCase(String input) {
        StringBuilder lowerStr = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + 32);
            }
            lowerStr.append(c);
        }
        System.out.println("Original string: " + input);
        System.out.println("Lowercase string: " + lowerStr);
        return lowerStr.toString();
    }
}