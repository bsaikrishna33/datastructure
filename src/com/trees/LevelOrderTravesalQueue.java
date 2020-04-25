package com.trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author sai krishna
 * @date 25-April-2020
 *
 */
public class LevelOrderTravesalQueue {

  Node root;

  /* Print nodes in level Order using queue */
  private void levelOrderPrint(Node node) {
    Queue<Node> queue = new LinkedList<>();
    queue.add(node);

    while (!queue.isEmpty()) {

      Node temp = queue.poll();

      System.out.println(" " + temp.data);

      if (temp.left != null) {
        queue.add(temp.left);
      }

      if (temp.right != null) {
        queue.add(temp.right);
      }
    }
  }

  public static void main(String[] args) {

    LevelOrderTravesalQueue tree = new LevelOrderTravesalQueue();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);

    tree.root.right.left = new Node(6);
    tree.root.right.right = new Node(7);

    tree.levelOrderPrint(tree.root);
  }
}
