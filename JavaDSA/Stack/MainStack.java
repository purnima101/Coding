package JavaDSA.Stack;

public class MainStack {
    public static void main(String[] args) {
        StackLL newStack = new StackLL();
        newStack.insertNode(1);
        newStack.insertNode(2);
        newStack.insertNode(3);
        System.out.println(newStack.isEmpty());
        System.out.println(newStack.pop());
    }
}
