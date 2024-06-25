public class DataTypeCombination {
    public static void main(String[] args) {
        int a = 10;
        double b = 5.5;
        char c = 'A'; //65
        String text = "Hallo";

        Double result1 = a + b + c;
        System.out.println("Result 1 ist: " + result1);

        int result2 = a * c;
        System.out.println("Result 2 ist: " + result2);

        Double result3 =  b / c;
        System.out.println("Result 3 ist: " + result3);

        String result4 =  text + c;
        System.out.println("Result 4 ist: " + result4);
    }

}