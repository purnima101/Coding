package JavaDSA.Queue;

public class Queue {
    int[] arr;
    int start;
    int end;

    // Contsructor method
    public Queue(int size) {
        this.arr = new int[size];
        this.start = -1;
        this.end = -1;
        System.out.println("Queue Created");
    }

    public boolean isFull(){
        if(end == arr.length-1)
        {
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(start == -1 || start ==arr.length)
        {
            return true;
        }
        return false;
    }

    public void enQueue(int value)
    {
        if (isFull())
        {
            System.out.println("Queue is full");
        
        }
        else{
            if(isEmpty())
            {
            start = 0;
            end++;
            arr[end] = value;
            }

            else{
                end++;
                arr[end] = value;
            }
            System.out.println("Element inserted");
        }
    }
}
