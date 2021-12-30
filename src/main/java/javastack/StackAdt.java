package javastack;

public interface StackAdt<T> {
  void push(T item);

  T pop();

  boolean isFull();

  boolean isEmpty();

  int size();
}
