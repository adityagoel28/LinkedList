package LinkedList;

public class LinkedList<T> {
    Node<T> head;

    LinkedList() {
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data); // Create a new node with the given data
        newNode.next = this.head; // Make the next of the new node as the head node
        this.head = newNode; // Make the new node as the head node
    }

    public void printList() {
        Node<T> temp = this.head; // Starting traversing from the head node
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // append
    public void append(T data) {
        Node<T> newNode = new Node<>(data); // Create a new node with the given data
        if (this.head == null) { // If the linked list is empty, make the new node as the head node
            this.head = newNode;
            return;
        }
        Node<T> temp = this.head; // Starting traversing from the head node
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode; // Make the new node as the last node
    }

    public void insertAfter(Node<T> prevNode, T data) {
        if (prevNode == null) {
            System.out.println("Previous node cannot be null");
        } else {
            Node<T> newNode = new Node<>(data);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
    }

    public void pop() {
        if (this.head != null) {
            this.head = this.head.next;
        }
    }

    public void popLast() {
        if (this.head == null) {
            return;
        }
        if (this.head.next == null) { // If there is only one element in the linked list, make the head node as null
            this.head = null;
            return;
        }
        Node<T> temp = this.head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public boolean search(T data) {
        Node<T> temp = this.head;
        while (temp != null) {
            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public Node<T> findNode(T data) {
        Node<T> temp = this.head;
        while (temp != null) {
            if (temp.data.equals(data)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void deleteByKey(T key) {
        Node<T> temp = head, prev = null;

        // If head node itself holds the key
        if (temp != null && temp.data.equals(key)) {
            head = temp.next; // Changed head
            return;
        }

        // Search for the key to be deleted
        while (temp != null && !temp.data.equals(key)) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null) return;

        // Unlink the node from linked list
        prev.next = temp.next;
    }

    public int size() {
        int count = 0;
        Node<T> temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}
