public class Fakultaet {

    public static void main(String[] args) {
        System.out.println(fakultaet(0));
    }
    
    public static int fakultaet(int n) {
        
       
        if (n==0) return 1;
        else {
            return fakultaet(n - 1) * n;
        }
    }
}