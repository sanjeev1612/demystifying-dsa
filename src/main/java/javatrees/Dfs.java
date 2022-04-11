package javatrees;

public class Dfs {

  public static void traversal(Node node) {

    if (node == null) {
      return;
    }
    System.out.print(node.key + " ");
    traversal(node.leftChild);
    traversal(node.rightChild);

  }
}
