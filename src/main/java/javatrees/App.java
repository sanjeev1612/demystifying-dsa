package javatrees;

public class App {
  public static void main(String[] args) {
    Node sampleTree = sampleTree();

    System.out.println("******************* BFS Traversal ********************");
    BfsOrLevelOrder.traversal(sampleTree);

    System.out.println("\n\n\n\n******************* DFS Traversal ********************");
    Dfs.traversal(sampleTree);

  }


  public static Node sampleTree() {
    Node node = new Node("A",
            new Node("B",
                    new Node("C"), new Node("D")),
            new Node("E",
                    new Node("F"), new Node("G",
                    new Node("H"), null)));
    return node;
  }
}
