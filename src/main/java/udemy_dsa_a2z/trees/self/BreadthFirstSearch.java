package udemy_dsa_a2z.trees.self;

import udemy_dsa_a2z.trees.self.Node;

public class BreadthFirstSearch {
  Node root;

  public BreadthFirstSearch() {
    root = null;
  }

  public void levelOrderTraversal() {
    int h = getTreeHeight(root);
    int i;
    for (i = 0; i < h; i++)
      printGivenLevel(root, i);
  }

  private void printGivenLevel(Node root, int i) {
    if(root == null)
      return;
    if (i==0)
      System.out.print(root.key +" ");
    else if(i>0)
    {
      printGivenLevel(root.left ,i-1);
      printGivenLevel(root.right ,i-1);
    }
  }

  private int getTreeHeight(Node root) {
    if (root == null)
      return 0;
    else return 1 + Math.max(getTreeHeight(root.left), getTreeHeight(root.right));
  }

  public static void main(String[] args) {
   BreadthFirstSearch tree = new BreadthFirstSearch();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);
    tree.root.right.left = new Node(6);
    tree.root.right.right = new Node(7);

    System.out.println("BFS traversal of tree is ");
    tree.levelOrderTraversal();
    System.out.println();
  }


}
