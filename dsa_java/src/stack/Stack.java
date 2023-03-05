package stack;

public class Stack {


    private Node top;
    private int height = 0;

    public Node getTop() {
        return top;
    }

    public void getHeight() {
        System.out.println("Height "+ height);
    }

    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    public void printList(){
        Node temp = top;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;

        }
    };

    public Stack(int value){
        Node node = new Node(value);
        top = node;
        height = 1;
    }

    public void push(int value){
        Node node = new Node(value);
        if (height == 0){
            top = node;
            height++;
            return;

        }
        node.next = top;
        top = node;
        height++;
    }

    public Node pop(){
        Node temp = top;
        if (height ==0) return null;
        top = top.next;
        temp.next = null;
        height--;
        return temp;
    }



}