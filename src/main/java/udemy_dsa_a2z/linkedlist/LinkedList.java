package udemy_dsa_a2z.linkedlist;

public class LinkedList {
  Node head;

  public static LinkedList insert(LinkedList list, int data) {
    Node newNode = new Node(data);
    newNode.next = null;
    if (list.head == null) {
      list.head = newNode;
    } else {
      Node lastNode = list.head;
      while (lastNode.next != null) {
        lastNode = lastNode.next;
      }
      lastNode.next = newNode;
    }
    return list;
  }

  public static LinkedList deleteByKey(LinkedList list, int key) {
    System.out.println();
    System.out.println("Delete Element " + key + " from Linked List ");
    Node currentNode = list.head, previousNode = null;
    if (currentNode != null && currentNode.data == key) {
      list.head = currentNode.next;
      System.out.println(key + " found and deleted");
      return list;
    }
    while (currentNode != null && currentNode.data != key) {
      previousNode = currentNode;
      currentNode = currentNode.next;
    }
    if (currentNode != null) {
      previousNode.next = currentNode.next;
      System.out.println(key + " found and deleted");
    }
    if (currentNode == null) {
      System.out.println(key + " not found");
    }
    return list;
  }

  public static void printList(LinkedList list) {
    Node currentNode = list.head;
    System.out.print("Linked List Elements: ");
    while (currentNode != null) {
      System.out.print(currentNode.data + " ");
      currentNode = currentNode.next;
    }
  }

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list = insert(list, 4);
    list = insert(list, 1);
    list = insert(list, 3);
    list = insert(list, 8);
    printList(list);
    deleteByKey(list, 1);
    printList(list);
  }
}