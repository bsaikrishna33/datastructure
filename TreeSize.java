package com.trees;

/**
 *
 * @author sai krishna
 * @date 23-April-2020
 *
 */

class Node {
  int data;
  Node left;
  Node right;

  Node(int data) {
    this.data = data;
    left = null;
    right = null;
  }
}

public class TreeSize {

  Node root;

  /* Method to find number of nodes */
  public int size(Node node) {

    if (node != null) {
      return 1 + size(node.left) + size(node.right);
    }
    return 0;
  }

  public static void main(String[] args) {

    TreeSize tree = new TreeSize();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);

    System.out.println("Size of tree " + tree.size(tree.root));
  }
}
