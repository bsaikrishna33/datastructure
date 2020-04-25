package com.trees;

/**
 *
 * @author sai krishna
 * @date 24-April-2020
 *
 */
public class MirrorTree {

  Node root;

  private void mirrorTree(Node node) {

    if (node != null) {
      mirrorTree(node.left);
      mirrorTree(node.right);
      Node temp;
      temp = node.left;
      node.left = node.right;
      node.right = temp;
    }

  }

  private void preOrder(Node node) {

    if (node != null) {
      System.out.println(node.data);
      preOrder(node.left);
      preOrder(node.right);
    }

  }

  public static void main(String[] args) {

    MirrorTree tree = new MirrorTree();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);

    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);
    tree.root.right.left = new Node(6);
    tree.root.right.right = new Node(7);

    tree.preOrder(tree.root);

    tree.mirrorTree(tree.root);

    tree.preOrder(tree.root);
  }
}
