package javadoublylinkedlist;

public class DoublyLinkedList {
  private Node first;
  private Node last;

  public boolean isEmpty() {
    return first == null;
  }

  DoublyLinkedList() {
    this.first = null;
    this.last = null;
  }

  public void addFirst(int data) {
    Node node = new Node();
    node.data = data;

    if (isEmpty()) {
      last = node;
    } else {
      first.previous = node;
    }
    node.next = first;
    this.first = node;
  }

  public void addLast(int data) {
    Node newNode = new Node();
    newNode.data = data;
    if (isEmpty()) {
      first = newNode;
    } else {
      last.next = newNode;
      newNode.previous = last;
    }
    this.last = newNode;

  }

  // assuming non-empty list
  public Node deleteFirst() {
    Node temp = first;
    if (first.next == null) {
      last = null;
    } else {
      first.next.previous = null;
    }
    first = first.next;
    return temp;
  }

  // assuming non-empty list
  public Node deleteLast() {
    Node temp = last;
    if (first.next == null) {
      first = null;
    } else {
      last.previous.next = null;
    }
    last = last.previous;

    return temp;
  }

  // assuming non-empty list

  public boolean insertAfter(int key, int newData) {
    Node current = first;
    Node newNode = new Node();
    newNode.data = newData;

    while (current.data != key) {
      current = current.next;
      if (current == null) {
        System.out.println("\nInsertion not done... reached end of the list without finding the key " + key + "\n");
        return false;
      }
    }

    if (current == last) {
      current.next = null;
      last = newNode;
    } else {
      current.next.previous = newNode;
      newNode.next = current.next;
    }

    newNode.previous = current;
    current.next = newNode;

    return true;
  }

  public boolean deleteKey(int key) {
    Node current = first;

    while (current.data != key) {
      current = current.next;
      if (current == null) {
        System.out.println("\nDeletion not done..." +
                " reached end of the list without finding the key " + key + "\n");
        return false;
      }
    }

    if (current == last) {
      last = current.previous;
    } else {
      current.next.previous = current.previous;

    }

    if (current == first) {
      first = current.next;
    } else {
      current.previous.next = current.next;
    }

    return true;
  }

  public void printListFromFirst() {
    Node current = first;
    System.out.println("********* Forward Printing ********");
    while (current != null) {
      System.out.print(" " + current.data);
      current = current.next;
    }
    System.out.println();
  }

  public void printListFromLast() {
    Node current = last;
    System.out.println("********* Backward Printing ********");
    while (current != null) {
      System.out.print(" " + current.data);
      current = current.previous;
    }
    System.out.println();
  }
}
