package javadoublylinkedlist;

public class DoublyLinkedListApp {
  public static void main(String[] args) {

    DoublyLinkedList dll = new DoublyLinkedList();
    dll.addFirst(10);
    dll.addFirst(9);
    dll.addFirst(8);
    dll.addFirst(7);
    dll.addFirst(6);
    dll.addFirst(5);
    dll.addFirst(4);
    dll.printListFromFirst();
    dll.printListFromLast();
    dll.deleteFirst();
    dll.deleteLast();
    dll.printListFromFirst();
    dll.printListFromLast();
    dll.addLast(10);
    dll.addLast(11);
    dll.addLast(12);
    dll.printListFromFirst();
    dll.printListFromLast();
    dll.addFirst(10);
    dll.addLast(500);
    dll.printListFromFirst();
    dll.insertAfter(10,40);
    dll.insertAfter(40,20);
    dll.insertAfter(30,100);
    dll.printListFromFirst();
    dll.deleteKey(11);
    dll.deleteKey(500);
    dll.printListFromFirst();
  }
}
