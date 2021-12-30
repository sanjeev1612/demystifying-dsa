package javaqueue;

public interface QueueAdt<T> {
  void add(T item);

  T remove();

  boolean isFull();

  boolean isEmpty();

  int size();
}
