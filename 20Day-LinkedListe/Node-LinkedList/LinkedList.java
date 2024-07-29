public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);

    }

    public void prepend(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void insert(int index, int data) {
        if (index == 0) {
            prepend(data);
            return;
        }
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current.next == null)
                break;
            current = current.next;
        }
        Node newNode = new Node(data);
        newNode.next = current.next;
        current.next = newNode;
    }

    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public void delete(int index) {
        if (index == 0) {
            removeFirst();
            return;
        }

        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current.next == null)
                return;
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public int get(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            if (current == null)
                return 0;
            current = current.next;
        }
        return current != null ? current.data : null;
    }

    public void printList() {
        Node current = head;
        System.out.print("LinkedList: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public boolean isEmpty() {
        if (head != null) {
            return false;
        }
        return true;
    }

    