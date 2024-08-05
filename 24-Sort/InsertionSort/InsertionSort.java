/**
 * InsertionSort
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = { 5, 4, 6, 2, 7 };
        printArr(arr);
        insertionSortArr(arr);
        System.out.println("-------------");
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void insertionSortArr(int[] arr) {
        if (arr.length == 1 || arr.length == 0) {
            System.out.println("Array shon sortiert");
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }
}