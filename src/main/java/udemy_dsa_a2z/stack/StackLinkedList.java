package udemy_dsa_a2z.stack;

public class StackLinkedList {
  private static Node first = null;
  static StackLinkedList list = new StackLinkedList();

  public static void push(int data) {
    Node newNode = new Node(data);
    newNode.next = first;
    first = newNode;
  }

  public static void pop() {
    Node temp = first;
    first = first.next;
    System.out.println("Removed element Elements: " + temp.data);
  }

  public static void printList(StackLinkedList list) {
    Node currentNode = list.first;
    System.out.print("Linked List Elements: ");
    while (currentNode != null) {
      System.out.print(currentNode.data + " ");
      currentNode = currentNode.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    list.push(4);
    list.push(6);
    list.push(1);
    printList(list);
    list.pop();
    printList(list);
  }
}