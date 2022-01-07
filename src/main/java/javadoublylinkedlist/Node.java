package javadoublylinkedlist;

public class Node {
   int data ;
   Node next ;
   Node previous;

   @Override
   public String toString() {
      return "Node{" +
              "data=" + data +
              ", next=" + next +
              ", previous=" + previous +
              '}';
   }
}
