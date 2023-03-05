package stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        System.out.println("Initial Stack");
        stack.printList();
        stack.pop();
        stack.pop();
        System.out.println("\nFinal Stack");
        stack.printList();
        stack.getHeight();
    }
}
