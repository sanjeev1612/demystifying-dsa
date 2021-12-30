package javalinkedlist;

public class LinkListApp {
  public static void main(String[] args) {

    MyLinkedList ll =new MyLinkedList();

    ll.addToStart(10);
    ll.addToStart(20);
    ll.addToStart(30);
    ll.addToStart(40);
    System.out.println("\n############################# ITERATION 1 ########################");

    ll.printList(ll.head);

    System.out.println("\nsize of list is "+ll.size);
    System.out.println("head data is "+ ll.head.data);
    System.out.println("tail data is "+ ll.tail.data);


    System.out.println("\n############################# ITERATION 2 ########################");
    ll.addToEnd(45);
    ll.addToEnd(55);

    System.out.println("\nsize of list is "+ll.size);
    System.out.println("head data is "+ ll.head.data);
    System.out.println("tail data is "+ ll.tail.data);
    ll.printList(ll.head);

    ll.addToStart(100);
    ll.addToStart(200);
    ll.addToStart(300);
    System.out.println("\n############################# ITERATION 3 ########################");
    ll.printList(ll.head);

    System.out.println("\nsize of list is "+ll.size);
    System.out.println("head data is "+ ll.head.data);
    System.out.println("tail data is "+ ll.tail.data);


    ll.deleteFirst();
    System.out.println("\n############################# ITERATION 4  ########################");
    ll.printList(ll.head);

    System.out.println("\nsize of list is "+ll.size);
    System.out.println("head data is "+ ll.head.data);
    System.out.println("tail data is "+ ll.tail.data);

    ll.deleteLast();
    ll.deleteLast();
    ll.deleteLast();
    System.out.println("\n############################# ITERATION 5  ########################");
    ll.printList(ll.head);

    System.out.println("\nsize of list is "+ll.size);
    System.out.println("head data is "+ ll.head.data);
    System.out.println("tail data is "+ ll.tail.data);

    ll.reverse();
    System.out.println("\n############################# ITERATION 6  ########################");
    ll.printList(ll.head);

    System.out.println("\nsize of list is "+ll.size);
    System.out.println("head data is "+ ll.head.data);
    System.out.println("tail data is "+ ll.tail.data);

    ll.findNodePresentInLinkedList(500);
    ll.findNodePresentInLinkedList(40);
    ll.addAfterNode(40);
    ll.printList(ll.head);

  }
  }