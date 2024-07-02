public class Palindrom {

    public static void main(String[] args) {
        System.out.println("Palindrom \"Amok Oma\"?");
        palindrom("Amok Oma");
        System.out.println("Palindrom \"Ein Esel lese nie\"?");
        palindrom("Ein Esel lese nie");
        System.out.println("Palindrom \"Anna\"?");
        palindrom("Anna");
        System.out.println("Palindrom \"Lagerregal\"?");
        palindrom("Lagerregal");
        System.out.println("Palindrom \"Milch\"?");
        palindrom("Milch");
    }
    
    public static boolean palindrom(String Text) {
        StringBuilder StrOne = new StringBuilder();
        StringBuilder StrTwo = new StringBuilder();
        char currentOne;
        char currentTwo;
        for (int i = 0; i < Text.length(); i++) {
            currentOne = Text.charAt(i);
            if (currentOne==' ') continue;
            StrOne.append(currentOne);
        }

        for (int i = Text.length()-1; i >= 0; i--) {
            currentTwo = Text.charAt(i);
            if (currentTwo==' ') continue;
            StrTwo.append(currentTwo);
        }

        if (StrOne.toString().equalsIgnoreCase(StrTwo.toString())) {
            System.out.println("Ja, das ist Palindrom");
            return true;
        } else {
            System.out.println("Nein, das ist nicht Palindrom");
            return false;
        }
    }
}