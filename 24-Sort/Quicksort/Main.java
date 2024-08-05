import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Middle qiucksort
        int[] arrMiddle = { 1, 4, 7, 2, 6 };
        displayValues(arrMiddle);
        System.out.println("------Middle qiucksort-------");
        quickSort(arrMiddle, 0, arrMiddle.length - 1);
        displayValues(arrMiddle);

        // Median quicksort
        int[] arrMedian = { 1, 4, 7, 2, 6 };
        System.out.println("------Median quicksort------");
        quickSortMedian(arrMedian, 0, arrMedian.length - 1);
        displayValues(arrMedian);

        // Random quicksort
        int[] arrRandom = { 1, 4, 7, 2, 6 };
        System.out.println("------Random quicksort------");
        quickSortRandom(arrRandom, 0, arrRandom.length - 1);
        displayValues(arrRandom);

    }

    public static void displayValues(int[] arr) {
        for (int zahl : arr) {
            System.out.println(zahl);
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int middle = low + (high - low) / 2;
        swap(arr, middle, high);
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void quickSortRandom(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partitionRandom(arr, low, high);
            quickSortRandom(arr, low, pivotIndex - 1);
            quickSortRandom(arr, pivotIndex + 1, high);
        }
    }

    public static int partitionRandom(int[] arr, int low, int high) {
        Random rand = new Random();
        int randomIndex = low + rand.nextInt(high - low + 1);
        swap(arr, randomIndex, high);
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    public static void quickSortMedian(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partitionMedian(arr, low, high);
            quickSortMedian(arr, low, pivotIndex - 1);
            quickSortMedian(arr, pivotIndex + 1, high);
        }
    }

    public static int partitionMedian(int[] arr, int low, int high) {
        int mid = low + (high - low) / 2;
        int medianIndex = medianOfThree(arr, low, mid, high);
        swap(arr, medianIndex, high);
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    public static int medianOfThree(int[] arr, int a, int b, int c) {
        if ((arr[a] > arr[b]) != (arr[a] > arr[c])) {
            return a;
        } else if ((arr[b] > arr[a]) != (arr[b] > arr[c])) {
            return b;
        } else {
            return c;
        }
    }

}