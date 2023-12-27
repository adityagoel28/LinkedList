package LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("LinkedList program!");

        SortedLinkedList<Integer> sortedList = new SortedLinkedList<>();

        sortedList.add(70);
        sortedList.add(30);
        sortedList.add(56);
        System.out.println("LinkedList after adding elements:");
        sortedList.printList();

        // Use Case 3
        sortedList = new SortedLinkedList<>();
        sortedList.append(56);
        sortedList.append(30);
        sortedList.append(70);
        System.out.println("\nLinkedList after appending elements:");
        sortedList.printList();

        // Use Case 4
        sortedList = new SortedLinkedList<>();
        sortedList.append(56);
        sortedList.append(70);
        sortedList.insertAfter(sortedList.head, 30);
        System.out.println("\nLinkedList after inserting 30 between 56 and 70:");
        sortedList.printList();

        // Use Case 5
        sortedList.pop();
        System.out.println("\nLinkedList after deleting the first element:");
        sortedList.printList();

        // Use Case 6
        sortedList.popLast();
        System.out.println("\nLinkedList after deleting the last element:");
        sortedList.printList();

        // Use Case 7
        sortedList = new SortedLinkedList<>();
        sortedList.add(70);
        sortedList.add(30);
        sortedList.add(56);
        System.out.println("\nIs 30 present in the linked list? " + sortedList.search(30));

        // Use Case for inserting 40 after 30
        sortedList = new SortedLinkedList<>();
        sortedList.append(56);
        sortedList.append(30);
        sortedList.append(70);
        System.out.println("\nLinkedList before inserting 40:");
        sortedList.printList();

        Node<Integer> node30 = sortedList.findNode(30);
        if (node30 != null) {
            sortedList.insertAfter(node30, 40);
        }
        System.out.println("LinkedList after inserting 40 after 30:");
        sortedList.printList();

        sortedList = new SortedLinkedList<>();
        sortedList.append(56);
        sortedList.append(30);
        sortedList.append(40);
        sortedList.append(70);
        int length = sortedList.size();
        System.out.println(length);
        sortedList.deleteByKey(40);
        System.out.println("LinkedList Size after deleting 40:");
        length = sortedList.size();
        System.out.println(length);
        sortedList.printList();
    }
}
