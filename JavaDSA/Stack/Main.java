package JavaDSA.Stack;

public class Main {
    public static void main(String[] args) {
        Stack newStack = new Stack(4);
        boolean empty = newStack.isEmpty();
        boolean full = newStack.isFull();
        // System.out.println(full);
        newStack.insert(6);
        newStack.insert(5);
        newStack.insert(4);
        newStack.insert(3);
        // newStack.insert(2);
        // System.out.println("pop: " + newStack.pop());
        System.out.println("peek: " + newStack.peek());
    }

}
