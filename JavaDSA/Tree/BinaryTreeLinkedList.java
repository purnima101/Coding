package JavaDSA.Tree;

import java.util.*;

public class BinaryTreeLinkedList {
    public BinaryNode root;

    public BinaryTreeLinkedList() {
        this.root = null;
    }

    void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.value + "");
        preOrder(node.left);
        preOrder(node.right);
    }

    void postOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value + "");
    }

    void inOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.println(node.value + "");
        inOrder(node.right);
    }

    void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode node = queue.remove();
            System.out.println(node.value + " ");
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }

    }

    // Search

    public void Search(String value) {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode node = queue.remove();
            if (node.value == value) {
                System.out.println(node.value + "Found ");
                return;
            } else {
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }

        System.out.println(" Not Found ");
    }

    // insert

    void Insert(String value) {
        BinaryNode node = new BinaryNode();
        node.value = value;
        if (root == null) {
            root = node;
            System.out.println(" Inserted new node at root");
            return;
        } else {
            Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
            queue.add(root);
            while (!queue.isEmpty()) {
                BinaryNode newNode = queue.remove();

                if (newNode.left == null) {
                    newNode.left = node;
                    // queue.add(newNode.left);
                    System.out.println("added");
                    break;
                } else if (newNode.right == null) {
                    newNode.right = node;
                    // queue.add(newNode.left);
                    System.out.println("added");
                    break;
                } else {
                    queue.add(newNode.left);
                    queue.add(newNode.right);
                }

            }
        }
    }

    // delete

    // get deepest node

    public BinaryNode getAndDeleteDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode presntNode = null;
        BinaryNode previousNode = null;
        while (!queue.isEmpty()) {
            previousNode = presntNode;
            presntNode = queue.remove();

            if (presntNode.left != null) {
                queue.add(presntNode.left);
            }
            if (presntNode.right != null) {
                queue.add(presntNode.right);
            }
        }
        return previousNode;
    }

}
