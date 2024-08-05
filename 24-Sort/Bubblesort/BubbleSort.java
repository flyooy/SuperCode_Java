/**
 * BubbleSort
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = { 1, 4, 7, 2, 6 };
        printArr(arr);
        bubbleSortArray(arr);
        System.out.println("------------");
        printArr(arr);

    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void bubbleSortArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}