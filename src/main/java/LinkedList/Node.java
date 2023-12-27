package LinkedList;

public class Node<T extends Comparable<T>> { // Ensure T is Comparable
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}
