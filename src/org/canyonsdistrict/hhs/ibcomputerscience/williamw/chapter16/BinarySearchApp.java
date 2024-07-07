package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter16;

public class BinarySearchApp {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(100);
        tree.add(80);
        tree.add(-1);
        System.out.println();
        tree.remove(80);
    }
}
