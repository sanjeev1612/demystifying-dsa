package udemy_dsa_a2z.trees.self;

public class BinarySearchTree {
  Node root;

  BinarySearchTree() {
    root = null;
  }

  public void insertNode(Node root, int key) {
    this.root = insertHelper(root, key);
  }

  private Node insertHelper(Node root, int key) {
    if (root == null) {
      root = new Node(key);
      return root;
    } else if (key < root.key) {
      root.left = insertHelper(root.left, key);
    } else if (key > root.key) {
      root.right = insertHelper(root.right, key);
    }
    return root;
  }


  public static void main(String[] args) {

  }
}
