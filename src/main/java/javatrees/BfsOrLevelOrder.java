package javatrees;

import java.util.LinkedList;
import java.util.Queue;

public class BfsOrLevelOrder {
  public static void traversal(Node node) {
    Queue<Node> queue = new LinkedList<>();
    queue.add(node);

    while (!queue.isEmpty()) {
      node = queue.remove();
      System.out.print(node.data + " ");

      if (node.left != null)
        queue.add(node.left);

      if (node.right != null)
        queue.add(node.right);

    }
  }
}
