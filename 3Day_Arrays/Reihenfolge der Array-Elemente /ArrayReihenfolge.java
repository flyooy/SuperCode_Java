public class ArrayReihenfolge {

    public static void main(String args[]) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int b = 0;
        int c = arr.length - 1;
        int i = 0;
        for (i = 0; i < arr.length/2; i++) {
                b = arr[i];
                arr[i] = arr[c];
                arr[c] = b;
                c--;

            }
        
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
       
    }
}
