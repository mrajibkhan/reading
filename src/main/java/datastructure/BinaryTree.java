package datastructure;

import java.util.Collections;
import java.util.Arrays;

/**
 * Created by rajib.khan on 3/20/17.
 */
public class BinaryTree {

    Node root = null;

    public BinaryTree() {

    }

    public static BinaryTree fromArray(Integer[] array) {

        Collections.sort(Arrays.asList(array));

        BinaryTree bt = new BinaryTree();

        bt.setRoot(bt.fromArray(array, 0, array.length -1));

        return bt;

    }

    private Node fromArray(Integer[] array, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (end + start)/2;
        Node currentNode = new Node(array[mid]);
        currentNode.setLeft(fromArray(array, start, mid -1));
        currentNode.setRight(fromArray(array, mid + 1, end));

        return currentNode;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return this.root;
    }


    public void dusplay() {

        if (this.root != null) {
            displayNode(root);
        }
    }

    private void displayNode (Node currentNode) {

        System.out.println("( " + ((currentNode.data != null) ? currentNode.data.toString() : " N/A ") + " )" );

        if (currentNode.getLeft() != null) {
            System.out.println("left of " + currentNode.data + "-> ");
            displayNode(currentNode.getLeft());
        }


        if (currentNode.getRight() != null) {
            System.out.println("right of " + currentNode.data + " -> ");
            displayNode(currentNode.getRight());
        }

    }

    public void print(Node root, int k) {
        if (root != null) {
            if (k == 0) {
                System.out.print(" " + root.data);
            }
            print(root.getLeft(), --k);
            print(root.getRight(), k);
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = BinaryTree.fromArray(new Integer[] {1,2,3,4,5,6,7,8,9,10, 14, 13});
        bt.dusplay();

        bt.print(bt.root, 1);
        System.out.println("");
        bt.print(bt.root, 2);
        System.out.println("");
        bt.print(bt.root, 3);
    }

}
