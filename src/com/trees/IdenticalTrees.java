package com.trees;

/**
 *
 * @author sai krishna
 * @date 24-April-2020
 *
 */

public class IdenticalTrees {
  Node root;

  /* Recursive method to check two trees are identical or not */
  Boolean checkIdenticalTrees(Node node1, Node node2) {
    if (node1 == null && node2 == null) {
      return true;
    }

    if (node1 != null && node2 != null) {
      return (node1.data == node2.data && checkIdenticalTrees(node1.left, node2.left)
          && checkIdenticalTrees(node1.right, node2.right));
    }
    return false;
  }

  public static void main(String[] args) {
    IdenticalTrees tree = new IdenticalTrees();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);

    IdenticalTrees tree2 = new IdenticalTrees();
    tree2.root = new Node(1);
    tree2.root.left = new Node(2);
    tree2.root.right = new Node(3);
    tree2.root.left.left = new Node(4);
    tree2.root.left.right = new Node(7);

    System.out.println("Two trees are Identical ? " + tree.checkIdenticalTrees(tree.root, tree2.root));
  }
}
