package datastructure;

/**
 * Created by rajib.khan on 3/19/17.
 */
public class Node {
    Node next = null;
    Node prev = null;
    Object data;

    Node(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    // getter and setter below used for binary tree impl
    public Node getRight() {
        return next;
    }

    public void setRight(Node next) {
        this.next = next;
    }

    public Node getLeft() {
        return prev;
    }

    public void setLeft(Node prev) {
        this.prev = prev;
    }
}
