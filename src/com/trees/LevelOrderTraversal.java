package com.trees;

/**
 *
 * @author sai krishna
 * @date 24-April-2020
 *
 */
public class LevelOrderTraversal {

  Node root;

  private void levelOrder(Node node) {

    int treeHeight = getheight(node);

    for (int i = 1; i <= treeHeight; i++) {
      levelOrderPrint(node, i);
    }
  }

  private void levelOrderPrint(Node node, int level) {

    if (node == null) {
      return;
    }
    if (level == 1) {
      System.out.println(node.data);
    } else if (level > 1) {
      levelOrderPrint(node.left, level - 1);
      levelOrderPrint(node.right, level - 1);
    }

  }

  private int getheight(Node node) {

    if (node == null) {
      return 0;
    }

    int leftHeight = getheight(node.left);
    int rightHeight = getheight(node.right);

    return leftHeight > rightHeight ? (1 + leftHeight) : rightHeight + 1;
  }

  public static void main(String[] args) {

    LevelOrderTraversal tree = new LevelOrderTraversal();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);

    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);
    tree.root.right.left = new Node(6);
    tree.root.right.right = new Node(7);

    System.out.println("Height of the tree " + tree.getheight(tree.root));
    tree.levelOrder(tree.root);
  }

}
