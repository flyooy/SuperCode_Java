import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 4, 3, 2, 1 };
        System.out.println(haveSameElements(arr1, arr2));//true
        int[] arr3 = { 1, 2, 2, 4 };
        int[] arr4 = { 4, 2, 1, 1 };
        System.out.println(haveSameElements(arr3, arr4));//false
    }

    public static boolean haveSameElements(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length)
            return false;
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);

    }
}