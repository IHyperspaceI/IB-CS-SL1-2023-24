package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter16;

public class BinarySearchTree {
    private Node root;

    class Node {
        public Comparable data;
        public Node left;
        public Node right;

        public void addNode(Node newNode) {
            int value = newNode.data.compareTo(data);

            if (value < 0) {
                if (left == null) {
                    left = newNode;
                } else {
                    left.addNode(newNode);
                }
            } else if (value > 0) {
                if (right == null) {
                    right = newNode;
                } else {
                    right.addNode(newNode);
                }
            }
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

    public void remove(Comparable obj) {
        // Find the node to remove
        Node nodeToRemove = root;
        Node parentNode = null;
        boolean found = false;

        while (!found && nodeToRemove != null) {
            var value = nodeToRemove.data.compareTo(obj);

            if (value == 0) {
                found = true;
            } else {
                parentNode = nodeToRemove;

                if (value > 0) {
                    nodeToRemove = nodeToRemove.left;
                } else {
                    nodeToRemove = nodeToRemove.right;
                }
            }
        }

        if (!found) {
            return;
        }

        if (nodeToRemove.left == null || nodeToRemove.right == null) {
            Node newChild;

            if (nodeToRemove.left == null) {
                newChild = nodeToRemove.right;
            } else {
                newChild = nodeToRemove.left;
            }

            if (parentNode == null) {
                root = newChild;
            } else if (parentNode.left == nodeToRemove) {
                parentNode.left = newChild;
            } else {
                parentNode.right = newChild;
            }
        }

        Node smallestParent = nodeToRemove;
        Node smallest = nodeToRemove.right;

        if (smallest != null) {
            while (smallest.left != null) {
                smallestParent = smallest;
                smallest = smallestParent.left;
            }
        } else {
            smallest = nodeToRemove.left;
        }

        nodeToRemove.data = smallest.data;

        if (smallestParent == nodeToRemove) {
            smallestParent.right = smallest.right;
        } else {
            smallestParent.left = smallest.right;
        }
    }

    public boolean find(Comparable obj) {
        Node currentNode = root;

        while (currentNode != null) {
            var value = currentNode.data.compareTo(obj);

            if (value == 0) {
                return true;
            } else if (value > 0) {
                currentNode = currentNode.left;
            } else {
                currentNode = currentNode.right;
            }
        }

        return false;
    }
}
