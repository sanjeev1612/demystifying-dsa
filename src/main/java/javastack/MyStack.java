package javastack;

public class MyStack<T> implements StackAdt<T> {
  private T[] theStack;
  private int top;
  private int maxSize;

  public MyStack(int size) {
    this.maxSize = size;
    this.top = -1;
    this.theStack = (T[]) new Object[size];
  }

  public void push(T item) {
    if (isFull()) {
      throw new RuntimeException("stack is already full ");
    } else {
      top = top + 1;
      theStack[top] = item;
    }
  }

  public T pop() {
    if (isEmpty()) {
      throw new RuntimeException("stack is already empty ");
    } else {
      int previousTop = top;
      top = top - 1;
      return theStack[previousTop];
    }
  }

  public boolean isFull() {
    return top == maxSize - 1;
  }

  public boolean isEmpty() {
    return top == -1;
  }

  @Override
  public int size() {
   int top_=top;
    return top_+1;
  }
}
