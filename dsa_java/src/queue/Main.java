package queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(9);
        queue.getFirst();
        queue.getLast();
        System.out.println("Initial Queue");
        queue.printQueue();
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.dequeue();

        System.out.println("\nFinal Queue");
        queue.printQueue();
    }
}
