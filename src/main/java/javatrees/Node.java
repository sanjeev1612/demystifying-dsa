package javatrees;

import java.util.Stack;

public class Node {
  String key;
  Node leftChild;
  Node rightChild;

  Node(String data) {
    this.key = data;
  }

  Node(String data, Node left, Node right) {
    this.key = data;
    this.leftChild = left;
    this.rightChild = right;
  }

  public void displayTree() {
    Node root = null;
    Stack globalStack = new Stack();
    globalStack.push(root);
    int nBlanks = 32;
    boolean isRowEmpty = false;
    System.out.println("......................................................");

    while (isRowEmpty == false) {
      Stack localStack = new Stack();
      isRowEmpty = true;
      for (int j = 0; j < nBlanks; j++) {
        System.out.print(" ");
      }

      while (globalStack.isEmpty() == false) {
        Node temp = (Node) globalStack.pop();
        if (temp != null) {
          System.out.print(temp.key);
          localStack.push(temp.leftChild);
          localStack.push(temp.rightChild);
          if (temp.leftChild != null || temp.rightChild != null) {
            isRowEmpty = false;
          }
        } else {
          System.out.print("--");
          localStack.push(null);
          localStack.push(null);
        }

        for (int j = 0; j < nBlanks * 2 - 2; j++) {
          System.out.print(" ");
        }
      }

      System.out.println();
      nBlanks = nBlanks / 2;

      while (localStack.isEmpty() == false)
        globalStack.push(localStack.pop());
    }
    System.out.println("......................................................");

  }
}
