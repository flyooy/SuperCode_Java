import java.util.ArrayList;
import java.util.List;

public class MyOwnStack<T> {
    private List<T> elements = new ArrayList<>();

    public MyOwnStack() {
        elements = new ArrayList<>();
    }

    public void push(T item) {
        elements.add(item);
    }

    public T pop() {
        if (elements.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements.remove(elements.size() - 1);
    }

    public T peek() {
        if (elements.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements.get(elements.size() - 1);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int size() {
        return elements.size();
    }

    public void clear() {
        elements.removeAll(elements);
    }

    public static void main(String[] args) {
        MyOwnStack<Integer> stack = new MyOwnStack<>();
        System.out.println(stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.isEmpty());
        System.out.println("Stack size is: " + stack.size());
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Stack size is: " + stack.size());
        stack.clear();
        System.out.println("Stack size is: " + stack.size());

    }
}
