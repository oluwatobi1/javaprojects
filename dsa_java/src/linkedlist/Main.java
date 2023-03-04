package linkedlist;

import dsa.DoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        DoubleLinkedList myDoubleLinkedList = new DoubleLinkedList(2);
        myDoubleLinkedList.append(3);
        myDoubleLinkedList.append(4);
        myDoubleLinkedList.prepend(5);
        System.out.println("\nDouble Linked List");
        myDoubleLinkedList.printList();
        System.out.println("Double " + myDoubleLinkedList.removeLast().value);

        System.out.println("\nDouble Linked List");
        myDoubleLinkedList.printList();

    }

}
