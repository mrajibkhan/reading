package datastructure;

/**
 * Created by rajib.khan on 3/21/17.
 */
public class CyclicLinkedList {

    public static void main(String[] args) {

        System.out.print("Should return false for non-cyclic list: " + isCyclic(createLinkedList()));
        System.out.print("Should return true for cyclic list: " + isCyclic(createCyclicLinkedList()));


    }

    public static boolean isCyclic(Node head) {

        boolean hasCycle = false;
        if (head == null) {
            return hasCycle;
        }

        Node first = head;
        Node second = head;

        while(first != null && second != null) {
            first = first.next;

            if (second.next != null) {
                second = second.next.next;
            } else {
                break;
            }

            if (first.data == second.data) {
                hasCycle = true;
                break;
            }
        }

        System.out.println("First val = " + first.data);
        System.out.println("Second val = " + second.data);

        // find the start of cycle
        // http://stackoverflow.com/questions/2936213/explain-how-finding-cycle-start-node-in-cycle-linked-list-work
        if (hasCycle) {
            first = head;

            while (true) {
                first = first.next;
                second = second.next;

                if(first.data == second.data) {
                   break;
                }
            }

            System.out.println("Cycle Start Val = " + first.data);
        }

        return hasCycle;

    }


    public static Node createLinkedList() {
        Node head = new Node(1);

        Node item1 = new Node(2);
        head.setNext(item1);

        Node item2 = new Node(3);
        item1.setNext(item2);

        Node item3 = new Node(4);
        item2.setNext(item3);

        Node item4 = new Node(5);
        item3.setNext(item4);

        Node item5 = new Node(6);
        item4.setNext(item5);

        Node item6 = new Node(7);
        item5.setNext(item6);

        return head;

    }

    public static Node createCyclicLinkedList() {
        Node head = new Node(1);

        Node item1 = new Node(3);
        head.setNext(item1);

        Node item2 = new Node(5); // cycle start
        item1.setNext(item2);

        Node item3 = new Node(7);
        item2.setNext(item3);

        Node item4 = new Node(9);
        item3.setNext(item4);

        Node item5 = new Node(11);
        item4.setNext(item5);

        item5.setNext(item2);

        return head;

    }



}

