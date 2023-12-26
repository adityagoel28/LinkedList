package LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("LinkedList program!");

        LinkedList<Integer> list = new LinkedList();
        list.add(70);
        list.add(30);
        list.add(56);
        System.out.println("LinkedList after adding elements:");
        list.printList();

        // Use Case 3
        list = new LinkedList();
        list.append(56);
        list.append(30);
        list.append(70);
        System.out.println("\nLinkedList after appending elements:");
        list.printList();

        // Use Case 4
        list = new LinkedList();
        list.append(56);
        list.append(70);
        list.insertAfter(list.head, 30);
        System.out.println("\nLinkedList after inserting 30 between 56 and 70:");
        list.printList();

        // Use Case 5
        list.pop();
        System.out.println("\nLinkedList after deleting the first element:");
        list.printList();

        // Use Case 6
        list.popLast();
        System.out.println("\nLinkedList after deleting the last element:");
        list.printList();
    }
}
