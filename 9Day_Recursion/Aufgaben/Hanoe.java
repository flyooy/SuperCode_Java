public class Hanoe {
    public static void main(String[] args) {
        Tower(4,"A","B","C");
    }

    public static void Tower(int n, String first, String help, String end) {
       
        if (n == 1) {
            System.out.println("Move disk " + n + " from " + first + " to " + end);
        }
        else {
            Tower(n - 1, first, end, help);
            System.out.println("Move disk " + n + " from " + first + " to " + end);
            Tower(n - 1, help, first, end);
        }
    }
}