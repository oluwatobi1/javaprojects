package dsa;

import linkedlist.LinkedList;

public class DoubleLinkedList {
    private Node head;
    private Node tail;
    public int length;

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
            head.prev = node;
            node.next = head;
            head = node;
        }
        length++;
    }

    public Node removeFirst(){
        if (length == 0) return null;
        Node temp = head;
        if (length == 1) {
            head = null;
            tail = null;
        }else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public Node get(int index){
        if (index<0 || index >= length) return null;
        Node temp = head;
        if (index < length/2){
            for (int i = 0; i < index; i++) {
                temp = temp.next;
                System.out.println("temp" +temp.value);
            };
        }else {
            temp = tail;
            for (int i = length-1; i > index; i--) {
                temp = temp.prev;
                System.out.println("temp" +temp.value);

            }
        }
        return temp;
    }

    public boolean set(int index, int value){
        Node currNode = get(index);
        if (currNode != null){
            currNode.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value){
        if (index < 0 || index >= length) return false;
        if (index == 0){
            prepend(value);
            return true;
        }
        if (index == length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node currNode = get(index-1 );
        Node temp = currNode.next;
        newNode.prev = currNode;
        newNode.next = temp;
        currNode.next = newNode;
        temp.prev = currNode;
        length++;
        return true;
    }
    public Node remove(int index){
        if (index < 0 || index >= length) return null;
        if (index == 0)return removeFirst();
        if (index == length-1)return removeLast();
        Node currNode = get(index);
        System.out.println("valss"+currNode.value);
        currNode.next.prev = currNode.prev;
        currNode.prev.next = currNode.next;
        currNode.next = null;
        currNode.prev = null;
        length--;
        return currNode;
    }

}
