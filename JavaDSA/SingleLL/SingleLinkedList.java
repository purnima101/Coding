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
        head=node;
        tail=node;
        size=1;
        return head;
    }

    public void insertNode(int nodeValue, int location)
    {
        Node node=new Node();
        node.value=nodeValue;
        if(head==null){
            createNode(nodeValue);
        }
        else if(location==0){
            node.next=head;
            head=node;
        }
        else if(location>=size){
            node.next=null;
            tail.next=node;
            tail=node;
        }
        else{
            Node temp=head;
            int index=0;
            while(index<location-1){
                temp=temp.next;
                index++;
            }
            node.next=temp.next;
            temp.next=node;

        }

        size++;
    }

    public void traversal(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }

}
