package JavaDSA.Stack;

public class StackLL {
    public StackNode head;
    public StackNode tail;
    public int size;

    public StackNode createNode(int nodeValue) {
        head = new StackNode();
        tail = new StackNode();
        StackNode node = new StackNode();
        node.value = nodeValue;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // push
    public void insertNode(int nodeValue) {
        StackNode node = new StackNode();
        node.value = nodeValue;
        if (head == null) {
            createNode(nodeValue);
        } else {
            node.next = head;
            head = node;

        }

        size++;
        System.out.println("done");
    }

    // isEmplty

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    // pop
    public int pop() {
        int result = -1;
        if(isEmpty())
        {
            return result; 
        }
        
        result = head.value;
        head = head.next;
        return result;
    }
        //peek
    public int peek(){
        int result = -1;
        if(isEmpty())
        {
            return result; 
        }
        
        result = head.value;
        return result;
    }

    //Delete
    public void delete(){
        head = null;
        System.out.println("Stack Deleted");
    }
}
