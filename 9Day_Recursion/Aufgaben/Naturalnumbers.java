public class Naturalnumbers {
    public static void main(String[] args) {
        System.out.println(naturalNumbers(5));
    }
    
    public static int naturalNumbers(int n) {
        if (n <= 0)
            return 0;
        return naturalNumbers(n-1) + n;
    }
}
