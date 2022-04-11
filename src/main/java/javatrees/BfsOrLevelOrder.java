package javatrees;

import java.util.LinkedList;
import java.util.Queue;

public class BfsOrLevelOrder {
  public static void traversal(Node node) {
    Queue<Node> queue = new LinkedList<>();
    queue.add(node);

    while (!queue.isEmpty()) {
      node = queue.remove();
      System.out.print(node.key + " ");

      if (node.leftChild != null)
        queue.add(node.leftChild);

      if (node.rightChild != null)
        queue.add(node.rightChild);

    }
  }
}
