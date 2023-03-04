package dsa;

import linkedlist.LinkedList;

public class DoubleLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public class Node {
        public int value;
        Node prev;
        Node next;
        Node(int value){
            this.value = value;
        }
    }


    public void printList() {
        DoubleLinkedList.Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public DoubleLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int value){
        Node newNode = new Node(value);
        if (length == 0){
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
        length++;
    }

    public Node removeLast() {
        if (length == 0) return null;
        Node temp = tail;
        if (length == 1) {
            head.prev = null;
            head.next = null;
            length--;
            return temp;
        }
        tail = tail.prev;
        tail.next = null;
        length--;
        return temp;

    }

    public void prepend(int value){
        Node node = new Node(value);
        if (length==0){
            head = node;
            tail  = node;
        }else {
            node.prev = head;
            head = node;
        }
        length++;
    }

}
