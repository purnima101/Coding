package JavaDSA.Stack;

public class Stack {
    int[] arr;
    int top;

    // Contsructor method
    public Stack(int size) {
        this.arr = new int[size];
        this.top = -1;
        System.out.println("Stack Created");
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (top == arr.length - 1) {
            return true;
        }
        return false;
    }

    public void insert(int value)
    {
        if(isFull())
        {
            System.out.println("Stack is full, cannot insert value");
        }
        else{
            arr[top+1]=value;
            top++;
            System.out.println("Value inserted");
        }
    }

    public int pop()
    {
        if(isEmpty())
        {
            return -1;
        }
        else{
            int val = arr[top];
            top--;
            return val;
        }
    }

    public int peek(){
        if(isEmpty())
        {
            return -1;
        }
        else{
            return arr[top];
        }
    }

}
