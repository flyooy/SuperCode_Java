import java.util.Arrays;

public class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public static <T> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(123);
        System.out.println("Inhalt der intBox: " + intBox.getContent());

        Box<String> strBox = new Box<>("Hallo Welt");
        System.out.println("Inhalt der strBox: " + strBox.getContent());

        Integer[] intArray = { 1, 2, 3, 4, 5 };
        System.out.println("Vor dem Tausch: " + Arrays.toString(intArray));
        swap(intArray, 1, 3);
        System.out.println("Nach dem Tausch: " + Arrays.toString(intArray));

        String[] strArray = { "A", "B", "C", "D" };
        System.out.println("Vor dem Tausch: " + Arrays.toString(strArray));
        swap(strArray, 0, 2);
        System.out.println("Nach dem Tausch: " + Arrays.toString(strArray));

    }
}