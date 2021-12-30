package javadoublylinkedlist;

public class DoublyLinkedList {
  private Node first;
  private Node last;

  public boolean isEmpty() {
    return first == null;
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
    return temp;
  }
}
