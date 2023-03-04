package linkedlist;

public class LinkedList {
    private int length;
    private Node head;
    private Node tail;


    public void printList() {
        Node temp = head;
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

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public Node removeLast() {
        if (length==0){
            System.out.println("List is Empty");
            return null;
        } else if (length == 1) {
            int value = head.value;
            head= null;
            tail=null;

            System.out.println("Removed: "+ value);
            length--;
            return null;
        }else {
            Node temp = head;
            Node prev =head;
            while (temp.next != null){
                prev= temp;
                temp = temp.next;
            }
            prev.next=null;
            tail = prev;
            System.out.println("Removed: "+ temp.value);
            length--;
            return temp;


        }
    };
    public void prepend(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if (tail==null){
            tail = newNode;
        }
        length++;
    }

    public Node removeFirst(){
        Node temp = head;
        if (length==0){
            System.out.println("Empty List");
            return null;
        } else if (length==1) {
            head = null;
            tail = null;
        }else {
            head = head.next;
        }
        length--;
        System.out.println("Removed "+ temp.value);
        return temp;
    }

    public Node get(int index){
        Node temp = head;
        int counter = 0;
       while (temp!=null){
           if (counter<index){
               temp = temp.next;
               counter++;
           }else if (counter==index) {
               System.out.println("Node "+index +" = "+ temp.value);
               return temp;
           }else {
               break;
           }

       }

        System.out.println("Index out of Range");
        return null;
    }


    public boolean set(int index, int value){
        Node temp = get(index);
        if (temp!= null){
            temp.value = value;
            return true;
        }


        System.out.println("Index out of Range");
        return false;
    }

    public boolean insert(int index, int value){
        if (index<0||index>length)return false;
        if (index==0){
            prepend(value);
            return true;
        }
        if (index==length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index-1);
        newNode.next = temp.next;
        temp.next= newNode;
        length++;
        return true;
    }

    public Node remove(int index){
        if (index<0||index>=length) return null;
        if(index==0)return removeFirst();
        if (index ==length-1) return removeLast();
        Node prev = get(index-1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next=null;
        length--;
        return temp;


    }

    public void reverse(){


        Node temp = head;
        Node prev = null;
        while (head!=null){
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
            System.out.println("rev"+prev.value);
        };
        head = prev;
        tail = temp;
    }
    class Node {
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }
    public LinkedList( int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length=1;
    }
    public void append(int value){
        Node newNode = new Node(value);
        if (length==0){
            head = newNode;
        }else {
            tail.next = newNode;
        }
        tail = newNode;
        length++;

    }
}
