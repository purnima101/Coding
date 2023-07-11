package JavaDSA.SingleLL;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        SingleLinkedList sll=new SingleLinkedList();
        sll.createNode(23);
        sll.insertNode(12,1);
        sll.insertNode(16,2);
        sll.insertNode(19,1);
        sll.traversal();
        sll.search(1);
    }
}
