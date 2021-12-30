package javaqueue;

public class QueueTester {
  public static void main(String[] args) {
    QueueAdt<Integer> intQueue = new MyQueue<>(5);
    System.out.println("start of application ... size of queue is " + intQueue.size());

    intQueue.add(10);
    intQueue.add(20);
    intQueue.add(30);
    intQueue.add(40);
    intQueue.add(50);
    intQueue.add(99);
    intQueue.add(99);
    System.out.println("mid of application ... size of queue is " + intQueue.size());

    while (!intQueue.isEmpty()) {
      System.out.print(" " + intQueue.remove());
    }

    System.out.println("\n End of application ... size of queue is " + intQueue.size());

  }
}
