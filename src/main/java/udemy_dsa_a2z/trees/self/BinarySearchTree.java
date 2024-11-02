package udemy_dsa_a2z.trees.self;

public class BinarySearchTree {
  Node root;

  public BinarySearchTree() {
    this.root = null;
  }

  /*
Let us create following BST

8
/ \
4 12
/ \ / \
1 7 9 14

*/
  void insertNode(int key) {
    root = insertNodeHelper(root, key);
  }

  private Node insertNodeHelper(Node root, int key) {
    if (root == null) {
      root = new Node(key);
      return root;
    }
    if (key < root.key)
      root.left = insertNodeHelper(root.left, key);
    else if (key > root.key)
      root.right = insertNodeHelper(root.right, key);

    return root;
  }

  void preOrder(Node root) {
    preOrderHelper(root);
  }

  private void preOrderHelper(Node root) {
    if (root != null) {
      System.out.println(root.key);
      preOrderHelper(root.left);
      preOrderHelper(root.right);
    }
  }

  void inorder() {
    inorderHelper(root);
  }

  private void inorderHelper(Node root) {
    if (root != null) {
      inorderHelper(root.left);
      System.out.println(root.key);
      inorderHelper(root.right);
    }
  }

  void postOrder(Node root) {
    postOrderHelper(root);
  }

  private void postOrderHelper(Node root) {
    if (root != null) {
      postOrderHelper(root.left);
      postOrderHelper(root.right);
      System.out.println(root.key);
    }
  }

  void deleteKey(int key) {
    root = deleteNode(root, key);
  }

  /*
     8
   /   \
  4    12
 / \   / \
 1 7   9 14

*/
  private Node deleteNode(Node root, int key) {
    if (root == null) {
      return null;
    } else if (key < root.key) {
      root.left = deleteNode(root.left, key);
    } else if (key > root.key) {
      root.right = deleteNode(root.right, key);
    } else {
      if (root.left == null && root.right == null)
        return null;
      else if (root.left == null)
        return root.right;
      else if (root.right == null)
        return root.left;
      else {
        int minValue = minValue(root.right);
        root.key = minValue;
        root.right = deleteNode(root.right, minValue);
      }
    }
    return root;
  }

  int minValue(Node root) {
    int minValue = root.key;
    while (root.left != null) {
      minValue = root.left.key;
      root = root.left;
    }
    return minValue;
  }

  public Node search(Node root, int key) {
    if (root == null || root.key == key)
      return root;
    else if (key < root.key)
      return search(root.left, key);
    return search(root.right, key);
  }

  public static void main(String[] args) {
    BinarySearchTree tree = new BinarySearchTree();

 /*

 Let us create following BST
     8
   /   \
  4    12
 / \   / \
 1 7   9 14

 */
    tree.insertNode(8);
    tree.insertNode(4);
    tree.insertNode(1);
    tree.insertNode(7);
    tree.insertNode(12);
    tree.insertNode(9);
    tree.insertNode(14);
    System.out.println("Data you are looking for :: " +
            tree.search(tree.root, 1).key);
    tree.inorder();
    System.out.println("------------------");
    tree.deleteKey(12);
    tree.inorder();
  }
}


