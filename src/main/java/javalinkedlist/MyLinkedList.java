package javalinkedlist;

class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    next = null;
  }
}

public class MyLinkedList {
  public Node head;
  public Node tail;
  public int size;

  MyLinkedList() {
    this.head = null;
    this.tail = null;
  }

  public void addToStart(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      tail = newNode;
    } else {
      Node temp = head;
      head = newNode;
      head.next = temp;
    }
    size++;
  }

  public void addToEnd(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      tail = newNode;
    } else {
      Node temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = newNode;
      tail = newNode;
    }
    size++;
  }

  public void printList(final Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }

  public boolean deleteFirst() {
    if (head == null) {
      throw new UnsupportedOperationException("List is Empty");
    } else {
      head = head.next;
      size--;
      return true;
    }
  }

  public boolean deleteLast() {
    if (head == null) {
      throw new UnsupportedOperationException("List is Empty");
    } else {
      Node temp = head;
      Node prev = head;
      while (temp.next != null) {
        prev = temp;
        temp = temp.next;
      }
      tail = prev;
      prev.next = null;
      size--;
      return true;
    }
  }

  public void reverse() {
   if(head == null) {
     throw new UnsupportedOperationException("List is Empty");
   } {
     Node prev =null;
     Node current =head;
     Node next ;
     Node newTail =head;

     while(current !=null) {
   next =current.next;
   current.next =prev;
   prev=current;
   current=next;
     }
     tail= newTail;
     head= prev;
    }
  }

  public boolean findNodePresentInLinkedList(int data) {
    if (head == null) {
      throw new UnsupportedOperationException("List is empty ");
    } else {
      Node current = head;
      int position = 1;

      while (current != null) {
        if (current.data == data) {
          System.out.format("Node %d Found at place %d", data, position);
          return true;
        }
        position++;
        current = current.next;
      }
    }
    System.out.println(String.format("Node %d not Found in the list ", data));
    return false;
  }
}
