package LinkedList;

public class LinkedList<T> {
    Node<T> head;

    LinkedList() {
    }

    public void add(T data) {
        Node<T> newNode = new Node(data); // Create a new node with the given data
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
}
