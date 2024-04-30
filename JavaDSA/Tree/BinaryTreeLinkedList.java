package JavaDSA.Tree;
import java.util.*;
public class BinaryTreeLinkedList {
    public BinaryNode root;
    public BinaryTreeLinkedList(){
        this.root = null;
    }

    void preOrder(BinaryNode node) {
        if(node==null){
            return;
        }
        System.out.println(node.value+"");
        preOrder(node.left);
        preOrder(node.right);
    }

    void postOrder(BinaryNode node) {
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value+"");
    }

    void inOrder(BinaryNode node) {
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.value+"");
        inOrder(node.right);
    }

    void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        
    }

}
