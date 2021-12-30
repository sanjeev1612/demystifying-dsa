package javaqueue;

public class MyQueue<T> implements QueueAdt<T> {
  private int maxSize;
  private int front;
  private int rear;
  private T[] theQueue;
  public int noOfItems;

  public MyQueue(int noOfItems) {
    this.maxSize = noOfItems;
    this.front = 0;
    this.rear = -1;
    this.noOfItems = 0;
    this.theQueue = (T[]) new Object[noOfItems];
  }

  @Override
  public void add(T item) {
    if (rear == maxSize - 1) {
      rear = -1;
    }
    rear++;
    theQueue[rear] = item;
    if (noOfItems <= maxSize - 1) {
      noOfItems++;
    }

  }

  @Override
  public T remove() {
    if (!isEmpty()) {
      T elem = theQueue[front];
      front++;
      noOfItems--;
      return elem;
    } else {
      throw new RuntimeException("Queue is empty ....");
    }
  }

  @Override
  public boolean isFull() {
    return noOfItems == maxSize;
  }

  @Override
  public boolean isEmpty() {
    return noOfItems == 0;
  }

  @Override
  public int size() {
    return noOfItems;
  }
}
