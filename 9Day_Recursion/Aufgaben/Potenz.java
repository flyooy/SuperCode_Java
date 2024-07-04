public class Potenz {
    public static void main(String[] args) {
        System.out.println(potenz(5,3));
    }
    
    public static int potenz(int x, int n) {
       
        if (n < 0){
        return -1;
    }
        if (n == 0)
            return 1;
        return potenz(x, n-1) * x;
    }
}
