package JavaDSA.SingleLL;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        SingleLinkedList sll=new SingleLinkedList();
        sll.createNode(23);
        System.out.println(sll.head.next.value);
    }
}
