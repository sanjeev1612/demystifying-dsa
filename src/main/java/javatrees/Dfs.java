package javatrees;

public class Dfs {

  public static void traversal(Node node) {
    if (node == null) {
      return;
    }

    System.out.print(node.data + " ");
    traversal(node.left);
    traversal(node.right);

  }
}
