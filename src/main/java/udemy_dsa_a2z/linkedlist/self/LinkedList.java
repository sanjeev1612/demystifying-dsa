package udemy_dsa_a2z.linkedlist.self;

public class LinkedList {
  Node head;

  public static void printLinkedList(LinkedList ll) {
    Node current = ll.head;
    while (current != null) {
      System.out.print(" " + current.data);
      current = current.next;
    }
  }

  public static LinkedList insert(LinkedList ll, int data) {
    Node newNode = new Node(data);
    newNode.next = null;
    if (ll.head == null) {
      ll.head = newNode;
    } else {
      Node current = ll.head;
      while (current.next != null)
        current = current.next;
      current.next = newNode;
    }
    return ll;
  }

  public static LinkedList deleteByKey(LinkedList ll, int data) {
  Node currentNode= ll.head ; Node previousNode=null;
  if(currentNode !=null && currentNode.data ==data) { // deleting the head
    ll.head =currentNode.next ;
    System.out.println("Found & Deleted at Head Position");
    return ll;
  }
  while(currentNode !=null && currentNode.data !=data){ //  traversing the list
    previousNode = currentNode ;
    currentNode = currentNode.next;
  }
  if(currentNode !=null) {  // Found the element
    previousNode.next =currentNode.next;
    System.out.println("Found and Deleted");
  }
  if(currentNode == null) {
    System.out.println("Element not found in the list");
  }
    return ll;
}
  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    insert(ll, 1);
    insert(ll, 2);
    insert(ll, 3);
    insert(ll, 4);
    printLinkedList(ll);
    deleteByKey(ll, 2);
    deleteByKey(ll, 1);
    printLinkedList(ll);
  }
}
