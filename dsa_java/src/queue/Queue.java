package queue;

import stack.Stack;

public class Queue {
    private Node first;
    private Node last;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Queue(int value) {
        Node node = new Node(value);
        first = node;
        last = node;
        length = 1;
    }

    public void getFirst() {
        System.out.println("First " + first.value);
    }

    public void getLast() {
        System.out.println("Last " + last.value);
    }

    public void getLength() {
        System.out.println("Length " + length);
    }

    public void printQueue(){
        Node temp = first;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    };

    public void enqueue(int value){
        Node node = new Node(value);
        if (length ==0){
            first = node;
        }else {
            last.next = node;
        }
        last = node;
        length++;
    }

    public Node dequeue(){
        if (length==0)return null;
        Node node = first;
        if (length == 1){
            first = null;
            last = null;
        }else {
            first = first.next;
            node.next = null;
        }
        length--;
        return node;
    }

}