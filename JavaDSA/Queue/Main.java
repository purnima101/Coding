package JavaDSA.Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        System.out.println(queue.isEmpty());
        queue.enQueue(1);
        queue.enQueue(1);
        queue.enQueue(1);
        queue.enQueue(1);
        queue.enQueue(1);
        queue.enQueue(1);
    }

}
