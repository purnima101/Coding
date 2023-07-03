package JavaDSA.SingleLL;
import java.util.*;
public class SingleLinkedList {
    public Node head;
    public Node tail;
    public int size;
    
    public Node createNode(int nodeValue){
        head=new Node();
        tail=new Node();
        Node node=new Node();
        node.value=nodeValue;
        node.next=null;
        head.next=node;
        tail.next=node;
        size=1;
        return head;
    }

    public void insertNode(int nodeValue, int location)
    {
        
    }

}
