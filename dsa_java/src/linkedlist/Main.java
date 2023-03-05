package linkedlist;

import doublelinkedlist.DoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        DoubleLinkedList myDoubleLinkedList = new DoubleLinkedList(2);
        myDoubleLinkedList.append(3);
        myDoubleLinkedList.append(4);
        myDoubleLinkedList.prepend(5);
        myDoubleLinkedList.prepend(6);
        myDoubleLinkedList.prepend(8);
        System.out.println("\nDouble Linked List");
        myDoubleLinkedList.printList();
        System.out.println("Double " + myDoubleLinkedList.removeLast().value);
        myDoubleLinkedList.removeFirst();
        System.out.println("Get " + myDoubleLinkedList.get(3).value);
        System.out.println("Set " + myDoubleLinkedList.set(3, 5));
        System.out.println("Set " + myDoubleLinkedList.insert(3, 10));

        System.out.println("Length" + myDoubleLinkedList.length);
        System.out.println("remove" + myDoubleLinkedList.remove(4));

        System.out.println("\nDouble Linked List");
        myDoubleLinkedList.printList();

    }


}
