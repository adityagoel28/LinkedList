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

        // Use Case 7
        list = new LinkedList();
        list.add(70);
        list.add(30);
        list.add(56);
        System.out.println("\nIs 30 present in the linked list? " + list.search(30));

        // Use Case for inserting 40 after 30
        list = new LinkedList<>();
        list.append(56);
        list.append(30);
        list.append(70);
        System.out.println("\nLinkedList before inserting 40:");
        list.printList();

        Node<Integer> node30 = list.findNode(30);
        if (node30 != null) {
            list.insertAfter(node30, 40);
        }
        System.out.println("LinkedList after inserting 40 after 30:");
        list.printList();
    }
}
