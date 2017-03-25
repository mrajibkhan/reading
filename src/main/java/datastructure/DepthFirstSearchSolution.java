package datastructure;

/**
 * Created by rajib.khan on 3/22/17.
 */

import java.util.*;
import java.util.Stack;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


/*
 * To execute Java, please define "static void main" on a class
 * named BreadthFirstSearchSolution.
 *
 * If you need more classes, simply define them inline.
 */


/**
 *                               (one)
 *                             /       \
 *                       (two)          (three)
 *                       /    \            /    \
 *                  (four)    (five)    (six)   (seven)
 *                             /
 *                           (eight)
 */

public class DepthFirstSearchSolution {

    public DepthFirstSearchSolution(){}

    public class Node {
        Object data;
        Node leftNode;

        Node rightNode;

        public Node(Object data) {
            this.data = data;
        }

        public void setLeftNode(Node leftNode) {

            this.leftNode = leftNode;
        }

        public void setRightNode(Node rightNode) {

            this.rightNode = rightNode;
        }

    }

    public class BreadthFirstSearch {



        public boolean search(Node startNode, Node searchNode) {


            ArrayList visited = new ArrayList();

            if(startNode == null || searchNode == null) {

                return false;
            } else if (startNode.equals(searchNode)) {
                return true;
            }

            System.out.println("Start -> " + startNode.data + ", Search -> " + searchNode.data);

            // put the node in queue
            java.util.Stack <Node> s = new Stack<Node>();
            s.push(startNode);

            Node currentNode;
            while(!s.isEmpty()){
                currentNode = s.pop();
                visited.add((String)currentNode.data);

                if (currentNode.equals(searchNode)) {
                    System.out.println("Visited nodes: " + visited);
                    return true;
                }

                if(currentNode.leftNode != null) {
                    s.add(currentNode.leftNode);
                }

                if(currentNode.rightNode != null) {
                    s.add(currentNode.rightNode);
                }



            }


            System.out.println("Visited nodes: " + visited);

            return false;

        }

    }


    public static void main(String[] args) throws Exception {

        DepthFirstSearchSolution s = new DepthFirstSearchSolution();
        Node node1 = s.new Node("one");

        Node node2 = s.new Node("two");

        Node node3 = s.new Node("three");

        Node node4 = s.new Node("four");

        Node node5 = s.new Node("five");

        Node node6 = s.new Node("six");

        Node node7 = s.new Node("seven");
        Node node8 = s.new Node("eight");

        node1.setLeftNode(node2);
        node1.setRightNode(node3);

        node2.setLeftNode(node4);
        node2.setRightNode(node5);

        node3.setLeftNode(node6);
        node3.setRightNode(node7);

        node5.setLeftNode(node8);


        BreadthFirstSearch bfs = s.new BreadthFirstSearch();

        // startNode is null
        boolean isFound = bfs.search(null, node2);
        assertThat(isFound, is(false));

        // searchNode is null
        isFound = bfs.search(node2, null);
        assertThat(isFound, is(false));

        // startNode and searchNode is same
        isFound = bfs.search(node2, node2);
        assertThat(isFound, is(true));


        // startNode is node1, searchNode is node6
        isFound = bfs.search(node1, node6);
        assertThat("should find node6", isFound, is(true));


        // startNode is node2, searchNode is node7
        isFound = bfs.search(node2, node7);
        assertThat("should not find node7 when starts from node2", isFound, is(false));

    }





}

