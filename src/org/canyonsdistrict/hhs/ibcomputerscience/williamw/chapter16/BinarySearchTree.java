package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter16;

public class BinarySearchTree {
    private Node root;

    class Node {
        public Comparable data;
        public Node left;
        public Node right;

        public addNode(Node newNode) {
            //TODO implement DEEZ NUTZ
        }
    }

    public void add(Comparable object) {
        var newNode = new Node();
        newNode.data = object;
        newNode.left = null;
        newNode.right = null;

        if (root == null) {
            root = newNode;
        } else {
            root.addNode(newNode);
        }
    }
}
