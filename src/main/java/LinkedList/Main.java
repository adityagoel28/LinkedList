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

        list = new LinkedList();
        list.append(56);
        list.append(30);
        list.append(70);
        System.out.println("\nLinkedList after appending elements:");
        list.printList();
    }
}
