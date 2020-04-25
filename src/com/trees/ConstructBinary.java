package com.trees;

/**
*
* @author sai krishna
* @date 24-April-2020
*
*/

class Index {
  int index;
}

public class ConstructBinary {

  Node root;

  /* Build Binary Tree */
  private Node buildTree(int in[], int post[], int str, int end, Index index) {

    if (str > end) {
      return null;
    }

    Node node = new Node(post[index.index]);
    (index.index)--;

    if (str == end)
      return node;

    int rootPos = findRootinInOrder(in, str, end, node.data);

    node.right = buildTree(in, post, rootPos + 1, end, index);
    node.left = buildTree(in, post, str, rootPos - 1, index);
    return node;

  }

  /* Print tree in pre order */
  void preOrder(Node node) {
    if (node == null)
      return;
    System.out.print(node.data + " ");
    preOrder(node.left);
    preOrder(node.right);
  }

  /* find root in inOrder */
  private int findRootinInOrder(int in[], int str, int end, int val) {
    int i;
    for (i = str; i <= end; i++) {
      if (in[i] == val)
        break;
    }
    return i;
  }

  public static void main(String[] args) {

    int in[] = new int[] { 4, 8, 2, 5, 1, 6, 3, 7 };
    int post[] = new int[] { 8, 4, 5, 2, 6, 7, 3, 1 };

    int n = post.length;

    ConstructBinary tree = new ConstructBinary();
    Index index = new Index();
    index.index = n - 1;
    Node root = tree.buildTree(in, post, 0, n - 1, index);
    tree.preOrder(root);
  }
}
