public class CompareToUndSubstring{
    public static void main(String[] args) {
        String s = "Programmieren";
        System.out.println(substring(s, 3, 7));
      
      
        String s1 = "Hallo";
        String s2 = "Hallo";
        int result = compareTo(s1, s2);
        System.out.println(result);
    }


    public static int compareTo(String textOne, String textTwo) {
        int minLength = Math.min(textOne.length(), textTwo.length());
        int resultOne = 0;
        int resultTwo = 0;
        for (int i = 0; i < minLength; i++) {
            char currentOne = textOne.charAt(i);
            resultOne = (int) currentOne + resultOne;
            char currentTwo = textTwo.charAt(i);
            resultTwo = (int) currentTwo + resultTwo;
            if (currentOne != currentTwo) {
                return resultOne - resultTwo;
            }

        }
        return textOne.length() - textTwo.length();
    }
    

    public static String substring(String Text, int firstLetter, int lastLetter) {

        String c = "";
        for (int i = firstLetter; i < lastLetter; i++) {
            char current = Text.charAt(i);
            c += current;

        }
        return c;
    }
}